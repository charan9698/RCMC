package com.app.service;

import java.util.List;

import com.app.model.Milk;

public interface IMilkService {
	public Integer saveMilk(Milk m);
	public void updateMilk(Milk m);
	public void deleteMilk(Integer id);
	public Milk getOneMilk(Integer id);
	public List<Milk> getAllMilks();
	public boolean isMilkExist(Integer id);

}
