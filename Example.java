import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		//Designing part
		System.out.println("==================================================================================================================");
		System.out.println("||\t\t\t\t                                                      \t\t\t\t||");
		System.out.println("||\t\t\t\t                                                      \t\t\t\t||");
		System.out.println("||\t\t\t\t                      =*%@@%*=                        \t\t\t\t||");
		System.out.println("||\t\t\t\t                    =@@@@@@@@@@=                      \t\t\t\t||");
		System.out.println("||\t\t\t\t       .=#@@#+.    =@@@@@@@@@@@@=                     \t\t\t\t||");
		System.out.println("||\t\t\t\t      :@@@@@@@@-   @@@@@@@@@@@@@%                     \t\t\t\t||");
		System.out.println("||\t\t\t\t      @@@@@@@@@@   =@@@@@@@@@@@@=                     \t\t\t\t||");
		System.out.println("||\t\t\t\t      :@@@@@@@@-    +@@@@@@@@@@=                      \t\t\t\t||");
		System.out.println("||\t\t\t\t       .+#@@#+.       =*%@@%*=                        \t\t\t\t||");
		System.out.println("||\t\t\t\t     =#@@@@@@@@@@@@@@@@@@@@@@@@@#=                    \t\t\t\t||");
		System.out.println("||\t\t\t\t    *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*     -+%@#         \t\t\t\t||");
		System.out.println("||\t\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ :+#@@@@@@         \t\t\t\t||");
		System.out.println("||\t\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \t\t\t\t||");
		System.out.println("||\t\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \t\t\t\t||");
		System.out.println("||\t\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \t\t\t\t||");
		System.out.println("||\t\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         \t\t\t\t||");
		System.out.println("||\t\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ :+#@@@@@@         \t\t\t\t||");
		System.out.println("||\t\t\t\t    *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*     -+%@#         \t\t\t\t||");
		System.out.println("||\t\t\t\t     =#@@@@@@@@@@@@@@@@@@@@@@@@@#=                    \t\t\t\t||");
		System.out.println("||\t\t\t\t              .%@@@++@@@%:                            \t\t\t\t||");
		System.out.println("||\t\t\t\t             =@@@%.  .%@@@=                           \t\t\t\t||");
		System.out.println("||\t\t\t\t             =%%=      =%%=                           \t\t\t\t||");
		System.out.println("||\t\t\t\t                                                      \t\t\t\t||");
		System.out.println("||\t\t\t\t   ___  ___________   __________  __________  _______\t\t\t\t||");
		System.out.println("||\t\t\t\t  / _ \\/__  __/ __/  / ___/  _/ \\/  /  __/  \\/  / _  |\t\t\t\t||");
		System.out.println("||\t\t\t\t / , _/  / /  _\\ \\  / /___/ //     /  _// /\\_/ / __  |\t\t\t\t||");
		System.out.println("||\t\t\t\t/_/\\_\\  /_/  /___/  \\___/___/__/\\_/____/_/  /_/_/  \\_|\t\t\t\t||");
		System.out.println("||\t\t\t\t                                                     \t\t\t\t||");
		System.out.println("==================================================================================================================");

		
		System.out.print("\nEnter Date (DD-MM-YYYY) -> ");
		String date=input.next();
		System.out.print("\nLocation -> ");
		String location=input.next();
		
		System.out.println("\t\t\t\t    _            _ _      _    _        ___ _ _               ");
		System.out.println("\t\t\t\t   /_\\__  ____ _(_) |__ _| |__| |___   | __(_) |_ __   ___ ");
		System.out.println("\t\t\t\t  / _ \\ \\/ / _' | | / _' | '_ \\ / -_)  | _|| | | '  \\(_ -< ");
		System.out.println("\t\t\t\t /_/ \\_\\__/\\__,_|_| \\__,_|_.__/_\\___|  |_| |_|_|_|_|_/___/");
		System.out.println("\t\t\t\t===========================================================\n\n");
		
		System.out.println("\t\t\t1) Movie 1- Hall 1\t\t\t\t 2) Movie 2- Hall 2\n");
		System.out.println("\t\t\t3) Movie 3- Hall 3\t\t\t\t 4) Movie 4- Hall 4\n\n");

		
		System.out.print("Enter Movie number : ");
		int choice=input.nextInt();

 
		System.out.println("\t\t\t\t\t        _______                      ");
		System.out.println("\t\t\t\t\t       |__   __|_                    ");
		System.out.println("\t\t\t\t\t 	  | |  (_)_ __ ___   ___           ");
		System.out.println("\t\t\t\t\t 	  | |  | | '_ ' _ \\ / _ \\        ");
		System.out.println("\t\t\t\t\t 	  | |  | | | | | | |  __/          ");
		System.out.println("\t\t\t\t\t 	  |_|  |_|_| |_| |_|\\___|         ");
		System.out.println("\t\t\t\t===========================================================\n\n");
		
		System.out.println("\t\t\t\t\t\t 1) 9.00 A.M\n");
		System.out.println("\t\t\t\t\t\t 2) 2.00 P.M\n");
		System.out.println("\t\t\t\t\t\t 3) 7.00 A.M\n");

		System.out.print("Enter time : ");
		String time=input.next();


		
		System.out.println("\t\t\t\t\t    _____           _                               ");
		System.out.println("\t\t\t\t\t   /  __ \\         | |                              ");
		System.out.println("\t\t\t\t\t   | /  \\/_   _ ___| |_ ___  _ __ ___   ___ _ __    ");
		System.out.println("\t\t\t\t\t   | |   | | | / __| __/ _ \\| '_ ' _ \\ / _ \\ '__|   ");
		System.out.println("\t\t\t\t\t   | \\__/\\ |_| \\__ \\ || (_) | | | | | |  __/ |      ");
		System.out.println("\t\t\t\t\t    \\____/\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|      ");
		System.out.println("\t\t\t\t\t==================================================\n\n");


		
		System.out.print("Name : ");
		String name=input.next();
		System.out.print("\n\nPhone Number : ");
		String phone=input.next();
		System.out.print("\n\nChild OR Parent : ");
		String childeOrParent=input.next();
		System.out.print("\n\nNumber of Tickets : ");
		int tickets=input.nextInt();
		
		double tax = tickets*90/5;
		double total = tickets*90 +tax;



		System.out.println("\t\t\t\t+-----------------------------------------------------------------+");
		System.out.println("\t\t\t\t||     ___  ___________   __________  __________  _______        ||");
		System.out.println("\t\t\t\t||    / _ \\ /__  __/ __/  / ___/  _/ \\/  /  __/  \\/  / _  |      ||");
		System.out.println("\t\t\t\t||   / ,_/   / /  _\\ \\  / /___/ //     /  _// /\\_/ / __  |       ||");
		System.out.println("\t\t\t\t||  /_/\\_\\  /_/  /___/  \\___/___/__/\\_/____/_/  /_/_/  \\_|       ||");
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||    Date : %-10s \t\tLocation : %-14s||\n", date, location);
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.println("\t\t\t\t||---------------------------------------------------------------||");
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||       Name              : %-21s               ||\n", name);
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||       Phone Number      : %-21s               ||\n", phone);
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||       Ticket            : %-21d               ||\n", tickets);
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||       Time              : %-21s               ||\n", time);
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||       Hall              : %-21d               ||\n", choice);
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||       Tax               : %-23.2f             ||\n", tax);
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.println("\t\t\t\t||                                                               ||");
		System.out.printf("\t\t\t\t||                                       Total : %-15.2f ||\n", total);
		System.out.println("\t\t\t\t+-----------------------------------------------------------------+");


		
	} 
}