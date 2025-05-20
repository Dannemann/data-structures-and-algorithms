package prepare.algorithms.warmup._4_a_very_big_sum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.ListUtils.longList;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new Solution()
		);

		for (AbstractSolution s : solutions) {
			assertEquals(5000000015L, s.aVeryBigSum(longList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)));
		}
	}

}
