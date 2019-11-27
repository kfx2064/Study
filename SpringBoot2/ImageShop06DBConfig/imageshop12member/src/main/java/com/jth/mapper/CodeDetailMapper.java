package com.jth.mapper;

import com.jth.domain.CodeDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeDetailMapper {

    public void create(CodeDetail codeDetail) throws Exception;

    public CodeDetail read(CodeDetail codeDetail) throws Exception;

    public void update(CodeDetail codeDetail) throws Exception;

    public void delete(CodeDetail codeDetail) throws Exception;

    public List<CodeDetail> list() throws Exception;

    public Integer getMaxSortSeq(String classCode) throws Exception;

}
