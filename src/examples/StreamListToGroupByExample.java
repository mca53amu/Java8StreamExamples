package examples;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

import examples.data.Employee;
import examples.data.EmployeeData;

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
