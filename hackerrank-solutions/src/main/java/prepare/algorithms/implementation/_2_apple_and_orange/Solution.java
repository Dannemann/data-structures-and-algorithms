package prepare.algorithms.implementation._2_apple_and_orange;

import java.util.List;

class Solution extends AbstractSolution {

	@Override
	List<Long> countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		long applesCount = apples.stream().filter(m -> a + m >= s && a + m <= t).count();
		long orangesCount = oranges.stream().filter(n -> b + n <= t && b + n >= s).count();

		System.out.println(applesCount);
		System.out.println(orangesCount);

		return List.of(applesCount, orangesCount);
	}

}
