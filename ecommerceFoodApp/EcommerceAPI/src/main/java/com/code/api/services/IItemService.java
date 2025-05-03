package com.code.api.services;

import java.util.List;

import com.code.api.models.Item;



public interface IItemService {
	public Item add(Item item);
	public Item update(Item item);
	public String delete(Item item);
	public String delete(int id);
	//create some method to get the student
	public List<Item> getAll();
	public Item getById(int id);
}
