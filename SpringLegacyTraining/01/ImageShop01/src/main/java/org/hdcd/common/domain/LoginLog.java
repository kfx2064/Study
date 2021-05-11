package org.hdcd.common.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {

    @Serial
    private static final long serialVersionUID = -7147834811615650820L;

    private int userNo;
    private String userId;
    private String remoteAddr;
    private Date regDate;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
