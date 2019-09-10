package com.blod.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blod.entity.Critique;
import com.blod.entity.CritiqueExample;
import com.blod.entity.CritiqueExample.Criteria;
import com.blod.mapper.CritiqueMapper;
import com.blod.service.CritiqueService;
@Service
public class CritiqueServiceImpl implements CritiqueService{

	@Autowired
	private CritiqueMapper  critiqueMapper;
	
	@Override
	public List<Critique> getCritiqueListByArtId(Critique critique) {
		// TODO Auto-generated method stub
		CritiqueExample example=new CritiqueExample();
		Criteria criteria=example.createCriteria();
		criteria.andCtArtIdEqualTo(critique.getCtArtId());
		//criteria.and
		return critiqueMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public void addCritique(Critique critique) {
		// TODO Auto-generated method stub
		critiqueMapper.insert(critique);
	}

}
