public class q5_1//to find the smallest positive number divisible by all numbers from 1 to 20
{
    public static void main(String args[])
    {
      int l=1;
      for(int i=1;i<=20;i++)//when I take i from 1 to 10 answer is 2520 which us correct
      {                     //when I take i from 1 to 20 answer is 18044195 but the correct answer is 232792560 
          l=lcm(l,i);
        }
        System.out.println(l);
    
       
    }
    
    public static int lcm(int x,int y)
    {
        int hcf=1;
        int least=0;
        if(x>y)
        {
            for(int j=1;j<=y;j++)
            {
                if(x%j==0 && y%j==0)
                {
                    hcf=j;
                }
            }
        }
            if(y>x)
            {
                for(int k=1;k<=x;k++)
                {
                    if(y%k==0 && x%k==0)
                    {
                        hcf=k;
                    }
                }
            }
            least=(x*y)/hcf;
            return least;
        
    }
}
   

          
            
              
             
             
                 
                 
        
    

        

             
                 
                 
        
    

        
