public class q3 //to find the largest prime factor of 600851475143

{
    public static void main(String args[])
    {
        long x=600851475143L;
        long max;       
        for(long t=3;t<x;t=t+2)
        {
            while(x%t==0 && t<x)
            {
                x=x/t;
            }
        }
        max=x;
        System.out.println("largest prime factor="+max);
    }
}
        
        
        
            
            
