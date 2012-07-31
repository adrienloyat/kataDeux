package fr.loyat.katadeux;

import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;



public class Iteration3 {

	
	public int chop(final int searched_int, int[] tab) {
		
		TreeMap<Integer, Integer> map = Maps.newTreeMap();
		for (int i=0;i<tab.length;i++){
			map.put(i,tab[i]);
		}
		
		return parcours(searched_int, map);
	}

	private int parcours(final int searched_int, SortedMap<Integer, Integer> map) {
		if (map.size()==0) return -1;
		if (map.size()==1) return map.get(map.firstKey())==searched_int?map.firstKey():-1;
		int milieu = (map.firstKey()+map.lastKey())/2;
		if (map.get(milieu)==searched_int) return milieu;
		else if (map.get(milieu)<searched_int) {
			return parcours(searched_int,map.tailMap(milieu+1));
		}else {
			return parcours(searched_int,map.headMap(milieu));
		}
		
		
		
	}
	
	public int chop3(final int searched_int, int[] tab) {
		
		List<Integer> liste = Ints.asList(tab);
		return Iterators.indexOf(liste.iterator(), new Predicate<Integer>() {
			public boolean apply(@Nullable Integer arg0) {
				return searched_int==arg0;
			}
		});
	}
	
	public int chop2(final int searched_int, int[] tab) {
		return Ints.indexOf(tab, searched_int);
	}	

}
