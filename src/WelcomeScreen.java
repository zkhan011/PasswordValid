import java.util.Scanner;


public class WelcomeScreen implements WelcomeScreenInterface {
	//member declared as static so that it can be shared within the package 
	public static String password;
	//scanner is a java utility to get the input from the user
	Scanner sc = new Scanner(System.in);
	public void welcomeMessage() {
		
		
		System.out.println("Welcome to Password Pattern Checker");
		System.out.println("rules are simple \n1.Password must be atleast 8 charcters and maximum 10 characters \n2.must have 2 uppercase characters\n3.must have 2 digits\n4.must have 1 lowercase\n5.must have 1 special character  ");
		System.out.println("Please Enter the Password : ");
		//here we read the input
		password = sc.nextLine();		
		//test for length validity
	    if((password.length()<8)||(password.length()>10)){
		System.out.println("invalid password length of password you entered: "+ password.length() + " required length is 8 to 10 characters");
		welcomeMessage();
		}
	    else {
	    	
	    System.out.println("Password is of valid length\nProcessing....");	
	    //creating instance of the main method 
	    	Main m = new Main();
	    //returning setted password back to main method	
	    	m.getPassword(password);
	    	
	    }
	
	

}

	@Override
	public void exitMessage() {
		
		String option;
		System.out.println("do you wish to continue:(yes(y)/no(n)");
		option = sc.nextLine();
		if(option.equalsIgnoreCase("y")||option.equalsIgnoreCase("yes"))
		{
			Main.main(null);
		}
		else{
		System.out.println("Thankyou for using Password Checker");
		}
		
	}
}