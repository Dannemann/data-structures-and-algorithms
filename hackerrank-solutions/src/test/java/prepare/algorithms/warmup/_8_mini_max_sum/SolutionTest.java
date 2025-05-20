package prepare.algorithms.warmup._8_mini_max_sum;

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
			assertEquals("10 14", s.miniMaxSum(integerList(1, 2, 3, 4, 5)));
			assertEquals("299 9271", s.miniMaxSum(integerList(7, 69, 2, 221, 8974)));
		}
	}

}
