package com.narayan.aiqs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author unmattavesa
 *
 */
@RestController
public class SampleController {

	@RequestMapping(method = RequestMethod.GET, value = "/sample")
	public String hello() {
		return "Hello buddies!!!";
	}
	
}
