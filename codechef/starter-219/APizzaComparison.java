import java.util.*;
import java.lang.*;
import java.io.*;
/* https://www.codechef.com/problems/PIZZACOMP?tab=statement */
// Problem A
class APizzaComparison
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t-- >0){
		    int a;
		    int b;
		    
		    a = sc.nextInt();
		    b = sc.nextInt();
		    
		    double cost1= (double)100/a;
		    double cost2= (double)225/b;
		    if(cost1<cost2)System.out.println("Large");
		    else if(cost1>cost2) System.out.println("Small");
		    else System.out.println("Equal");
		    
		    
		}

	}
}
