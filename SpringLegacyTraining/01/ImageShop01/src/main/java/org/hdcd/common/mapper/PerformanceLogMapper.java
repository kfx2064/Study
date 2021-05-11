package org.hdcd.common.mapper;

import org.hdcd.common.domain.PerformanceLog;

import java.util.List;

public interface PerformanceLogMapper {

    public void create(PerformanceLog performanceLog)  throws Exception;

    public List<PerformanceLog> list() throws Exception;

}
