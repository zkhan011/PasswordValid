


public class Main {
	// variable declared as static so that it can be shared by all members within this class.
	private static String password;
	//this method returns password initialized in the welcome MessageScreen class.
	public void getPassword(String password) {
		Main.password = password;
		
	}

	public static void main(String[] args) {
	    //start of main method
		boolean uResult=false;
		boolean lResult=false;
		boolean dResult=false;
		boolean aResult=false;
		//calling interface method for achieving encapsulation so our logic is not exposed to the rest of the world
		//interface instantiated
		WelcomeScreenInterface wi= new WelcomeScreen();
		PasswordCheckerInterface pi = new PasswordChecker() ;
		//interface method called for welcome-screen and password length validity check 
		wi.welcomeMessage();
		
		//calling methods to check for the strong password criteria
		uResult=pi.checkUpperCase(password);
		if(uResult){
		lResult=pi.checkLowerCase(password);}
		if(lResult){
		dResult=pi.checkDigitCase(password);}
		if(dResult){
		aResult=pi.checkAlphaNumericCase(password);}
		
		//ultimate check for password validity
		if(uResult&&lResult&&dResult&&aResult){
			
			System.out.println("Password Is Valid");
			
		}
		else{
			System.out.println("Password Is Invalid");
		}
		
	//calls the static method exit message
		exitMessage();
		
		
		
		

	}
 //displays exit message declared as static because we do not have to create instance variable to call this method within the class
	public static void exitMessage() {
		WelcomeScreenInterface wi= new WelcomeScreen();
		wi.exitMessage();
		
	}

	


	

	
		
	


	}


