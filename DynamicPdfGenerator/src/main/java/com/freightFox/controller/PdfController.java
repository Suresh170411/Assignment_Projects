package com.freightFox.controller;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freightFox.service.PdfServiceImpl;

@RestController
public class PdfController {

	@Autowired
	private PdfServiceImpl pdfService;
	
	@GetMapping("/pdf/{sellerId}")
	public ResponseEntity<InputStreamResource> createPdfHandler(@PathVariable ("sellerId") Integer sellerId) {
		
		ByteArrayInputStream pdf = pdfService.createPdfBySellerId(sellerId);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		
		httpHeaders.add("Content-Disposition", "inline; file = FreightFox.pdf");
		
		return ResponseEntity
				.ok()
				.headers(httpHeaders)
				.contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(pdf));
		
	}
}
