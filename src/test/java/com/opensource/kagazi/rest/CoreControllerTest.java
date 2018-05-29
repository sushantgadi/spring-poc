package com.opensource.kagazi.rest;

import org.junit.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.opensource.kagazi.service.CoreService;

/**
 * Unit test cases for core controller
 * 
 * @author sushant
 *
 */
public class CoreControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	CoreService coreservice;

	@Test
	public void kagaziMst() throws Exception {
		Mockito.when(coreservice.kagazimst()).thenReturn(CoreControllerMock.mockKagaziMst());

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/kagazi-mst").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());

		String expected = "{response: [{created_by: admin,created_date: 1503945000000,modified_by: admin,modified_date: 1503945000000,id: 1,code: passport,name: Passport,description: Process for passport,image_url: ../assets/images/passport.png}],err_ind: false,err_msg: }";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);

	}

}
