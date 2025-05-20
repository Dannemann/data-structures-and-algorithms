package prepare.algorithms.warmup._3_compare_the_triplets;

import java.util.List;

class Solution extends AbstractSolution {

	List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int[] arr = new int[2];
		int d;

		d = a.get(0) - b.get(0);
		if (d > 0) arr[0]++;
		else if (d < 0) arr[1]++;

		d = a.get(1) - b.get(1);
		if (d > 0) arr[0]++;
		else if (d < 0) arr[1]++;

		d = a.get(2) - b.get(2);
		if (d > 0) arr[0]++;
		else if (d < 0) arr[1]++;

		return List.of(arr[0], arr[1]);
	}

}
