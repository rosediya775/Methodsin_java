package oopConcept2;

public class MethodsInJava {

	public static void main(String[] args) {
		
		MethodsInJava obj = new MethodsInJava ();
		
	obj.welcome();	
	obj.getTotal();	
		
	String s1 = obj.getStudentName();
	System.out.println(s1 +  " TechAgility");
	 
	double amount = obj.getTotalAmount();
	System.out.println(amount);
		
	int a1 = obj.sum(100, 90);	
	System.out.println(a1 + 60 - 30 );	
		
	System.out.println(obj.launchBrowser("Safari"));
		
	
	
	}
    // 1. no input and no return
	// void does not return anything = no return
	
	public void welcome () {
		
		System.out.println("welcome method");
		
	}
	
	public void getTotal () {
		
		System.out.println("get total number");
		 int a = 80;
		 int b = 90;
	int total = a + b;
	
	System.out.println(total);
				 
	}
	//2. no input but some return
	// return type : String
   public String getStudentName () {
	   
	   System.out.println("Get Student name method");
	   String name = "pythagoras";
	   return name;
	   
   }
	
	public double getTotalAmount() {
		
		double salary = 25000.00;
		double tax = 5000.00;
		double amount = salary - tax ;
		return amount;
		
	}
	
	//3. some input and some return
	public int sum (int a, int b) {
	System.out.println("sum method");
	int c = a + b ;
	return c ;
	
	
	}
		
	public boolean launchBrowser(String browser) {
	boolean flag = false;
	
		switch (browser) {

		case "chrome":
		System.out.println("launch Chrome");
		flag = true;
		break;
		
		case "safari":
		System.out.println("launch Safari");
		flag = true;	
		break;
		
		case "edge":
		System.out.println("launch Edge");
		flag = true;
		break;
		
		case "firefox":
		System.out.println("launch Firefox");
		flag = true;
		break;
		
		default:
		System.out.println("please pass the correct brower name : " + browser);
		break;
		
		
		}
		
		return flag;
		
	}
	
	
	
	
	
	
	
	
	

		
}
