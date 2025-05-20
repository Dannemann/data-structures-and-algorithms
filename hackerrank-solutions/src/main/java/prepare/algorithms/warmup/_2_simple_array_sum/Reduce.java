package prepare.algorithms.warmup._2_simple_array_sum;

import java.util.List;

class Reduce extends AbstractSolution {

	int simpleArraySum(List<Integer> ar) {
		return ar.stream().reduce(0, Integer::sum);
	}

}
