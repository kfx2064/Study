package com.jth.mapper;

import com.jth.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.hibernate.validator.internal.metadata.core.AnnotationProcessingOptionsImpl;

import java.util.List;

@Mapper
public interface BoardMapper {

    public void create(Board board) throws Exception;

    public Board read(Integer boardNo) throws Exception;

    public void update(Board board) throws Exception;

    public void delete(Integer boardNo) throws Exception;

    public List<Board> list() throws Exception;

}
