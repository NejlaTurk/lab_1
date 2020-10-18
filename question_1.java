package lab_1;

public class question_1 {

	public static void main(String[] args) {
		
		/*
		 * Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String

stringTimes("Hi", 2); = > HiHi
stringTimes("Hi", 3); = > HiHiHi
stringTimes("Hi", 1); = > Hi
		 */
		
			stringTimes("Hi", 2);
			stringTimes("Hi", 3); 
			stringTimes("Hi", 1); 
			
			
		}
		
		public static void stringTimes(String string,int number) {
			
			String callNum = "";
			
			for(int i=0;i<number;i++) {
				
				callNum = callNum + string;   
				
			}
			
			System.out.println(callNum);
			
		}
		
		
		
	
}