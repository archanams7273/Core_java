package org.tnsif.c2tc.Service;

import org.springframework.stereotype.Component;
import org.tnsif.c2tc.entities.Item;
@Component
public interface ItemService {

	long addItem(Item item);

	Item updateItem(Item item);

	Item SearchItem(long id);

	boolean DeleteItem(long id);

}
