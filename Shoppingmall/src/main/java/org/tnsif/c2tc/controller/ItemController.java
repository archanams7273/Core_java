package org.tnsif.c2tc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.c2tc.Service.ItemService;
import org.tnsif.c2tc.entities.Item;

@RestController
public class ItemController {
@Autowired
ItemService service;
@PostMapping("/addItem")
public String AddEmployee(@RequestBody Item item)
{
	long count=service.addItem(item);
	return(count + "no of values got added");
}
@PutMapping("/updateItem")
public Item UpdateItem(@RequestBody Item item)
{
	return service.updateItem(item);
}
@DeleteMapping("/deleteItem/{id}")
public String deleteItem(@PathVariable long id)
{
	boolean success=service.DeleteItem(id);
	if(success)
		return "Deletion Successful";
	else
		return "Deletion Failed";
}
@GetMapping("/SearchItem/{id}")
public Item SearchItem(@PathVariable long id)
{
	return service.SearchItem(id);
	
}
}


