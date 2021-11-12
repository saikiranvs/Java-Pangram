package com.planon.pangram.service;

import java.util.ArrayList;
import java.util.List;

import com.planon.pangram.dto.DTO;

public class Services {
	/**
	 * method getData() of type List<DTO> creates a list of strings.
	 * 
	 * @return list of strings.
	 */
	public List<DTO> getData() {
		List<DTO> list = new ArrayList<DTO>();

		DTO string = new DTO("we promptly judged antique ivory buckles for the next prize");
		list.add(string);
		string = new DTO("we promptly judged antique ivory buckles for the prizes");
		list.add(string);
		string = new DTO("the quick brown fox jumps over the lazy dog");
		list.add(string);
		string = new DTO("the quick brown fox jump over the lazy dog");
		list.add(string);
		return list;
	}
}
