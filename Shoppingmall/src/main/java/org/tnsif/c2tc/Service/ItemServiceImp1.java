package org.tnsif.c2tc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Item;
import org.tnsif.c2tc.repository.IItemRepository;
@Service
public class ItemServiceImp1  implements ItemService{
	@Autowired
	IItemRepository repository;
	@Override
	public long addItem(Item item) {
		Item i=repository.save(item);
		if(i!=null)
			return 1;
		else
			return 0;
	}
	@Override
	public Item updateItem(Item item) {
		Item i=repository.save(item);
		return i;
	}
	@Override
	public Item SearchItem(long id) {
		Item i=repository.findById(id).get();
		return i;
	}
	@Override
	public boolean DeleteItem(long id) {
		Item i=SearchItem(id);
		if(i!=null)
		{
			repository.delete(i);
			return true;
		}
		else
			return false;
	}
}
