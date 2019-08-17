public class q7 // to find the 10001st prime number.

{

    public static void main(String args[])

    {
        int t=0,f=0;
        for(int x=1;x>0;x++)
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
            t++;
        }
        f=0;
        if(t==10001)
        {
            System.out.println(x);
        break;
    }
}

}

}
