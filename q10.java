public class q10 //to find the sum of all primes below two million
{
    public static void main(String args[])
    {
        int x,i,f=0;
        long s=2;
        for(x=3;x<=2000000;x+=2)
        {
            for(i=3;i<=Math.sqrt(x);i+=2)
            {
                if(x%i==0)
                {
                    f=1; 
                }
            }
           if(f==0)
           {
            s=s+x; 
            }
            f=0;
        }
        System.out.println(s);
    }
}
