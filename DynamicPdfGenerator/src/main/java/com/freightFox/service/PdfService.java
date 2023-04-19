package com.freightFox.service;

import java.io.ByteArrayInputStream;

import com.freightFox.exception.SellerException;

public interface PdfService {

	public ByteArrayInputStream createPdfBySellerId(Integer sellerId) throws SellerException;
}
