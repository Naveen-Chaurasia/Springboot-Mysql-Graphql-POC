package com.naveen.springgraphql.mysql.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkingStatus {
	
	@RequestMapping(value="/status", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	
	public ResponseEntity<String> CheckStatus(HttpServletResponse response)
	{
		
		String msg="{\"ApiStatus\":\"UP\"}";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	

}
