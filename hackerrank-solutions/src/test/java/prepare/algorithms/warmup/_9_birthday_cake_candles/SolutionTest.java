package prepare.algorithms.warmup._9_birthday_cake_candles;

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
			assertEquals(2, s.birthdayCakeCandles(integerList(3, 2, 1, 3)));
		}
	}

}
