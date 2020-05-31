package com.jth.optional;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class OptionalTests01 {
	
	@Test
	public void optionalTest10() {
		Integer year = 2016;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
		System.out.println(is2016);
		assertTrue(is2016);
		boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
		System.out.println(is2017);
		assertFalse(is2017);
	}
	
	/*
	@Test(expected = IllegalArgumentException.class)
	public void optionalTest09() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
		System.out.println("name");
		System.out.println(name);
	}
	*/
	
	/*
	public String getMyDefault() {
		System.out.println("Getting Default Value");
		return "Default value";
	}
	
	@Test
	public void optionalTest08() {
		String text = "Text present";
		
		System.out.println("Using orElseGet:");
		String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
		System.out.println(defaultText);
		assertEquals("Text present", defaultText);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Using orElse");
		defaultText = Optional.ofNullable(text).orElse(getMyDefault());
		System.out.println(1);
		System.out.println(defaultText);
		System.out.println(2);
		assertEquals("Text present", defaultText);
	}
	*/
	
	/*
	@Test
	public void optionalTest07() {
		String text = null;
		
		String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
		assertEquals("Default value", defaultText);
		
		defaultText = Optional.ofNullable(text).orElse(getMyDefault());
		assertEquals("Default value", defaultText);
	}
	*/
	
	/*
	@Test
	public void optionalTest06() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
		System.out.println(name);
		assertEquals("john", name);
	}
	*/
	
	/*
	@Test
	public void optionalTest05() {
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("john");
		System.out.println(name);
		assertEquals("john", name);
	}
	*/
	
	/*
	@Test
	public void optionalTest04() {
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		System.out.println(opt);
		System.out.println(opt.isPresent());
		assertFalse(opt.isPresent());
	}
	*/
	
	/*
	@Test(expected = NullPointerException.class)
	public void optionalTest03() {
		String name = null;
		Optional.of(name);
	}
	*/
	
	/*
	@Test
	public void initiatingOptionTest02() {
		String name = "good";
		Optional<String> opt = Optional.of(name);
		System.out.println(opt);
		assertTrue(opt.isPresent());
	}
	*/
	
	/*
	@Test
	public void initialtingOptionTest01() {
		
		Optional<String> empty = Optional.empty();
		assertFalse(empty.isPresent());
		
	}
	*/

}
