package com.ahmad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.dto.CostumerDto;
import com.ahmad.services.CostumerService;

@RestController
@RequestMapping("costumer")
public class CostumerController {
	
	@Autowired
	private CostumerService costumerService;

	
	@RequestMapping(value = "" ,method = RequestMethod.POST)
	public CostumerDto createCostumer(@RequestBody CostumerDto dto) {
		
		return costumerService.create(dto);
	}
}
