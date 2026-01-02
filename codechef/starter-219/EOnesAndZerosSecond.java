import java.util.*;

public class EOnesAndZerosSecond {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    solve(sc);
		}

	}
	public static void solve(Scanner sc){
	    List<Integer>lst= new ArrayList<>();
	    int n= sc.nextInt();
	    String str= sc.next();
	    int sum=0;
	    
	    for(int i=0; i<n; i++){
	        if(str.charAt(i)=='1')
	        lst.add(i);
	    }
	   // System.out.println(q);
	    if(lst.size()==0){
	        System.out.println(0+ " "+ 0);
	        return ;
	    }
	    //System.out.println(lst);
	    long swap =0;
	    for(int i=0; i<lst.size(); i++){
	        if(lst.get(i)<=2*i)continue;
	        if(n>2*i)
	           swap+= lst.get(i) - 2 *i ;
	       else break;
	    }
	    //System.out.println(Arrays.toString(graph));
	    
	    System.out.println(Math.min(2*lst.size() , n)+" "+swap);
	}
}

