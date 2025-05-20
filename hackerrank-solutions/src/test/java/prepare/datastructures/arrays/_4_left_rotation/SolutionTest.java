package prepare.datastructures.arrays._4_left_rotation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.ListUtils.integerList;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new AddAllSublists(),
			new SystemArrayCopy(),
			new CollectionsSwap(),
			new LinkedListPop()
		);

		for (AbstractSolution s : solutions) {
			assertEquals(List.of(5, 1, 2, 3, 4), s.rotateLeft(4, integerList(1, 2, 3, 4, 5)));
			// Custom:
			assertEquals(List.of(10, 20, 30, 40, 50), s.rotateLeft(5, integerList(10, 20, 30, 40, 50)));
			assertEquals(List.of(20, 30, 40, 50, 10), s.rotateLeft(1, integerList(10, 20, 30, 40, 50)));
		}
	}

}
