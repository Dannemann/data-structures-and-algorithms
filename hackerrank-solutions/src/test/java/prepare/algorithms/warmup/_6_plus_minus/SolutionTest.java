package prepare.algorithms.warmup._6_plus_minus;

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
			assertEquals(List.of("0.500000", "0.333333", "0.166667"), s.plusMinus(integerList(-4, 3, -9, 0, 4, 1)));
			assertEquals(List.of("0.375000", "0.375000", "0.250000"), s.plusMinus(integerList(1, 2, 3, -1, -2, -3, 0, 0)));
		}
	}

}
