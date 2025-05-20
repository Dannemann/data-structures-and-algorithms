package prepare.algorithms.warmup._9_birthday_cake_candles;

import java.util.List;

class Solution extends AbstractSolution {

	int birthdayCakeCandles(List<Integer> candles) {
		Integer biggest = 0;
		int counter = 0;

		for (Integer candle : candles)
			if (candle > biggest) {
				biggest = candle;
				counter = 1;
			} else if (candle.equals(biggest))
				counter++;

		return counter;
	}

}
