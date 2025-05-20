package utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

	public static List<Integer> integerList(int... ints) {
		List<Integer> list = new ArrayList<>(ints.length);
		for (Integer i : ints)
			list.add(i);
		return list;
	}

	public static List<Long> longList(long... longs) {
		List<Long> list = new ArrayList<>(longs.length);
		for (Long i : longs)
			list.add(i);
		return list;
	}

}
