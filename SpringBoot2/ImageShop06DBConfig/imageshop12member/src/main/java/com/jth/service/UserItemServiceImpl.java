package com.jth.service;

import com.jth.domain.Item;
import com.jth.domain.Member;
import com.jth.domain.PayCoin;
import com.jth.domain.UserItem;
import com.jth.mapper.CoinMapper;
import com.jth.mapper.UserItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserItemServiceImpl implements UserItemService {

    @Autowired
    private UserItemMapper mapper;

    @Autowired
    private CoinMapper coinMapper;

    @Override
    public void register(Member member, Item item) throws Exception {
        int userNo = member.getUserNo();

        int itemId = item.getItemId();
        int price = item.getPrice();

        UserItem userItem = new UserItem();
        userItem.setUserNo(userNo);
        userItem.setItemId(itemId);

        PayCoin payCoin = new PayCoin();
        payCoin.setUserNo(userNo);
        payCoin.setItemId(itemId);
        payCoin.setAmount(price);

        coinMapper.pay(payCoin);
        coinMapper.createPayHistory(payCoin);

        mapper.create(userItem);
    }

    @Override
    public UserItem read(Integer userItemNo) throws Exception {
        return mapper.read(userItemNo);
    }

    @Override
    public List<UserItem> listAll() throws Exception {
        return mapper.listAll();
    }

    @Override
    public List<UserItem> list(Integer userNo) throws Exception {
        return mapper.list(userNo);
    }
}
