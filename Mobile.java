package week1.day1;

public class Mobile {

	String mobilemodel = "vivo";
	int mobileweight  = 125;
	Boolean Isfullycharged = true;
	
	public void mobilepower ( ) {
		mobilemodel ="oneplus";
	}
	
	public static void main(String[] args) {
		Mobile mymobile = new Mobile();
System.out.println(mymobile.mobilemodel);
System.out.println(mymobile.mobileweight);
System.out.println(mymobile.Isfullycharged);
mymobile.mobilepower();
	}

}
