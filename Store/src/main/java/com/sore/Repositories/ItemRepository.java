package com.sore.Repositories;

import com.sore.Entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {}
