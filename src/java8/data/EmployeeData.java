package java8.data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	private static ArrayList<Employee> arrayList = new ArrayList<>();
	private static int count;
	static {

		arrayList.add(createEmpObject("Mohammad", 200L, "ONE"));
		arrayList.add(createEmpObject("Mohammad", 300L, "ONE"));
		arrayList.add(createEmpObject("Mohammad", 400L, "ONE"));
		arrayList.add(createEmpObject("Mohammad", 500L, "TWO"));
		arrayList.add(createEmpObject("Mohammad", 600L, "TWO"));
		arrayList.add(createEmpObject("Mohammad", 700L, "TWO"));
		arrayList.add(createEmpObject("Mohammad", 800L, "THREE"));
		arrayList.add(createEmpObject("Mohammad", 900L, "THREE"));
		arrayList.add(createEmpObject("Mohammad", 1000L, "THREE"));
		arrayList.add(createEmpObject("Mohammad", 1100L, "THREE"));
		arrayList.add(createEmpObject("Mohammad", 1200L, "FIVE"));
		arrayList.add(createEmpObject("Mohammad", 13200L, "FIVE"));
		arrayList.add(createEmpObject("Mohammad", 1400L, "FIVE"));
	}

	private static Employee createEmpObject(String name, Long sal, String type) {
		Employee e = new Employee();
		e.setEmpNumber(count++);
		e.setName(name);
		e.setSal(sal);
		e.setType(type);
		return e;
	}

	public static List<Employee> getEmpList() {
		return arrayList;
	};
}
