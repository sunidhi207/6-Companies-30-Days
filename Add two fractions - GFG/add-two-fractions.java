//{ Driver Code Starts
import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}
// } Driver Code Ends

class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        int num_sum=num1*den2+num2*den1;
        int den_sum=den1*den2;
        int i;
        if(den1==den2)
        {
            System.out.println(num1+num2+"/"+den1);
        }
     for(i=2;i<=99;i++)
            {
                if(num_sum%i==0 && den_sum%i==0)
                {
                num_sum=num_sum/i;
                den_sum=den_sum/i;
                i--;
                }
            }
            System.out.println(num_sum+"/"+den_sum);
        
    }
}