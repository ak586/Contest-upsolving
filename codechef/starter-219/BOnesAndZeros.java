import java.util.Scanner;

public class BOnesAndZeros {
    public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t-- >0){
		   // System.out.println("Testcase : "+ t);
		    int a= sc.nextInt();
		    String str= sc.next();
		   // System.out.println("Str "+ str);
		    int c1=0;
		    int c0=0;
		    int ans=0;
		    for(int i=0; i<str.length(); i++){
		        if(str.charAt(i)=='0') c0++;
		        else c1++;
		        if(c1!=0 && c1>=c0) ans++;
		    }
		    System.out.println(ans);
		    
		}
		    
		}
}
