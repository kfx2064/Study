package org.hdcd.dao;

import org.hdcd.domain.Board;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private static String namespace = "org.hdcd.mapper.BoardMapper";

    @Override
    public void create(Board board) throws Exception {
        sqlSessionTemplate.insert(namespace + ".create", board);
    }

    @Override
    public Board read(Integer boardNo) throws Exception {
        return sqlSessionTemplate.selectOne(namespace + ".read", boardNo);
    }

    @Override
    public void update(Board board) throws Exception {
        sqlSessionTemplate.update(namespace + ".update", board);
    }

    @Override
    public void delete(Integer boardNo) throws Exception {
        sqlSessionTemplate.delete(namespace + ".delete", boardNo);
    }

    @Override
    public List<Board> list() throws Exception {
        return sqlSessionTemplate.selectList(namespace + ".list");
    }
}
