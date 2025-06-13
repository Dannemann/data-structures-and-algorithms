package prepare.algorithms.implementation._1_grading_students;

import org.junit.Test;
import utils.ListUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new Solution()
		);

		for (AbstractSolution s : solutions) {
			assertEquals(List.of(75, 67, 40, 33), s.gradingStudents(ListUtils.integerList(73, 67, 38, 33)));
		}
	}

}
