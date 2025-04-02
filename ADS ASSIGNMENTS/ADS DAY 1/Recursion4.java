class Recursion4
{
  public static int m1(int n)
  {
    if(n <= 1)
    {
      return n;
    }
     return m1(n-1) + m1(n-2);

  }
  public static void main(String args[])
  {
      int number = 20;
      for(int i=0; i<=number;i++)
      {
         System.out.println(m1(i));
      }
   }
}