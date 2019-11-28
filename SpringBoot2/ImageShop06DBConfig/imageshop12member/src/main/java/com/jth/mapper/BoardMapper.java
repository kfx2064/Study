package com.jth.mapper;

import com.jth.domain.Board;
import com.jth.domain.PageRequest;
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

    // 페이징 요청 정보를 매개변수로 받아 페이징 처리한 게시글 목록을 반환
    public List<Board> list(PageRequest pageRequest) throws Exception;

    // 게시글 전체 건수 반환
    public int count() throws Exception;

    // 검색 처리된 게시글 건수를 반환
    public int count(PageRequest pageRequest) throws Exception;

}
