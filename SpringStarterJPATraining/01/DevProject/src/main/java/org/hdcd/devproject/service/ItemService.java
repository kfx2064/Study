package org.hdcd.devproject.service;

import org.hdcd.devproject.domain.Item;

import java.util.List;

public interface ItemService {

    public void regist(Item item) throws Exception;

    public Item read(Long itemId) throws Exception;

    public void modify(Item item) throws Exception;

    public void remove(Long itemId) throws Exception;

    public List<Item> list() throws Exception;

    public String getPicture(Long itemId) throws Exception;

    public String getPicture2(Long itemId) throws Exception;

}
