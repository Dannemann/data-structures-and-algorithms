package prepare.algorithms.warmup._5_diagonal_difference;

import org.junit.Test;

import java.util.ArrayList;
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
			assertEquals(15, s.diagonalDifference(input0()));
		}
	}

	List<List<Integer>> input0() {
		List<List<Integer>> r = new ArrayList<>(3);
		r.add(integerList(11, 2, 4));
		r.add(integerList(4, 5, 6));
		r.add(integerList(10, 8, -12));
		return r;
	}

}
