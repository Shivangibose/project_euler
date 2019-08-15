public class q3 //to find the largest prime factor of 600851475143
{
    public static void main(String args[])
    {
        long x=600851475143l;
        long max;
        double i=Math.sqrt(x);
        for(int t=3;t<i;t=t+2)
        {
            while(x%t==0)
            {
                x=x/t;
            }
        }
        if(x>2)
        {
            System.out.println(x);
            max=x;
            System.out.println("largest="+max);
        }
    }
}
        
        
        
        
        
            
            
