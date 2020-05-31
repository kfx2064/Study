package com.jth.spring.sequence;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

@Component("sequenceDao")
public class SequenceDaoImpl implements SequenceDao {
	
	private final Map<String, Sequence> sequences = new HashMap<String, Sequence>();
	private final Map<String, AtomicInteger> values = new HashMap<String, AtomicInteger>();
	
	public SequenceDaoImpl() {
		sequences.put("IT", new Sequence("IT", "30", "A"));
		values.put("IT", new AtomicInteger(100000));
	}
	
	public Sequence getSequence(String sequenceId) {
		System.out.println("dao sequenceId : " + sequenceId);
		return sequences.get(sequenceId);
	}
	
	public int getNextValue(String sequenceId) {
		AtomicInteger value = values.get(sequenceId);
		return value.getAndIncrement();
	}

}
