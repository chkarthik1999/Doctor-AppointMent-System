package internship_project1;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) throws Exception {
		AppointmentBooking ab = new AppointmentBooking();
		Scanner sc = new Scanner(System.in);
		 ab.dataAdd();
		
		boolean flag=true;
		
		while(flag=true) {
			
			System.out.println("\t\t\t---------------------------------------------------");
			System.out.println("\t\t\t\tWelcome to Doctor Appointment Booking ");
			System.out.println("\t\t\t---------------------------------------------------");
			System.out.println();
			
			System.out.println("\t\t\t\t1.Doctor 2.Patient 3. Admin 4. Exit");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				ab.doctor();
				flag=true;
				break;
				
			case 2:
				ab.patient();
				flag=true;
				break;
				
			case 3:
				ab.admin();
				flag = true;
				break;
				
			default:
				System.exit(0);
			}
		}

	}

}
