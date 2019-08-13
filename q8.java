public class q8 //to find the sum of all the primes below two million.
{
    public static void main(String args[])
    {
        int s=0,f=0;
        for(int x=1;x<=2000000;x++)
        {
            for(int i=1;i<=x;i++)
            {
                if(x%i==0)
                {
                    f++;
                }
            }
            if(f==2)
            {
                s=s+x;
            }
            f=0;
        }
        System.out.println(s);
    }
}
