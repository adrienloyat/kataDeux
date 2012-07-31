package fr.loyat.katadeux;



public class Iteration4 {

	public int chop(int searched_int, int[] tab) {
		int debut=0;
		int fin=tab.length-1;
		while (debut<=fin){
			int milieu = (debut + fin)/2;
			if (tab[milieu]==searched_int) {
				return milieu;
			}
			else if (tab[milieu]<searched_int) {
				debut=milieu+1;
			} else {
				fin=milieu-1;
			}
		}

		return -1;
	}
	
	

}
