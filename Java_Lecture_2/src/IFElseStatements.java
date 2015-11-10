
public class IFElseStatements {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*20);
		System.out.println(num);

		if(num>=10){
			
			System.out.println("Number is greater than 10");
		}
		
		else if(num<10 && num>5){
			
			System.out.println("Number is greater than 5 and less than 10");
			
		}
		
			else {
				System.out.println("Number is less than 10");
		}
		

	}

}
