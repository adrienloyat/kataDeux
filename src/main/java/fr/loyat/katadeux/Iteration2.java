package fr.loyat.katadeux;

import java.util.Arrays;


public class Iteration2 {

	public int chop(int searched_int, int[] tab) {
		int index;
		int offset=0;
		int[] tabRestant = tab;
		while (tabRestant.length!=0){
			index = tabRestant.length/2;
			if (tabRestant[index]==searched_int) {
				return index+offset;
			}
			else if (tabRestant[index]<searched_int) {
				tabRestant = Arrays.copyOfRange(tabRestant, index+1, tabRestant.length);
				offset = offset+index+1;
			} else {
				tabRestant = Arrays.copyOfRange(tabRestant, 0, index);
			}
			
		}
		return -1;
	}
	
	

}
