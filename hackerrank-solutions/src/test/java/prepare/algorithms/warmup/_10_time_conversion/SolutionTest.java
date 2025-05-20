package prepare.algorithms.warmup._10_time_conversion;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new Solution()
		);

		for (AbstractSolution s : solutions) {
			assertEquals("19:05:45", s.timeConversion("07:05:45PM"));
		}
	}

}
