package top50javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import examples.data.Employee;
import examples.data.EmployeeData;

public class Test {

	public static void main(String[] args) {

		List<Employee> collect = EmployeeData.getEmpList().stream().takeWhile(Employee::predicate)
				.collect(Collectors.toList());
		System.out.println("Size: " + collect.size() + " values" + collect);

		EmployeeData.getEmpList().stream().sorted((a, b) -> (int) (a.getSal() - b.getSal()))
				.forEach(a -> System.out.println(a));

		EmployeeData.getEmpList().forEach(a -> System.out.println(a));
		System.out.println("hi");
		EmployeeData.getEmpList().stream().collect(Collectors.toMap(Employee::getEmpNumber, Function.identity()))
				.entrySet().forEach(entry -> System.out.println(entry));
		System.out.println("Hello");
		EmployeeData.getEmpList().stream().collect(Collectors.groupingBy(Employee::getSal)).entrySet()
				.forEach(a -> System.out.println("Key " + a.getKey() + " Values" + a.getValue()));
		Map<Long, List<Employee>> collect2 = EmployeeData.getEmpList().stream()
				.collect(Collectors.groupingBy(Employee::getSal));
		System.out.println("Flat map example");
		collect2.values().stream().flatMap(a -> a.stream()).sorted((a, b) -> a.getEmpNumber() - b.getEmpNumber())
				.forEach(a -> System.out.println(a));
	}

}
