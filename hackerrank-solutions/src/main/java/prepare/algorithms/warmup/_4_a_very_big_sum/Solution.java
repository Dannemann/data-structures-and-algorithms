package prepare.algorithms.warmup._4_a_very_big_sum;

import java.util.List;

class Solution extends AbstractSolution {

	long aVeryBigSum(List<Long> ar) {
		return ar.stream().reduce(0L, Long::sum);
	}

}
