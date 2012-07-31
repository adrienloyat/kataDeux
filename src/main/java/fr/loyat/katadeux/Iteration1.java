package fr.loyat.katadeux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Iteration1 {

	
	public int chop(int searched_int, Integer[] tab) {
		List<Integer> liste = new ArrayList<Integer>(Arrays.asList(tab));
		
		return chopList(searched_int, liste,0 );
	}

	private int chopList(int searched_int, List<Integer> liste, int offset ) {
		if (liste.isEmpty()) return -1;
		int indiceMilieu=liste.size()/2;
		if (indiceMilieu==0) return liste.get(0)==searched_int?offset:-1;
		if (liste.get(indiceMilieu)==searched_int) return indiceMilieu+offset;
		if (liste.get(indiceMilieu)<searched_int) 
			return chopList(searched_int, liste.subList(indiceMilieu+1, liste.size()),offset+1+indiceMilieu);
		else return chopList(searched_int, liste.subList(0, indiceMilieu),offset);
	}

}
