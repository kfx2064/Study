package org.hdcd.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class ChargeCoin implements Serializable {

    @Serial
    private static final long serialVersionUID = 5502788220374388310L;

    private int historyNo;
    private int userNo;
    private int amount;
    private Date regDate;

    public int getHistoryNo() {
        return historyNo;
    }

    public void setHistoryNo(int historyNo) {
        this.historyNo = historyNo;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
