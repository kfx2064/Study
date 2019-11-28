package com.jth.mapper;

import com.jth.domain.ChargeCoin;
import com.jth.domain.PayCoin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoinMapper {

    public void create(ChargeCoin chargeCoin) throws Exception;

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

    public void createPayHistory(PayCoin payCoin) throws Exception;

    public List<PayCoin> listPayHistory(int userNo) throws Exception;

    public void pay(PayCoin payCoin) throws Exception;

}
