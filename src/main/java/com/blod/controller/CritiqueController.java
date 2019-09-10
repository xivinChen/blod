package com.blod.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blod.entity.Critique;
import com.blod.service.CritiqueService;
import com.blod.utils.DateUtils;

@Controller
@RequestMapping("/critique")
public class CritiqueController {
	
	@Autowired
	private CritiqueService critiqueService;
	
	@RequestMapping("list")
	@ResponseBody
	public List<Critique> getCritiques(Critique critique,Model model) {
		
		return critiqueService.getCritiqueListByArtId(critique);
	}
	
	@RequestMapping("/add")
	//@ResponseBody
	public String addCritique(Critique critique) {
		try {
			System.out.println("jinlaile");
			critique.setCtTime(DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss"));
			critiqueService.addCritique(critique);
			System.out.println("计入成功");
			return "redirect:list?ctArtId="+critique.getCtArtId();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "error";
		}
	}

}
