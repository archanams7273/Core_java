package org.tnsif.c2tc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.c2tc.entities.Item;

public interface IItemRepository extends JpaRepository<Item,Long>
{
	

}
