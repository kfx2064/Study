package com.jth.service;

import com.jth.domain.CodeClass;
import com.jth.mapper.CodeClassMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CodeClassServiceImpl implements CodeClassService {

    @Autowired
    private CodeClassMapper mapper;

    @Override
    public void create(CodeClass codeClass) throws Exception {
        mapper.create(codeClass);
    }

    @Override
    public CodeClass read(String classCode) throws Exception {
        return mapper.read(classCode);
    }

    @Override
    public void update(CodeClass codeClass) throws Exception {
        mapper.update(codeClass);
    }

    @Override
    public void delete(String classCode) throws Exception {
        mapper.delete(classCode);
    }

    @Override
    public List<CodeClass> list() throws Exception {
        return mapper.list();
    }
}
