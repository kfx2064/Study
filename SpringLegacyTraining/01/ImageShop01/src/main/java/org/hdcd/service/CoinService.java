package org.hdcd.service;

import org.hdcd.domain.ChargeCoin;
import org.hdcd.domain.PayCoin;

import java.util.List;

public interface CoinService {

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

    // 사용자의 상품 구매 내역을 반환한다.
    public List<PayCoin> listPayHistory(int userNo) throws Exception;
}
