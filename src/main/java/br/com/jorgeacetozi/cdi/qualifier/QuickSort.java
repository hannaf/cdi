package br.com.jorgeacetozi.cdi.qualifier;

@Algorithm(name = SorterAlgorithm.QUICK_SORT)
public class QuickSort implements Sorter {

	@Override
	public String sort(Integer... list) {
		return "QuickSort!";
	}

}
