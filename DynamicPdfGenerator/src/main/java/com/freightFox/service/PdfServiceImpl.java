package com.freightFox.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightFox.model.Buyer;
import com.freightFox.model.Seller;
import com.freightFox.repository.BuyerRepository;
import com.freightFox.repository.SellerRepository;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PdfServiceImpl implements PdfService {

	private Logger logger = LoggerFactory.getLogger(PdfServiceImpl.class);
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@Autowired
	private BuyerRepository buyerRepo;
	
	public ByteArrayInputStream createPdfBySellerId(Integer sellerId) {
		Seller seller = sellerRepo.findById(sellerId).get();
		List<Buyer> buyers = seller.getBuyers();
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		Document document = new Document();
		PdfWriter.getInstance(document, output);
		document.open();
		Paragraph sellerData = new Paragraph(seller.getSellerName());
		document.add(sellerData);
		
		Paragraph buyerData = new Paragraph(buyers.get(0).getBuyerName());
		document.add(buyerData);
		
		document.close();
		return new ByteArrayInputStream(output.toByteArray());
	}
	
	@Override
	public ByteArrayInputStream createPdf() {
		// TODO Auto-generated method stub
		logger.info("creted pdf initiated..");
		String title = "Welcome";
		String content = "some random info !";
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		Document document = new Document();
		PdfWriter.getInstance(document, output);
		document.open();
		Paragraph paragraph = new Paragraph(title);
		document.add(paragraph);
		Paragraph contentPara = new Paragraph(content);
		document.add(contentPara);
		document.close();
		
		return new ByteArrayInputStream(output.toByteArray());
	}

}
