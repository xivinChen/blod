package com.blod.service;

import java.util.List;

import com.blod.entity.Critique;

public interface CritiqueService {

	List<Critique> getCritiqueListByArtId(Critique critique);

	void addCritique(Critique critique);

}
