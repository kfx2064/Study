package org.hdcd.devproject.repository;

import org.hdcd.devproject.domain.UserItem;
import org.hdcd.devproject.domain.UserItemId;
import org.springframework.data.repository.CrudRepository;

public interface UserItemRepository extends CrudRepository<UserItem, UserItemId> {
}
