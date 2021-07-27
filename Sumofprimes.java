import java.util.*;
import java.io.*;
public class Sumofprimes
{
    static int n=5000000;
    static boolean prime[]=new boolean[n+1];
    static void sieve(int n)
    {
        for(int i=0;i<=n;i++)
        {
            prime[i]=true;
        }
        prime[0]=false;
        prime[1]=false;
        for(int x=2;x*x<=n;x++)
        {
            if(prime[x]==true)
            {
                for(int i=x*x;i<=n;i+=x)
                {
                    prime[i]=false;
                }
            }
        }
    }
    public static void main(String args[]) throws IOException
    {
        sieve(n);
        int t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            int a,b;
            int sum=0;
            String ab[]=br.readLine().trim().split("\\s+");
            a=Integer.parseInt(ab[0]);
            b=Integer.parseInt(ab[1]);
            for(int i=1;i<=b;i++)
            {
                if(prime[i]==true)
                sum+=i;
            }
            System.out.println(sum);
            sum=0;
            t--;
        }
    }
}

output:

1
1 6
10