package com.jth.spring.sequence.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import com.jth.spring.sequence.Sequence;
import com.jth.spring.sequence.dao.SequenceDao;

@Component("sequenceDao")
public class SequenceDaoImpl implements SequenceDao {

	private final Map<String, Sequence> sequences = new HashMap<String, Sequence>();
	private final Map<String, AtomicInteger> values = new HashMap<String, AtomicInteger>();
	
	public SequenceDaoImpl() {
		sequences.put("IT", new Sequence("IT", "30", "A"));
		values.put("IT", new AtomicInteger(10000));
	}
	
	@Override
	public Sequence getSequence(String sequenceId) {
		Sequence result = sequences.get(sequenceId);
		return result;
	}

	@Override
	public int getNextValue(String sequenceId) {
		AtomicInteger value = values.get(sequenceId);
		int result = value.getAndIncrement();
		return result;
	}
	
}
