package top50javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import examples.data.Employee;

public class CharsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "a,b,c";
		String[] split = str.split(",");
		List<String> asList = Arrays.asList(split);
		List<Employee> collect = asList.stream().map(a -> new Employee(a)).collect(Collectors.toList());
		System.out.println(collect);

	}

}
