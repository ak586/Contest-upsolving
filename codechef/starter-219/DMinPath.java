package Contest-upsolving.codechef.starter-219;

public class DMinPath {
    	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc= new Scanner(System.in);
	  int t= sc.nextInt();
	  while(t-->0){
	      
	      int n =sc.nextInt();
	      if(n<=2) System.out.println("-1");
	      else{
	          for(int i=0; i<n; i++){
	              for(int j=0; j<n; j++){
	                  if(i==0 || j==n-1) System.out.print(1);
	                  else if(i<=2 && (j==n-2)) System.out.print(1);
	                  else System.out.print(0);
	                  
	                  if(j!=n-1)System.out.print(" ");
	              }
	              System.out.println();
	          }
	      }
	  }

	}
}
