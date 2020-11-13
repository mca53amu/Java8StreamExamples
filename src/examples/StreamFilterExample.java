package examples;

import static java.util.stream.Collectors.toList;

import java.util.List;

import examples.data.Employee;
import examples.data.EmployeeData;

public class StreamFilterExample {
	
	public static void main(String a[]) {
		
	List<Employee> arrayList = EmployeeData.getEmpList();
		
		arrayList.stream().collect(toList()).forEach(e -> System.out.println(e));
	}

}
