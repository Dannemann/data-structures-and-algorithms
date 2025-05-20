package prepare.algorithms.warmup._10_time_conversion;

class Solution extends AbstractSolution {

	String timeConversion(String s) {
		String period = s.substring(8);
		int hour = Integer.parseInt(s.substring(0, 2));

		if (hour == 12 && period.equals("AM"))
			hour = 0;
		else if (period.equals("PM") && hour != 12)
			hour += 12;

		return String.format("%02d%s", hour, s.substring(2, 8));
	}

}
