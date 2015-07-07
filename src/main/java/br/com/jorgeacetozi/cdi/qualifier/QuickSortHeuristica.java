package br.com.jorgeacetozi.cdi.qualifier;

import javax.enterprise.inject.Specializes;

@Specializes
public class QuickSortHeuristica extends QuickSort {
	
	@Override
	public String sort(Integer... list) {
		return "QuickSort Heuristica!";
	}

}
