package com.cloud_demo.cloud_demo.controle;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud_demo.cloud_demo.model.BianAccountOpeningRequest;
import com.cloud_demo.cloud_demo.model.BianCustomerRequest;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class BianAccountOpeningController {
	
	@Autowired
	private CloudantClient client;
	private Database db;
	
	@PostMapping("/createAccount")
	public @ResponseBody String createEmployee(@RequestBody BianAccountOpeningRequest employee) {
		db = client.database("fundtransfer", false);
		System.out.println(" fundtransfer " + employee);
		Response r = null;
		if (employee != null) {
			r = db.post(employee);
		}
		return r.getId();
	}
	
	
	@GetMapping("/accountDetails")
	public @ResponseBody List<BianAccountOpeningRequest> getAll() throws IOException {
		db = client.database("fundtransfer", false);
		List<BianAccountOpeningRequest> allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(BianAccountOpeningRequest.class);
		System.out.println("Get fundtransfer List " + allDocs);
		return allDocs;
	}
	
	@GetMapping("/accountDetailsById/{id}")
	public ResponseEntity<BianAccountOpeningRequest> getById(@PathVariable String id) throws IOException {
			db = client.database("fundtransfer", false);
			BianAccountOpeningRequest request = db.find(BianAccountOpeningRequest.class, id);
			System.out.println("Account Details =====> "+request);
			return ResponseEntity.ok(request);
	}
	
	@GetMapping("/customerDetailsById/{id}")
	public ResponseEntity<BianCustomerRequest> getCustomerById(@PathVariable String id) throws IOException {
			db = client.database("customers", false);
			BianCustomerRequest request = db.find(BianCustomerRequest.class, id);
			System.out.println("Customer Details =====> "+request);
			return ResponseEntity.ok(request);
	}

}
