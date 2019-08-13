public class q10 // to find the index of the first term in the fibonacci sequence to contain 1000 digits.
{
    public static void main(String args[])
    {
        int a=1,b=1,c=0,p=2;
        while(c>=0)
        {
            c=a+b;
            x=c;
            p++;
       
            String x=c;
            int t=x.length();
             if(t==1000)
             {
               System.out.println(p);
              }
             a=b;
             b=c;
          }
    }
}
