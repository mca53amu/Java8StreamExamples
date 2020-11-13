package java8;

import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import java8.data.Employee;
import java8.data.EmployeeData;

public class StreamListToMapExample {
	public static void main(String a[]) {

		List<Employee> arrayList = EmployeeData.getEmpList();

		Map<Integer, Employee> collect2 = arrayList.stream()
				.collect(toMap(Employee::getEmpNumber, Function.identity()));
		
		collect2.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		});

	}
}
