package com.jth.spring.sequence.dao;

import com.jth.spring.sequence.Sequence;

public interface SequenceDao {
	
	public Sequence getSequence(String sequenceId);
	public int getNextValue(String sequenceId);

}
