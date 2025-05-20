package prepare.algorithms.warmup._5_diagonal_difference;

import java.util.List;

class Solution extends AbstractSolution {

	int diagonalDifference(List<List<Integer>> arr) {
		int aSum = 0;
		int bSum = 0;

		for (int i = 0, j = 0, len = arr.size() - 1; i <= len; i++, j++) {
			aSum += arr.get(i).get(j);
			bSum += arr.get(i).get(len - j);
		}

		// Same as Math.abs(aSum - bSum).
		int d = aSum - bSum;
		int signMask = d >> 31;
		int r = (d ^ signMask) - signMask; // Two's complement.

		return r;
	}

}
