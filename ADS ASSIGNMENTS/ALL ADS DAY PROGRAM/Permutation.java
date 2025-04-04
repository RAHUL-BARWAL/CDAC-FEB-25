import java.util.Scanner;
class Permutation
{
  public static void display(String str, String res)
   {
     if(str.length() == 0)
       {
          System.out.println(res + " ");
           return;
       }
        for(int i=0; i< str.length(); i++)
         {
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            display(ros, res+ch);
   }
  }
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
     String string = sc.next();
      display(string,"");
}
}