package org.hdcd.service;

import org.hdcd.common.domain.CodeLabelValue;
import org.hdcd.domain.PayCoin;

import java.util.List;

public interface CodeService {

    public List<CodeLabelValue> getCodeClassList() throws Exception;

    public List<CodeLabelValue> getCodeList(String classCode) throws Exception;

}
