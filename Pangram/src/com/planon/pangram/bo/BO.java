package com.planon.pangram.bo;

import java.util.ArrayList;
import java.util.List;

import com.planon.pangram.dto.DTO;
import com.planon.pangram.service.Services;

public class BO {
	private int index;
	private boolean flag = true;

	/**
	 * method findPangram() creates a list of integer values if the string in
	 * pangram then adds value of 1 to the list else if not then adds 0 value to the
	 * list.
	 * 
	 * @return list of ArrayList<Integer>
	 */
	public ArrayList<Integer> findPangram() {

		ArrayList<Integer> intergerlist = new ArrayList<Integer>();
		Services service = new Services();
		List<DTO> list = service.getData();
		for (DTO string : list) {
			flag = true;
			int alphabet[] = new int[26];
			for (int i = 0; i < string.toString().length(); i++) {
				if (string.toString().charAt(i) >= 'a' && string.toString().charAt(i) <= 'z') {
					index = string.toString().charAt(i) - 'a';
				}
				alphabet[index] = 1;

			}
			for (int i = 0; i < 26; i++) {
				if (alphabet[i] != 1) {
					alphabet[i] = 0;
				}
			}
			for (int i = 0; i < 26; i++) {
				if (alphabet[i] == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				intergerlist.add(1);
			} else {
				intergerlist.add(0);
			}
		}
		return intergerlist;
	}
}
