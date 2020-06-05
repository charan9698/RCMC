package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Milk;
import com.app.repo.MilkRepository;
import com.app.service.IMilkService;

@Service
public class MilkServiceImpl implements IMilkService {
	@Autowired
	private MilkRepository repo;


	public Integer saveMilk(Milk m) {
		Integer id=repo.save(m).getId();

		return id;
	}

	public void updateMilk(Milk m) {
		repo.save(m);

	}

	public void deleteMilk(Integer id) {
		repo.deleteById(id);		
	}

	public Milk getOneMilk(Integer id) {
		Optional<Milk> opt=repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();

		}

		return null;
	}

	public List<Milk> getAllMilks() {
		List<Milk> list=repo.findAll();
		return list;
	}

	public boolean isMilkExist(Integer id) {
		boolean exist=repo.existsById(id);
		return exist;
	}





}
