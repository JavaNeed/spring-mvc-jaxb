package com.howtodoinjava.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.State;

@RestController
@RequestMapping("/stateObject")
public class StateController {
	private static final Logger LOGGER = LoggerFactory.getLogger(StateController.class);
	
	
	@RequestMapping(value = "/{code}")
	public @ResponseBody State getState(@PathVariable("code") String code){
		LOGGER.debug("Creating State Object...!!!");
		State state = new State();
		
		if (code.equals("KL")) {
			state.setCode(code);
			state.setName("Kerala");
		} else {
			state.setCode(code);
			state.setName("Default State");
		}
		return state;
	}
}
