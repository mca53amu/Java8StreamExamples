package examples;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import examples.data.Employee;
import examples.data.EmployeeData;

public class PlayWithStreams {

	public static void main(String[] args) {
		Optional<Employee> max = EmployeeData.getEmpList().stream().max((a, b) -> {
			return (int) (a.getSal() - b.getSal());
		});
		EmployeeData.getEmpList().stream().forEach(e -> System.out.println(e));
		System.out.println(max);

		Optional<Employee> typeOneHignest = EmployeeData.getEmpList().stream().filter(e -> e.getType() == "ONE")
				.max((a, b) -> {
					return (int) (a.getSal() - b.getSal());
				});
		System.out.println("Highest Salary of type ONE" + typeOneHignest);

		Optional<Employee> typeTwoHignest = EmployeeData.getEmpList().stream().filter(e -> e.getType() == "TWO")
				.max((a, b) -> {
					return (int) (a.getSal() - b.getSal());
				});
		System.out.println("Highest Salary of type ONE" + typeTwoHignest);

		Map<Integer, Employee> collect = EmployeeData.getEmpList().stream()
				.collect(Collectors.toMap(Employee::getEmpNumber, e -> e));

		collect.entrySet().forEach(entry -> System.out.println("Key: " + entry.getKey() + " value" + entry.getValue()));
		Map<String, List<Employee>> collect2 = EmployeeData.getEmpList().stream()
				.collect(Collectors.groupingBy(Employee::getType));
		collect2.values().stream().forEach(list -> {
			Optional<Employee> max2 = list.stream().max((e1, e2) -> (int) (e1.getSal() - e2.getSal()));
			System.out.println("Max of Type " + max2);
		}); // TODO Auto-generated method stub

	}

}
