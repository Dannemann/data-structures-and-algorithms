package prepare.algorithms.warmup._3_compare_the_triplets;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.ListUtils.integerList;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new Solution()
		);

		for (AbstractSolution s : solutions) {
			assertEquals(List.of(1, 1), s.compareTriplets(integerList(5, 6, 7), integerList(3, 6, 10)));
			assertEquals(List.of(2, 1), s.compareTriplets(integerList(17, 28, 30), integerList(99, 16, 8)));
		}
	}

}
