
public class boolean_datatype {

	public static void main(String[] args) {
		
		boolean bol=true;
		
		System.out.println(10<20);
		
		int first_no = 20;
		int sec_no = 20;
		int third_no = 30;
		
		String abc = "Welcome to selenium tutorial";
		String def = "Welcome to selenium tutorial";
		
		if(abc==def){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("strings are not equal");
		}
		
		
		boolean result = first_no>sec_no;
		System.out.println(result);
		
		if(first_no>sec_no || first_no>third_no){
			
			System.out.println("first no is greater" +first_no);
		}
		else if(sec_no>first_no && sec_no>third_no){
			System.out.println("second no is greater " +sec_no);
		}
		else{
			
			System.out.println("third_no is greater "+third_no);
		}

	}

	
	
////	switch(control expression){
////	
////	case expression 1:
////		<statement>
////	case expression 2:
////		<statement>
//	}
	
	
	
}
