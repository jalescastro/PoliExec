package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutSourceEmployee;

public class PoliMain {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char auxOutSourced;
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of employees");
		Integer num = sc.nextInt();
		
		
		
		for (int i = 0; i < num; i++) {
			System.out.println("Outsourced (y/n)? ");
			auxOutSourced = sc.next().charAt(0);
			sc.nextLine();
			
			String name;
			Integer hours = 0;
			Double valuePerHour = 0.0;
			Double additionalCharge = 0.0; 
			if (auxOutSourced == 'n' ) {
				System.out.println("Enter the " + (i+1) + " employee data: ");
				 System.out.print("Name: ");
				 name = sc.nextLine();
				 sc.nextLine();
				 
				 System.out.print("Hours: ");
				 hours = sc.nextInt();
				 
				 System.out.print("Value per hour: ");
				 valuePerHour = sc.nextDouble();
				
				 list.add(new Employee(name, hours, valuePerHour));
				 
			}else {
				System.out.println("Enter the " + (i+1) + " employee data: ");
				System.out.print("Name: ");
				 name = sc.nextLine();
				 sc.nextLine();
				 
				 System.out.print("Hours: ");
				 hours = sc.nextInt();
				 
				 System.out.print("Value per hour: ");
				 valuePerHour = sc.nextDouble();
				
				 System.out.print("Additional Charge: ");
				 additionalCharge = sc.nextDouble();
				list.add(new OutSourceEmployee(name, hours, valuePerHour, additionalCharge));
				 
				 
			}
			
		}
		
		System.out.println("Payments: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - " + emp.payment());
		}
		
		
		
		
		
		sc.close();
	}
}
