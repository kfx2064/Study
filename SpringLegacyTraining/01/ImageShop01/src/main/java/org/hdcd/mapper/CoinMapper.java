package org.hdcd.mapper;

import org.hdcd.domain.ChargeCoin;
import org.hdcd.domain.PayCoin;

import java.util.List;

public interface CoinMapper {

    public void create(ChargeCoin chargeCoin) throws Exception;

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

    // 구매 내역을 생성한다.
    public void createPayHistory(PayCoin payCoin) throws Exception;

    // 구매 내역을 반환한다.
    public List<PayCoin> listPayHistory(int userNo) throws Exception;

    // 상품 구매에 대한 코인 지급을 처리한다.
    public void pay(PayCoin payCoin) throws Exception;

}
