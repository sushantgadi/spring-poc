package com.opensource.kagazi.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.kagazi.service.CoreService;
import com.opensource.kagazi.to.ResponseTO;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "kagazi/core")
@CrossOrigin(origins = {"http://localhost:4200","https://kagazi.000webhostapp.com","http://kagazi.in"}, maxAge = 3600)
public class CoreController {

	static final Logger LOGGER = Logger.getLogger(CoreController.class);

	@Autowired
	CoreService coreservice;

	@ApiOperation(value = "Master data for the government documents", notes = "Returns the master data listing for the kagzi app")
	@RequestMapping(value = "/kagazi-mst", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseTO> kagaziMst() {
		LOGGER.info("CoreController /kagazi-mst Method starts...");
		return new ResponseEntity<ResponseTO>(coreservice.kagazimst(), HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Master data detail for the government documents using mst_id", notes = "Returns the detail of kagazi master using id")
	@RequestMapping(value = "/kagazi-mst-dtl/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseTO> kagaziMstDtl(@PathVariable(name="id") Long id) {
		LOGGER.info("CoreController /kagazi-mst-dtl Method starts...");
		return new ResponseEntity<ResponseTO>(coreservice.kagaziMstDtl(id), HttpStatus.OK);
	}

}