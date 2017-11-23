package com.krishna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;

	public void show() {
		System.out.println(engine.getEnginename());
	}
}
