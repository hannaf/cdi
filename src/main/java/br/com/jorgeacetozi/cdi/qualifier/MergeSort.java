package br.com.jorgeacetozi.cdi.qualifier;


@Algorithm(name = SorterAlgorithm.MERGE_SORT)
public class MergeSort implements Sorter {

	@Override
	public String sort(Integer... list) {
		return "MergeSort!";
	}

}
