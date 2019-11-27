package com.jth.service;

import com.jth.domain.CodeLabelValue;
import com.jth.mapper.CodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeMapper codeMapper;

    @Override
    public List<CodeLabelValue> getCodeClassList() throws Exception {
        return codeMapper.getCodeClassList();
    }

    @Override
    public List<CodeLabelValue> getCodeList(String classCode) throws Exception {
        return codeMapper.getCodeList(classCode);
    }
}
