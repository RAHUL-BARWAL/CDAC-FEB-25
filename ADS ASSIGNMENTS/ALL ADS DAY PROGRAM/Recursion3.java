class Recursion3
{
   public static int m1(int n)
    { 
       if(n<=1)
        {
           return n;
         } 
         return m1(n-1) + m1(n-2);
    }

    public static void main(String args[])
    {
      int number = 10;
      for(int i=1; i<=number;i++)
      {
         System.out.print(m1(i) + " ");
      }
    }
}