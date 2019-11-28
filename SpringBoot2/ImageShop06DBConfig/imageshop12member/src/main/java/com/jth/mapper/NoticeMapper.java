package com.jth.mapper;

import com.jth.domain.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    public void create(Notice notice) throws Exception;

    public Notice read(Integer noticeNo) throws Exception;

    public void update(Notice notice) throws Exception;

    public void delete(Integer noticeNo) throws Exception;

    public List<Notice> list() throws Exception;

}
