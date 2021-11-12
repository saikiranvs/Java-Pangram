package com.planon.pangram;

import com.planon.pangram.bo.BO;

/**
 * A pangram is a word or sentence that contains every letter of the alphabet.
 * Write a program which takes Strings[] and return a string where each position
 * represents the results of your test. Use a '1' to represent true, '0' for
 * false.
 * 
 * @author saveer
 *
 */
public class Application {

	public static void main(String[] args) {
		BO pangram = new BO();
		System.out.println(pangram.findPangram());

	}

}