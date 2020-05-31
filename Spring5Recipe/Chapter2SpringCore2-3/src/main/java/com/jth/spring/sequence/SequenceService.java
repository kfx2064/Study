package com.jth.spring.sequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequenceService {
	
	@Autowired
	private SequenceDao sequenceDao;
	
	public SequenceService() {
		
	}
	
	public SequenceService(SequenceDao sequenceDao) {
		this.sequenceDao = sequenceDao;
	}
	
	public void setSequenceDao(SequenceDao sequenceDao) {
		this.sequenceDao = sequenceDao;
	}
	
	public String generate(String sequenceId) {
		System.out.println(sequenceId);
		Sequence sequence = sequenceDao.getSequence(sequenceId);
		int value = sequenceDao.getNextValue(sequenceId);
		String result = sequence.getPrefix() + value + sequence.getSuffix();
		return result;
	}

}
