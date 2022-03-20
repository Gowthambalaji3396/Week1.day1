package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
int input=17;
Boolean flag = false;
for (int i=2;i<input/2;i++) {
	if (input%2==0) {
		flag = true;
		break;
	}
}
if (flag == false) {
	
	System.out.println("prime");
	
}	
else {
	System.out.println("not a prime");
}
		
	

	}

}
