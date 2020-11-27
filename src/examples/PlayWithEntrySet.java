package examples;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import examples.data.Employee;
import examples.data.EmployeeData;

public class PlayWithEntrySet {

	public static void main(String[] args) {
		Map<Integer, Employee> collect = EmployeeData.getEmpList().stream()
				.collect(Collectors.toMap(Employee::getEmpNumber, Function.identity()));

		collect.keySet();
		collect.values();

		Map<String, List<Employee>> collect3 = EmployeeData.getEmpList().stream()
				.collect(Collectors.groupingBy(Employee::getType));
		Stream<Employee> flatMap = collect3.entrySet().stream().flatMap(map -> map.getValue().stream());
		flatMap.forEach(e -> System.out.println("$ "+e));
		collect.entrySet().stream().forEach((entry) -> {

			System.out.println("Key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());

		});
		List<Employee> collect2 = EmployeeData.getEmpList().stream().sorted((a, b) -> (int) (a.getSal() - b.getSal()))
				.takeWhile(e -> e.getSal() < 500).collect(Collectors.toList());
		collect2.forEach(a -> System.out.println(a));

	}

}
