public class PasswordChecker implements PasswordCheckerInterface {
	// variable declared as static so that we do not waste memory and it can be shared within the class 
	private static Character ch;
	private boolean upperCase = false;
    private boolean lowerCase = false;
    private boolean digitCase = false;
    private boolean alphaCase = false;
    
    //method checks for uppercase characters and returns true is two uppercase characters are found in the password sequence
    public boolean checkUpperCase(String password) {
    	
    	System.out.println("processing...\n Password Validity Check For Uppercase Characters");
		//counter variable to count number of uppercase characters
    	int upperCount=0;
		
		for(int i=0;i<password.length();i++){
			
			ch = password.charAt(i);
			//condition to check uppercase characters in the string
			if(Character.isUpperCase(ch)){
				
				System.out.println("UpperCase Character Found at Position:\t "+ (i+1) +"\tthe character is:\t"+ch);
	            upperCase=true;
				upperCount++;
			}
			
	}
		//if condition is satisfied it will return true and start the next process
		if(upperCase&&(upperCount>=2)){
			return true;
		}
		
		//if condition fails it will display error message and user choice to continue or exit
		else{
			System.out.println("Invalid Password because number of uppercase character required is atleast 2 but you entered :\t"+upperCount);
			//it will call main method exitMessage
			errorMessage();

			return false;
		}
	}
    //this is an inner private method to create call main methos exitMessage from the interface
		private void errorMessage() {
			
			
			Main.exitMessage();
		
	}
		
	//here we check condition for lower case characters	
		public boolean checkLowerCase(String password) {
			System.out.println("processing...\n Password Validity Check For Lowercase Characters");
			for(int i=0;i<password.length();i++){
				
				ch = password.charAt(i);
				//condition for string containing lowercase characters 
				if(Character.isLowerCase(ch)){
					
					System.out.println("LowerCase Character Found at Position:\t"+(i+1)+"\tthe character is:\t" + ch );
		            lowerCase=true;
					
				}
				
		}
			
			if(lowerCase){
				
				return true;
			}
			else{
				int i=0;
				System.out.println("Invalid Password because number of lowecase character required is atleast 1 but you entered :\t"+i);
                errorMessage();
				return false;
			}
		
}
		//here we check string containing numeric characters
		public boolean checkDigitCase(String password) {
			
			System.out.println("processing...\n Password Validity Check For Numeric Characters");
			int digitCount=0;
	for(int i=0;i<password.length();i++){
				
				ch = password.charAt(i);
				
				if(Character.isDigit(ch)){
					
					System.out.println("Numeric Character Found at Position:\t"+(i+1)+"\tthe Number is:\t"+ch);
		            digitCase=true;
					digitCount++;
				}
				
		}
			
			if(digitCase&&digitCount>=2){
				return true;
			}
			else{
				System.out.println("Invalid Password because number of numerical value required is atleast 2 but you entered :\t"+digitCount);
				errorMessage();
				return false;
			}
		
		
		
		
		
		}
		
		public boolean checkAlphaNumericCase(String password) {
			System.out.println("processing...\n Password Validity Check For Special Characters");
			for(int i=0;i<password.length();i++){
						
						ch = password.charAt(i);
						
						if(!Character.isDigit(ch)&&(!Character.isAlphabetic(ch))){
							
							System.out.println("Special Character found at position:\t"+(i+1)+"\tthe Special character is:\t"+ch);
				            alphaCase=true;
							
						}
						
				}
					
					if(!alphaCase){
						int i=0;
						System.out.println("Invalid Password because number of special character required is atleast 1 but you entered :\t"+i);
		                errorMessage();
						return false;
					}
					else{
						
						return true;
					}
		}
		
				
			}