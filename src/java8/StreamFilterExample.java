package java8;

import static java.util.stream.Collectors.toList;

import java.util.List;

import java8.data.Employee;
import java8.data.EmployeeData;

public class StreamFilterExample {
	
	public static void main(String a[]) {
		
	List<Employee> arrayList = EmployeeData.getEmpList();
		
		arrayList.stream().collect(toList()).forEach(e -> System.out.println(e));
	}

}
