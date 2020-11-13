package examples.data;

public class Employee {
	private Integer empNumber;
	private String name;
	private Long sal;
	private String type;
	public Integer getEmpNumber() {
		return empNumber;
	}
	public String getName() {
		return name;
	}
	public Long getSal() {
		return sal;
	}
	public String getType() {
		return type;
	}
	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", sal=" + sal + ", type=" + type + "]";
	}
	
}
