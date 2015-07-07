package br.com.jorgeacetozi.cdi.qualifier;

import javax.inject.Inject;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class QualifierController {
	@Inject
	private Result result;
	
	@Inject
	@Algorithm(name = SorterAlgorithm.QUICK_SORT)
	private Sorter sorter;
	
	public void example() {
		result.include("qualifier", sorter.sort());
	}
}
