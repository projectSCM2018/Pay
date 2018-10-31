
public class Process {
	
	int salary;
	int sales;
	
	public Process(int salary, int sales) {
		this.salary = salary;
		this.sales = sales;
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
	
	public double getPay() {
		double pay = 0;
		if(this.sales>50000) {
			pay=this.salary+(this.sales*0.03);
		}else if(this.sales>25000){
			pay=this.salary+(this.sales*0.02);
		}else if(this.sales>0) {
			pay=this.salary+(this.sales*0.01);
		}else {
			pay = 0;
		}
		
		if(pay<18000) {
			pay = 18000;
		}
		
		return pay;
	}

}
