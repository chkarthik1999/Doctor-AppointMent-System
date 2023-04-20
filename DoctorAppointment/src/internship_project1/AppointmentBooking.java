	package internship_project1;
	
	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class AppointmentBooking extends Java {
	
		ArrayList<String> doctorName = new ArrayList<String>();
		ArrayList<String> doctorQualification = new ArrayList<String>();
		ArrayList<String> doctorGender = new ArrayList<String>();
		ArrayList<String> doctorPassword = new ArrayList<String>();
		ArrayList<Integer> doctorAge = new ArrayList<Integer>();
		ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
		ArrayList<String> doctorCity = new ArrayList<String>();
		
		ArrayList<Integer> patientAge = new ArrayList<Integer>();
		ArrayList<String> patientName = new ArrayList<String>();
		ArrayList<String> patientGender = new ArrayList<String>();
		ArrayList<String> patientPassword = new ArrayList<String>();
		ArrayList<String> patientConfirmPassword = new ArrayList<String>();
		ArrayList<Long>   patientMobileNumber = new ArrayList<Long>();
		
		ArrayList<Integer> patientAgeBooking = new ArrayList<Integer>();
		ArrayList<String> patientNameBooking = new ArrayList<String>();
		ArrayList<String> patientGenderBooking = new ArrayList<String>();
		ArrayList<Byte> doctorId = new ArrayList<Byte>();
		
		
		
		public void dataAdd() {
			
			doctorName.add("Dr.Pujjitha Reddy");
			doctorName.add("Dr.Anish kumar");
			doctorName.add("Dr.Jeevan");
			doctorName.add("Dr.Sree Lekha");
			doctorName.add("Dr.Govind Raju");
			doctorName.add("Dr.Sai Datta");
			doctorName.add("Dr.Sri Teja");
			
			doctorQualification.add("MBBS, MD");
			doctorQualification.add("MBBS, MD, General Physician");
			doctorQualification.add("MBBS, MD, Surgeon");
			doctorQualification.add("MBBS, MD");
			doctorQualification.add("MBBS, MD");
			doctorQualification.add("MBBS, MD");
			doctorQualification.add("MBBS, MD");
			
			doctorGender.add("F");
			doctorGender.add("M");
			doctorGender.add("M");
			doctorGender.add("F");
			doctorGender.add("M");
			doctorGender.add("M");
			doctorGender.add("M");
			
			doctorPassword.add("Pujji");
			doctorPassword.add("Anish");
			doctorPassword.add("Jeevan");
			doctorPassword.add("Lekha");
			doctorPassword.add("Raju");
			doctorPassword.add("Datta");
			doctorPassword.add("Teja");
			
			doctorAge.add(29);
			doctorAge.add(30);
			doctorAge.add(35);
			doctorAge.add(28);
			doctorAge.add(37);
			doctorAge.add(37);
			doctorAge.add(40);
			
			doctorMobileNumber.add((long) 944015);
			doctorMobileNumber.add((long) 954203);
			doctorMobileNumber.add((long) 960653);
			doctorMobileNumber.add((long) 984847);
			doctorMobileNumber.add((long) 900347);
			doctorMobileNumber.add((long) 738226);
			doctorMobileNumber.add((long) 949172);
			
			doctorCity.add("Rajahmundry");
			doctorCity.add("Visakhapatanam");
			doctorCity.add("Kakinada");
			doctorCity.add("Rajahmundry");
			doctorCity.add("Vijayawada");
			doctorCity.add("Hyderabad");
			doctorCity.add("Tirupathi");

			
			


			
			
			
			
			
			
			
		}
	
		public void doctor() throws Exception {
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			while(flag)
			{
				
				System.out.println("\t\t\t\t---------------------------------------");
				System.out.println("\t\t\t\t\t Welcome to Doctor Page");
				System.out.println("\t\t\t\t---------------------------------------");
				System.out.println();
				System.out.println("\t\t\t\t 1.login \t 2.Registration");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					if(doctorMobileNumber.isEmpty())
					{
						System.out.println("Register yourself");
						Thread.sleep(2000);
						break;
					}
					else {
						doctorLogin();
						flag= false;
					}
					break;
					
				case 2:
					doctorRegistration();
					flag = false;
					break;
					
				default:
					System.out.println("Invalid choice");
					flag = true;
					Thread.sleep(1000);
					break;
				}
			}
			
			
		}
	
		private void doctorRegistration() throws Exception {
			Scanner sc = new Scanner(System.in);
			int i=0;
			long mobileNumber;
			boolean flag=true, flag1=true;
			
			System.out.println("\t\t\t\t---------------------------------------");
			System.out.println("\t\t\t\t\t  Doctor Registration Page");
			System.out.println("\t\t\t\t---------------------------------------");
			System.out.println();
			
			System.out.println("Enter your Name: ");
			doctorName.add(sc.nextLine());
			
			System.out.println("Enter your Mobile number: ");
			mobileNumber=sc.nextLong();
			
			long mno;
			
			
			if(doctorMobileNumber.isEmpty())
			{
				doctorMobileNumber.add(mobileNumber);
				System.out.println("Enter Password: ");
				doctorPassword.add(sc.next());
				System.out.println("Registration successfull...");
				Thread.sleep(1000);
				flag1=false;
			}
			else 
			{
				for(i=0;i<=doctorMobileNumber.size()-1;i++) {
					mno=doctorMobileNumber.get(i);
					
					if(mno==mobileNumber) {
						flag1=false;
						break;
					}
				}
				
				if(flag1==true) {
					
					doctorMobileNumber.add(mobileNumber);
					System.out.println("Enter age: ");
					doctorAge.add(sc.nextInt());
					
					System.out.println("Enter the city: ");
					doctorCity.add(sc.next());
					
					System.out.println("Enter the Password: ");
					doctorPassword.add(sc.next());
					
					System.out.println("Registration successfull...");
					System.out.println();
					
					System.out.println("Name: "+doctorName);
					System.out.println("Number:-"+doctorMobileNumber);
					Thread.sleep(1000);
					System.out.println();
				}
				
				else {
					System.out.println("Mobile Number already registred");
					int index=doctorName.size()-1;
					doctorName.remove(index);
					Thread.sleep(1000);
				}
			}
			
		}

		private void doctorLogin() throws Exception {
			Scanner sc = new Scanner(System.in);
			long mobileNumber;
			byte choice;
			int i;
			
			System.out.println("\t\t----------------------------");
			System.out.println("\t\t\t  Doctor LogIn Page");
			System.out.println("\t\t----------------------------");
			System.out.println();
			
			System.out.println("Enter your UserID(mobileNumber): ");
			mobileNumber = sc.nextInt();
			
			System.out.println("Enter the Password: ");
			String password = sc.next();
			
			boolean flag=false;
			boolean flag11=true;
			
			
			for(i=0; i<=doctorMobileNumber.size()-1;i++)
			{
				if((doctorMobileNumber.get(i)).equals(mobileNumber)&&(doctorPassword.get(i)).equals(password)){
					flag = true;
					
					break;
				}
			
			}
			
			if(flag==true)
			{
				while(flag11)
				{
					
					System.out.println("\t\t--------------------------------");
					System.out.println("\t\t\t Welcome Doctor LogIn Page");
					System.out.println("\t\t--------------------------------");
					System.out.println();
					System.out.println("\t\t\t 1.Appointments 2.LogOut");
					choice=sc.nextByte();
					int j=0;
					
					switch(choice) 
					{
						
					case 1:
						if((doctorId.isEmpty()!=true))
						{
							while(j<=doctorId.size()-1)
							{
								if((i+1)==doctorId.get(j)) 
								{
									System.out.println("Patient Name: "+patientNameBooking.get(j));
									j++;
								}
							}
							Thread.sleep(4000);
						}
						else
						{
							System.out.println("No Appointments yet...");
							Thread.sleep(3000);
							flag11=true;
						}
						break;
					case 2:
						flag11=false;
						break;
					
					}
				}
				
				}
			else {
				System.out.println("LogIn Unsuccessfull...");
				Thread.sleep(1500);
			}
			
		}
			
		
		
		
		
		public void patient() throws Exception {
			
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			while(flag)
			{
				
				System.out.println("\t\t\t\t---------------------------------------");
				System.out.println("\t\t\t\t\t Welcome to Patient Page");
				System.out.println("\t\t\t\t---------------------------------------");
				System.out.println();
				System.out.println("\t\t\t\t 1.login \t 2.Registration");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					if(patientMobileNumber.isEmpty())
					{
						System.out.println("Register yourself");
						Thread.sleep(2000);
						break;
					}
					else {
						patientLogin();
						flag= false;
					}
					break;
					
				case 2:
					patientRegistration();
					flag = false;
					break;
					
				default:
					System.out.println("Invalid choice");
					flag = true;
					Thread.sleep(1000);
					break;
				}
			}
			
		}
	
		
		private void patientLogin() throws Exception {
			Scanner sc = new Scanner(System.in);
			boolean flag=true;
			long mobileNumber;
			byte choice;
			
			System.out.println("\t\t\t\t-------------------------------");
			System.out.println("\t\t\t\t\t\t LogIn");
			System.out.println("\t\t\t\t-------------------------------");
			System.out.println();
			
			System.out.println("Enter your UserID(mobileNumber): ");
			mobileNumber = sc.nextInt();
			
			System.out.println("Enter the Password: ");
			String password = sc.next();
			
			System.out.println("Log In Successfull...");
			
			boolean flag1=false;
			int j;
			
			for(j=0; j<=patientMobileNumber.size()-1;j++)
			{
				if((patientMobileNumber.get(j)).equals(mobileNumber)&&(patientPassword.get(j)).equals(password)){
					flag1 = true;
					
					break;
				}
			
			}
			if(flag1==true)
			{
				Thread.sleep(1000);
				
				System.out.println("\t\t\t\t---------------------------------");
				System.out.println("\t\t\t\t\t Book An Appointment");
				System.out.println("\t\t\t\t---------------------------------");
				System.out.println();
				System.out.println("\n Welcome"+" "+patientName.get(j)+",to book an appointment, choose your doctor");
				
				for(int i=0; i<=doctorName.size()-1;i++)
				{
					System.out.println((i+1)+"."+doctorName.get(i));
				}
				
				choice = sc.nextByte();
				
				doctorId.add(choice);
			
				
				while(flag)
				{
					Thread.sleep(1000);
					
					System.out.println("\t\t\t\t--------------------------------");
					System.out.println("\t\t\t\t\t Book An Appointment");
					System.out.println("\t\t\t\t--------------------------------");
					System.out.println();
					
					if(choice<=doctorName.size()&&choice>0)
					{
						System.out.println("\n\n Name: \t"+doctorName.get(choice-1)+"\n Age: \t"+doctorAge.get(choice-1)+"\n Qualification: "+
								doctorQualification.get(choice-1));
						System.out.println();
						
						System.out.println("\n Enter your name: ");
						sc.nextLine();
						patientNameBooking.add(sc.nextLine());
						
						System.out.println("\n Enter your Age: ");
						patientAgeBooking.add(sc.nextInt());
						
						System.out.println("\n Enter your Gender: ");
						patientGenderBooking.add(sc.next());
						
						
						System.out.println("\n Booking Successfull...");
						
						Thread.sleep(2000);
						flag= false;
						break;
					}
					else
					{
						System.out.println("\n Enter the correct details");
						flag=true;
						Thread.sleep(2000);
					}
				}
		}
			else
			{
				System.out.println("\n Login Unsuccessfull...");
				Thread.sleep(1000);
				flag=false;
			}
			
		}
		
		private void patientRegistration() throws Exception {
			Scanner sc = new Scanner(System.in);
			
			Long mobileNumber;
			
			System.out.println("\t\t\t\t------------------------------------------------");
			System.out.println("\t\t\t\t\tWelcome to Patient Registration Page");
			System.out.println("\t\t\t\t------------------------------------------------");
			System.out.println();
			
			System.out.println("Enter your name: ");
			patientName.add(sc.nextLine());
			System.out.println("Enter your age: ");
			patientAge.add(sc.nextInt());
			System.out.println("Enter your Mobile Number: ");
			mobileNumber=sc.nextLong();
			long mno;
			
			boolean flag=true, flag1=true;
			
			if(patientMobileNumber.isEmpty()) {
				
				patientMobileNumber.add(mobileNumber);
				System.out.println("Enter password");
				patientPassword.add(sc.next());
				System.out.println("Registration is Successfull");
				Thread.sleep(2000);
				
				flag1=false;
				
			}
			else
			{
				for(int i=0;i<=patientMobileNumber.size()-1;i++) {
					mno=patientMobileNumber.get(i);
					
					if(mno==mobileNumber){
						
						flag1=false;
						break;
					}
				}
				if(flag1==true) {
					patientMobileNumber.add(mobileNumber);
					System.out.println("Registration successfull...");
					Thread.sleep(1000);
				}
					
				else {
					System.out.println("This mobile number is already Registered");
					int index=patientName.size()-1;
					patientName.remove(index);
					Thread.sleep(1000);
				}
				
				
			}
		}
	
	
		public void admin() throws Exception {
			
			Scanner sc = new Scanner(System.in);
			byte choice;
			boolean flag = true;
			
			while(flag)
			{
				
				System.out.println("\t\t\t\t\t_____________________________");
				System.out.println("\t\t\t\t\t\t Welcome Admin ");
				System.out.println("\t\t\t\t\t_____________________________");
				
				System.out.println("\t\t\t 1.Doctor List \t2.Registerd Patients \t3.Patients with Appointment \t4.Main menu");
				choice = sc.nextByte();		
				switch(choice) {
				
				case 1:
					for(int i=0; i<=doctorName.size()-1;i++) {
						System.out.println("Name: \t "+doctorName.get(i));
					}
					byte menuChoice;
					System.out.println("\n\n 1.Main menu \t 2.Previous menu");
					menuChoice = sc.nextByte();
					if(menuChoice==1) {
						flag= false;
					}
					else {
						break;
					}
					break;
					
				case 2:
					if(patientName.isEmpty())
					{
						System.out.println("No Registed Patients yet");
						Thread.sleep(2000);
						break;
					}
					else {
						for(int i=0;i<=patientName.size()-1;i++) {
							System.out.println(i+". "+patientName.get(i));
						}
						System.out.println("\n\n 1.Main menu \t 2.Previous menu");
						menuChoice = sc.nextByte();
						if(menuChoice==1)
						{
							flag=false;
						}
						else
						{
							break;
						}
					}
					break;
					
				case 3:
					if(patientName.isEmpty())
					{
						System.out.println("No Appointments yet");
						Thread.sleep(2000);
						break;
					}
					else {
						for(int i=0;i<=patientName.size()-1;i++) {
							System.out.println(i+". "+patientName.get(i));
						}
						System.out.println("\n\n 1.Main menu \t 2.Previous menu");
						menuChoice = sc.nextByte();
						if(menuChoice==1)
						{
							flag=false;
						}
						else
						{
							break;
						}
					}
					break;
					
				case 4:
					flag=false;
					break;
					
				default:
					System.out.println("Invalid choice");
					Thread.sleep(1000);
				}
			}
			
		}
	
		
	
		
	}
