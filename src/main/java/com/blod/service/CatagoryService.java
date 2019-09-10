package com.blod.service;

import java.util.List;

import com.blod.entity.Articlecategory;

public interface CatagoryService {

	List<Articlecategory> getCatagories();

	Articlecategory getCatagoryById(Integer ctgId);

}
