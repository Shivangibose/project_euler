public class q4 // to find the largest palindrome made from the product of two 3-digit number.
{ 
    public static void main(String args[])
    {
        int p,d=0,n,r=0,max=0;
        for(int a=100;a<=999;a++)
        {
            for(int b=100;b<=999;b++)
            {
                p=a*b;n=p;
                while(p>0)
                {
                    d=p%10;
                    r=(r*10)+d;
                    p=p/10;
                }
                if(n==r&&n>max)
                {
                    max=r;
                    r=0;
                }
            }
        }
        System.out.println(max);
    }
}
                
