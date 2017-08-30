package com.opensource.kagazi.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.kagazi.service.CoreService;
import com.opensource.kagazi.to.ResponseTO;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "kagazi/core")
public class CoreController {

	static final Logger LOGGER = Logger.getLogger(CoreController.class);

	@Autowired
	CoreService coreservice;

	@ApiOperation(value = "Master data for the government documents", notes = "Returns the master data listing for the kagzi app")
	@RequestMapping(value = "/kagazi-mst", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseTO> kagaziMst() {
		LOGGER.info("CoreController /testAPI Method starts...");
		return new ResponseEntity<ResponseTO>(coreservice.kagazimst(), HttpStatus.OK);
	}

}