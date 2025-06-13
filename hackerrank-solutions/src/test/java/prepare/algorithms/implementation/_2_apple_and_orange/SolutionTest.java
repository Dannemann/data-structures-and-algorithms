package prepare.algorithms.implementation._2_apple_and_orange;

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
			assertEquals(List.of(1L, 1L), s.countApplesAndOranges(
				7, 11, 5, 15, integerList(-2, 2, 1), integerList(5, -6)));
		}
	}

}
