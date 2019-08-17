public class q25 // to find the index of the first term in the fibonacci sequence to contain 1000 digits.

{

    public static void main(String args[])

    {

        int a=1,b=1,c=0,p=2;
        while(c>=0)
        {
           c=a+b;
            p++;
            String x=String.valueOf(c);
            int t=x.length();
             if(t==1000)
             break;
             a=b;
             b=c;
            }
              System.out.println(p);
            }
               
 }
