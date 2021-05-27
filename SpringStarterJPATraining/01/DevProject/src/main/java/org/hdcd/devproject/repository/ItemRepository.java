package org.hdcd.devproject.repository;

import org.hdcd.devproject.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
