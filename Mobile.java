
public class Mobile {
//comments 
	//method-> actions/ verifications 
	// make call 
	
	// access modifier, return type, methodName
	public void makeCall() {
		System.out.println("Make the call to Mom");
	}
	public void sendMsg() {
		System.out.println("Send Message to Dad");
	}
	// special methhod - main method
	public static void main (String[] args) {
		System.out.println("Inside Main Method");
		// Create an object
		Mobile myMobile = new Mobile ();
		myMobile.makeCall();
		myMobile.sendMsg();
		}
}
