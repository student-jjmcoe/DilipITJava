
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assignment Operator
		System.out.println("********= Operator********");
		int a = 20;
		String name = "Shweta";
        //Arithmetic op
		System.out.println("********+,-,/,*,% Operator********");
		int x = 10;
		int y = 20;
		int z= x+y;
		System.out.println("Addition="+z);
		z= y-x;
		System.out.println("Substraction="+z);
		z=y/x;
		System.out.println("Division="+z);
		z=x*y;
		System.out.println("Multiplication="+z);
		z=y%x;
		System.out.println("Reminder="+z);
		
		//Unary op
		System.out.println("********+.- Operator********");
		int d= 10;
		int b = +39;
		int c = -40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		System.out.println(+c);
		System.out.println(-c);
		
		System.out.println("********++,-- Operator********");
		int x1 = 100;
		int y1 = ++x1;
		System.out.println(x1);
		System.out.println(y1);
		
		int m = 999;
		int n = m++;
		System.out.println(n);
		System.out.println(m);
		
		int val1 = 200;
		System.out.println(val1++);
		System.out.println(++val1);
		System.out.println(val1--);
		System.out.println(--val1);
		
		System.out.println(m++ + --n);
		
		System.out.println("******** ! Operator********");
		boolean areYouHappy = true;
		System.out.println(areYouHappy);
		System.out.println(!areYouHappy);
		areYouHappy = !areYouHappy;
		System.out.println(areYouHappy);
		System.out.println(!areYouHappy);
		
		//Relational op
		System.out.println("******** == Operator********");
		int a1 = 1000;
		int b1 = 1000;
		boolean sameValue = a1==b1;
		System.out.println(sameValue);
		
		int a2 = 1000;
		int b2 = 1001;
	    sameValue = a2==b2;
		System.out.println(sameValue);
		
		System.out.println("******** != Operator********");
		int a3 = 100;
		int b3 = 200;
		boolean isNotSame = a3!=b3;
		System.out.println(isNotSame);
		
		int a4 = 100;
		int b4 = 100;
		isNotSame = a4!=b4;
		System.out.println(isNotSame);
		
		System.out.println("******** > Operator********");
		int Asalary = 3000000;
		int Bsalary = 2000000;
		System.out.println(Asalary > Bsalary);
		System.out.println(Bsalary > Asalary);
		
		int A1salary = 3000000;
		int B1salary = 3000000;
		System.out.println(A1salary > B1salary);
		System.out.println(B1salary > A1salary);
		
		System.out.println("******** >= Operator********");
		System.out.println(Asalary >= Bsalary);
		System.out.println(Bsalary >= Asalary);
		
		System.out.println(A1salary >= B1salary);
		System.out.println(B1salary >= A1salary);
		
		System.out.println("******** < Operator********");
		int salaryOfA = 3000000;
		int salaryOfB = 2000000;
		System.out.println(salaryOfA < Bsalary);
		System.out.println(Bsalary < salaryOfA);
		
		int salaryOfA1 = 3000000;
		int salaryOfB1 = 3000000;
		System.out.println(salaryOfA1 < salaryOfB1);
		System.out.println(salaryOfB1 < salaryOfA1);
		
		System.out.println("******** <= Operator********");
		System.out.println(salaryOfA <= salaryOfB);
		System.out.println(salaryOfB <= salaryOfA);
		
		System.out.println(salaryOfA1 <= salaryOfB1);
		System.out.println(salaryOfB1 <= salaryOfA1);
		
		System.out.println("***********Questions***********");
		System.out.println("Q.1");
		int  p = 5;
		p = p++ + ++p;
		System.out.println(p);
		
		System.out.println("Q.2");
		int  p1 = 10;
		int q1 = p1++ + 5;
		System.out.println(q1);
		
		System.out.println("Q.3");
		int p2 = 10;
		int q2 = ++p2 + p2++;
		System.out.println("p2: "+p2);
		System.out.println("q2: "+q2);
		
		System.out.println("Q.4");
		int p3 = 5;
		int q3 = p3++ + --p3 + ++p3 - p3--;
		System.out.println(q3);
		
		System.out.println("Q.5");
		int p4 = 7;
		int q4 = p4-- + --p4;
		System.out.println(q4);
		
		System.out.println("Q.6");
		int p5 = 2;
		int q5 = ++p5 + p5++ + --p5;
		System.out.println(q5);
		
		System.out.println("Q.7");
		int p6 = 5;
		int q6 = p6++ + ++p6 + p6++;
		System.out.println(q6);
		
		System.out.println("Q.8");
		int i = 4;
		int j = --i + i-- + i++;
		System.out.println(j);
		
		//conditional/logical op
		//person 1
		int percentage = 80;
		char gender = 'F';
		boolean result = percentage>70 && gender=='F';
		System.out.println("is Person 1 eligible:"+result);
		
		//person 2
		int percentage2 = 80;
		char gender2 = 'M';
		result = percentage2>70 && gender2=='F';
		System.out.println("is Person 2 eligible:"+result);
		
		int percentage3 = 80;
		char gender3 = 'F';
		result = percentage3 >70 || gender3=='F';
		System.out.println("is Person 3 eligible:"+result);
		
		//person 4
		int percentage4 = 80;
		char gender4 = 'M';
		result = percentage4 >70 || gender4=='F';
		System.out.println("is Person 4 eligible:"+result);
		
		//person 5
				int percentage5 = 60;
				char gender5 = 'M';
				result = percentage5 >70 || gender5=='F';
				System.out.println("is Person 5 eligible:"+result);
				
		//ternary Op
		int a_ = 60;
		int b_ = 800;
		int x_ =a_>b_ ? b_ : a_;
		System.out.println("Min no.= "+ x_);	
		
		int a_1 = 60;
		int b_1 = 800;
		int x_1 =a_1>b_1 ? a_1 : b_1;
		System.out.println("Max no.= "+ x_1);
		
		percentage=60;
		gender ='F';
		String isEligible = percentage > 70 && gender == 'F'?"Eligible" : "Not Eligible";
		System.out.println(isEligible);
    }

}

























































