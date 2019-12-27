package com.ahmad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.dto.CoveredDriverDto;
import com.ahmad.dto.CoveredVehicleDto;
import com.ahmad.dto.PolicyDto;
import com.ahmad.services.PolicyService;

@RestController
@RequestMapping("addPolicy")
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void addPolicy(@RequestParam(value = "id") Long id, @RequestBody PolicyDto dto) throws Exception {
		policyService.createPolicy(id, dto);

	}
    @RequestMapping(value ="addDriver" , method = RequestMethod.POST)
	public void addDriver(@RequestParam Long id, @RequestBody CoveredDriverDto dto) throws Exception {
		policyService.createDriver(id, dto);
	}
    @RequestMapping(value = "addVehicle" , method = RequestMethod.POST)
    public void addVehicle(@RequestParam Long id, @RequestBody CoveredVehicleDto dto) throws Exception {
    	policyService.addVehicle(id, dto);
    }
}
