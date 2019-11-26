package com.jth.service;

import com.jth.domain.CodeClass;

import java.util.List;

public interface CodeClassService {

    public void create(CodeClass codeClass) throws Exception;

    public CodeClass read(String classCode) throws Exception;

    public void update(CodeClass codeClass) throws Exception;

    public void delete(String classCode) throws Exception;

    public List<CodeClass> list() throws Exception;

}
