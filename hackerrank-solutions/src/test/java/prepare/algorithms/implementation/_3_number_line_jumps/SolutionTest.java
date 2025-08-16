package prepare.algorithms.implementation._3_number_line_jumps;

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
			assertEquals("YES", s.kangaroo(0, 3, 4, 2));
			assertEquals("NO", s.kangaroo(0, 2, 5, 3));
		}
	}

}
