package Unit_01;

/*
 * operators in java is a symbol that is used to perform operations 
 * sum=a+b;
 * 	for example: +,-,*,/
 * 	#types of operators in java
 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc] * 		-Arithmatic operators: {*,-,/,+,%}
 * 		-Shift operators: {<< , >>}
 * 		-relational operators: {> < <= >= !=
 * 		-Bitwise operators : {& ^ |}
 * 		-Logical operators : {&& ||}
 * 		-ternary operators: {? : }
 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
 */

public class P3_Task02_OperatorsInJava {
	

			public static void main(String[] args) 
			{
				
				OperatorsInJava obj = new OperatorsInJava();

				obj.UnaryOperator();
				obj.ArithmeticOperator();
				obj.ShiftOperator();
				obj.RelationalOperator();
				obj.BitwiseAndLogicalOperator();
				obj.TernaryOperator();
				obj.AssignmentOperator();
				
			}
		}
		class OperatorsInJava
		{
			void UnaryOperator() {
				int a=10;
				boolean b = false;
				System.out.println("inside unary operator");
				System.out.println(a++);
				System.out.println(++a);
				System.out.println(a--);
				System.out.println(--a);
				
				
			}
			public void AssignmentOperator() {
				// TODO Auto-generated method stub
				
			}
			public void TernaryOperator() {
				// TODO Auto-generated method stub
				
			}
			public void BitwiseAndLogicalOperator() {
				// TODO Auto-generated method stub
				
			}
			public void RelationalOperator() {
				// TODO Auto-generated method stub
				
			}
			public void ShiftOperator() {
				// TODO Auto-generated method stub
				
			}
			void ArithmeticOperator()
			{
				int a=10,b=5;
				System.out.println(a+b);
				System.out.println(a-b);
				System.out.println(a*b);
				System.out.println(a/b);
				System.out.println(a%b);
			}
			void shiftop()
			{
				System.out.println(10<<2);
				System.out.println(10>>2);
			}
			void relationalop() {
				int a=10,b=5;
				System.out.println(a==b);
				System.out.println(a!=b);
				System.out.println(a>=b);
				System.out.println(a<=b);
			}
			//Bitwise = second operator is also checked but not in logical && even in ||
			void bitwise()
			{
				int a=10,b=5,c=20;
				//logical && bitwise &
				System.out.println(a>b||a<c);
				System.out.println(a>b|a<c);
				System.out.println(a>b||a++<c);
				System.out.println(a);//10 because second condition is not checked
				System.out.println(a>b|a++<c);
				System.out.println(a);//11because second is checked
				
				System.out.println("bitwise inclusive or:"+(12|12));//1100 | 1100 = 1100
				System.out.println("bitwise exclusive or:"+(12^12));//1100 ^ 1100 = 0000
				System.out.println("\n");
				
			}
			void ternaryOp()
			{
				System.out.println("ternary operator");
				int a = 2;
				int b = 5;
				int min = (a<b) ? a : b;
				System.out.println(min);
		    }
			void assignmentOp()
			{
				System.out.println("assignment operator");
				int a = 10;
				int b = 20;
				a+=4;
				b-=4;
				System.out.println(a);
				System.out.println(b);
				
		    }
		}
