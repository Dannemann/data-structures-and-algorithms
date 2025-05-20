package prepare.algorithms.warmup._6_plus_minus;

import java.util.List;

class Solution extends AbstractSolution {

	List<String> plusMinus(List<Integer> arr) {
		double len = arr.size();
		int[] counters = new int[3];

		for (int i = 0; i < len; i++)
			counters[arr.get(i) > 0 ? 0 : arr.get(i) < 0 ? 1 : 2]++;

		System.out.printf("%.6f%n", counters[0] / len);
		System.out.printf("%.6f%n", counters[1] / len);
		System.out.printf("%.6f%n", counters[2] / len);

		return List.of(
			String.format("%.6f", counters[0] / len),
			String.format("%.6f", counters[1] / len),
			String.format("%.6f", counters[2] / len)
		);
	}

}
