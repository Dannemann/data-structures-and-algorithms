package prepare.datastructures.arrays._1_arrays_ds;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.ListUtils.integerList;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new OneLoopSwap(),
			new WhileSwap(),
			new IntRangeCollectionsSwap(),
			new ForLoop(),
			new IntStreamRange(),
			new AddingBackwards()
		);

		for (AbstractSolution s : solutions) {
			assertEquals(List.of(2, 3, 4, 1), s.reverseArray(integerList(1, 4, 3, 2)));
			// Custom:
			assertEquals(List.of(3, 2, 1), s.reverseArray(integerList(1, 2, 3)));
			assertEquals(List.of(4, 66, 122, 556, 234), s.reverseArray(integerList(234, 556, 122, 66, 4)));
		}
	}

}
