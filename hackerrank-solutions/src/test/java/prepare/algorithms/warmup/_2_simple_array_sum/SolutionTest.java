package prepare.algorithms.warmup._2_simple_array_sum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.ListUtils.integerList;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new Reduce()
		);

		for (AbstractSolution s : solutions) {
			assertEquals(31, s.simpleArraySum(integerList(1, 2, 3, 4, 10, 11)));
		}
	}

}
