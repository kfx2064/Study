package com.jth.service;

import com.jth.domain.Item;
import com.jth.domain.Member;
import com.jth.domain.UserItem;

import java.util.List;

public interface UserItemService {

    public void register(Member member, Item item) throws Exception;

    public UserItem read(Integer userItemNo) throws Exception;

    public List<UserItem> listAll() throws Exception;

    public List<UserItem> list(Integer userNo) throws Exception;

}
