package java8;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

import java8.data.Employee;
import java8.data.EmployeeData;

public class StreamListToGroupByExample {
	public static void main(String a[]) {

		List<Employee> arrayList = EmployeeData.getEmpList();

		Map<String, List<Employee>> collect = arrayList.stream().collect(groupingBy(Employee::getType));
		collect.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey());
			entry.getValue().forEach(value -> System.out.println(value));

		});
	}
}
