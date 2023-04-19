package com.freightFox.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightFox.exception.SellerException;
import com.freightFox.model.Buyer;
import com.freightFox.model.Seller;
import com.freightFox.repository.SellerRepository;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PdfServiceImpl implements PdfService {

	@Autowired
	private SellerRepository sellerRepo;

	@Override
	public ByteArrayInputStream createPdfBySellerId(Integer sellerId) throws SellerException {
		
		Seller seller = sellerRepo.findById(sellerId).get();
		
		if (seller == null) {
			throw new SellerException("No seller is found with this seller id !");
		}
		
		List<Buyer> buyers = seller.getBuyers();
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		Document document = new Document();
		
		PdfWriter.getInstance(document, output);
		document.open();
		
		Paragraph sellerData = new Paragraph("Seller :\n"
		+ seller.getSellerName() 
		+"\n"
		+ seller.getAddress().getState() 
		+", "
		+ seller.getAddress().getCountry()
		+"\n"
		+"GSTIN : "+ seller.getSellerGstin());
		
		document.add(sellerData);

		int n = seller.getBuyers().size();
		
		for (int i=0; i<n; i++) {
			
			Paragraph buyerData = new Paragraph("Buyer :\n" 
					+buyers.get(0).getBuyerName() 
					+"\n"
					+buyers.get(i).getAddress().getState()
					+", "
					+buyers.get(i).getAddress().getCountry()
					+"\n"
					+"GSTIN : "+ buyers.get(i).getBuyerGstin()
					+"\n"
					+buyers.get(i).getItems());
			
			document.add(buyerData);
		}

		document.close();
		
		return new ByteArrayInputStream(output.toByteArray());
	}

}
