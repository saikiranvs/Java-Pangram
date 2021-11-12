package com.planon.pangram.dto;

public class DTO {
	private String string;

	/**
	 * 
	 * @param string accepts string and sets its value.
	 */
	public DTO(String aString) {
		this.string = aString;
	}

	/**
	 * toString() method returns a string representation of the object.
	 */
	@Override
	public String toString() {
		return string;
	}

}
