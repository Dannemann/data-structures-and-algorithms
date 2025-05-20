package prepare.algorithms.warmup._7_staircase;

class Solution extends AbstractSolution {

	String[] staircase(int n) {
		String[] staircase = new String[n];

		for (int i = 0; i < n; i++) {
			String f = String.format("%" + n + "s", "#".repeat(i + 1));
//			System.out.printf("%s%n", f);
			staircase[i] = f;
		}

		return staircase;
	}

}
