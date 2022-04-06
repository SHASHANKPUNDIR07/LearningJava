package Unit_01;

/* * Java provides three types of control flow statements.
   * -Decision making statements: 
   *    -if statements
   *    -switch statements 
    
    *-Loop Statements 
    *   -do while Loop 
    *   -while Loop 
    *   -for Loop 
    *   -for-each Loop *
    
    *-Jump Statements
    *    -break statement 
    *    -continue statement
    */
public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
	
		Statements obj = new Statements();
		
		obj.DecisionMakingStatements(); //objects are created to access the classes
		obj.LoopStatements();
		obj.JumpStatements();
	}
}
class Statements
{
	
	void DecisionMakingStatements() 
	{
		int x = 10;
		int y = 12;
		if(x + y < 10)
		{
			System.out.println("x+y is less than 10");
		}
		else
		{
			System.out.println("x+y is greater than 20");
		}
		int num = 2;
		
		switch(num)
		{
		case 0:
			System.out.println("Number is 0");
		    break;
		case 1:
			System.out.println("Number is 1");
			break;
		default:
			System.out.println(num);	
		}
	}
	void LoopStatements()
	{
		int sum = 0;
		for(int j = 1;j<=10;j++) {
			sum = sum + j;
		}
		System.out.println("the sum of first 10 natural number is "+ sum);
		
		String[] names = {"Java","C","C++","Python","javaScript" };
		System.out.println("printing the contents of the array names:\n");
		for(String name : names) {
			System.out.println(name);
		}
		int i = 0;
		System.out.println("the first 10 even numbers\n");
		do {
			System.out.println(i);
			i = i + 2;
		}
		while(i <= 10);
	}
	
	void JumpStatements()
	{
		for(int i = 0;i <= 10;i++)
		{
			System.out.println(i);
			if(i==6) {
			    break;	
			}
			System.out.println(i);
		}
		
		for(int i = 0;i <= 10;i++) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
