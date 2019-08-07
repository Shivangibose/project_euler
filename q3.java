public class q3
{
    public static void main(String args[])
    {
        long x=600851475413l,f=0,a=0;
        for(long i=3;i<(x/2);i=i+2)
        {
            if(x%i==0)
            for(long t=1;t<=i;t++)
            {
                if(i%t==0)
                f++;
            }
            if(f==2)
            {
                a=i;
                f=0;
            }
        }
        System.out.println(a);
    }
}
            
            
            