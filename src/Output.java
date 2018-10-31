
public class Output{
	String name;
	double pay;
	
	public Output(String name, double pay) {
		this.name = name;
		this.pay = pay;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public void outputPay() {
		System.out.println("Name: " + getName() + " ,Pay: " + getPay());
	}
}
