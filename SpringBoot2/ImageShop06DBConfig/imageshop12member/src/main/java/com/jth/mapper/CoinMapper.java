package com.jth.mapper;

import com.jth.domain.ChargeCoin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoinMapper {

    public void create(ChargeCoin chargeCoin) throws Exception;

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

}
