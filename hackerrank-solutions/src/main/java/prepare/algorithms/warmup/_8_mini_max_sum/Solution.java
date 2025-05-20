package prepare.algorithms.warmup._8_mini_max_sum;

import java.util.Collections;
import java.util.List;

class Solution extends AbstractSolution {

	String miniMaxSum(List<Integer> arr) {
		Collections.sort(arr);
		String r =
			((long) arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3)) + " " +
			((long) arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4));
//		System.out.print(r);
		return r;
	}

}
