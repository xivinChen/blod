package com.blod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blod.entity.Articlecategory;
import com.blod.service.CatagoryService;

@Controller
@RequestMapping("/catagory")
public class CatagoryController {
	
	@Autowired
	private CatagoryService catagoryService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Articlecategory> getCatagories() {
		return catagoryService.getCatagories();
	}
	
	
	@RequestMapping("/{ctgId}")
	@ResponseBody
	public Articlecategory getCatagoryByid(@PathVariable Integer ctgId) {
		return catagoryService.getCatagoryById(ctgId);
	}

}
