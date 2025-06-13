package prepare.algorithms.implementation._1_grading_students;

import java.util.List;
import java.util.stream.Collectors;

class Solution extends AbstractSolution {

	@Override
	List<Integer> gradingStudents(List<Integer> grades) {
		return grades.stream().map(grade -> {
			int mod = grade % 5;

			if (grade > 37 && (mod == 3 || mod == 4))
				grade += 5 - mod;

			return grade;
		}).collect(Collectors.toList());
	}

}
