
public class Input {
	
	String idPersonnel;
	String namePersonnel;
	int salary;
	int sales;
	
	
	public Input(String idPersonnel, String namePersonnel, int salary, int sales) {
		this.idPersonnel = idPersonnel;
		this.namePersonnel = namePersonnel;
		this.salary = salary;
		this.sales = sales;
	}

	
	public String getIdPersonnel() {
		return idPersonnel;
	}

	public void setIdPersonnel(String idPersonnel) {
		this.idPersonnel = idPersonnel;
	}

	public String getNamePersonnel() {
		return namePersonnel;
	}

	public void setNamePersonnel(String namePersonnel) {
		this.namePersonnel = namePersonnel;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

}
