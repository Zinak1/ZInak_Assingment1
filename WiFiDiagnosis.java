import java.util.*;
public class WiFiDiagnosis {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);// input initialization
		String answer;// declare variable
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		// STEP 1
		System.out.println ("First step: reboot your computer");// display
		System.out.println ("Are you able to connect with the internet? (yes or no)");//display
		answer= sc.nextLine();// user input
		//while statement starts
		while(!answer.equals("yes")&& !answer.equals("no")) {
			System.out.println("Please enter yes or no");
		    answer= sc.nextLine();
		}// end while
		// start if 
	if (answer.equals("yes")) {
		System.out.println("Rebooting your router seemed to work");
		return;
	}// end if 
	//STEP 2
	System.out.println("Second step: reboot your router");
	System.out.println("Now are you able to connect with the internet? (yes or no)");
	answer= sc.nextLine();
	if (answer.equals("yes")) {
		System.out.println("Rebooting your router seemed to work");
		return;
	}
	//STEP3
	System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
	System.out.println("Are you able to connect with the internet? (yes or no)");
	answer= sc.nextLine();
	if (answer.equals("yes")) {
	    System.out.println("Checking the router's cables seemed to work\n");
	   return;
	}// end if 
	// STEP4
	System.out.println("Fourth step: move your computer closer to your router");
	System.out.println("Now are you able to connect with the internet? (yes or no)");
	answer= sc.nextLine(); 
	if (answer.equals("yes")) {
	    System.out.println("Your internet connectivity seemed to work\n");
	    return;
	}
	//STEP 5
	System.out.println("Fifth step: contact your ISP");
	System.out.println("Make sure your ISP is hooked up to your router.");
	}

}


