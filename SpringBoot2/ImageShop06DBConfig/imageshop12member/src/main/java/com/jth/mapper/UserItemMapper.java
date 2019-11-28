package com.jth.mapper;

import com.jth.domain.UserItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserItemMapper {

    public void create(UserItem userItem) throws Exception;

    public UserItem read(Integer userItemNo) throws Exception;

    public List<UserItem> listAll() throws Exception;

    public List<UserItem> list(Integer userNo) throws Exception;

}
