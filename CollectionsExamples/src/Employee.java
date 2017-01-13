public class Employee implements Comparable<Employee> {
	private String empName;
	private int empAge;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public int compareTo(Employee emp) {
		if (this.empAge < emp.getEmpAge()) {
			return +1;
		} else if (this.empAge > emp.getEmpAge()) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + "]";
	}

}
