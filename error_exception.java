class students{
	int marks;
	students(int marks){
		int Marks=this.marks;
	}
	public static void pass(int marks){
		try {
			
		
		if (marks >40) {
			System.out.println("pass");
		}}
		  catch(Exception e) {
			 System.out.println("Arithematic error");
		  
		  }
		
		finally {
		
			System.out.println("this student passed his exam with" +marks + "marks");
		
		}
	}

}





public class error_exception {
public static void main(String[]args) {
students sc= new students(45);
sc.pass(45);
	
	
}
}
