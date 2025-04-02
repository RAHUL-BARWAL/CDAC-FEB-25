class Recursion6
{
   public int m1(int n)
    {
       if(n > 0)
        {
           return n+m1(n-1);
        }
	else
  	  return n;
     }
   public static void main(String args[])
   {
      int number = 10;
      Recursion6 r = new Recursion6();
      System.out.print("Sum: " + r.m1(5));
   }
}