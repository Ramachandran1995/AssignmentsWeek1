package week1assignments;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirror = 2;
	long chasisNumber = 124563L;
	boolean isPunctured = true;
	String bikename = "apache RTR 200";
	double runningKM = 142000.87;
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub 
	TwoWheeler myBike = new TwoWheeler ();
	System.out.println(myBike.noOfWheels);
	System.out.println(myBike.noOfMirror);
	System.out.println(myBike.chasisNumber);
	System.out.println(myBike.isPunctured);
	System.out.println(myBike.bikename);
	System.out.println(myBike.runningKM);
	}

}
