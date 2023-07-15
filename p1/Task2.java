package p1;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		public List<Salary> rangeOfSalary(List<Salary> list, int startingRange, int endingRange) {
	        List<Salary> result = new ArrayList<>();
	        list.forEach(salary -> {
	            if (salary.getAmount() >= startingRange && salary.getAmount() <= endingRange) {
	                result.add(salary);
	            }
	        });
	        return result;
	    }
	}

}
