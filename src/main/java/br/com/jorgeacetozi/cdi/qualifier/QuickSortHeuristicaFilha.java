package br.com.jorgeacetozi.cdi.qualifier;

import javax.enterprise.inject.Specializes;

@Specializes
public class QuickSortHeuristicaFilha extends QuickSortHeuristica {
	
	@Override
	public String sort(Integer... list) {
		return "QuickSort Heuristica filha!";
	}

}
