import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);

		String idPersonnel;
		String name;
		int salary;
		int sales;
		
		System.out.print("idPersonnel: ");
		idPersonnel = in.next();
		System.out.print("name: ");
		name = in.next();
		System.out.print("salary: ");
		salary = in.nextInt();
		System.out.print("sales: ");
		sales = in.nextInt();
		
		Input input = new Input(idPersonnel,name,salary,sales);
		Process process = new Process(input.getSalary(),input.getSales());
		Output output = new Output(input.getNamePersonnel(),process.getPay());
		output.outputPay();
		
	}

}
