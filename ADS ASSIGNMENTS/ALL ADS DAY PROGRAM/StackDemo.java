class Stack
 {
   static final int MAX = 7;
   int top;
   int arr[] = new int [MAX];
   
   Stack()
   {
	   top = -1;
   }
   boolean isEmpty()
   {
	   return top < 0;
   }
   boolean isFull()
   {
	   return top > MAX-1;
   }
   
   boolean push(int x)
   {
	   if(top >= (MAX-1))
	   {
		   System.out.println(" Stack Overflow");
		   return false;
	   }
	   else
	   {
		   arr[++top] = x;
		   System.out.println(x + " Element Pushed");
		   return true;
	   }
   }
   
   int pop()
   {
	   if(top < 0)
	   {
		   System.out.println(" Stack Underflow");
		   return 0;
	   }
	   else
	   {
		 int x = arr[top--];
		 return x;
	   }
   }
   int peek()
   {
	   if(top < 0)
	   {
		   System.out.println(" Stack Underflow");
		   return 0;
	   }
	   else
        {
	      int x = arr[top];		    
		  return x;
	   }
   }
 }
 
 class StackDemo
 {
	 public static void main(String[] arg)
	 {
	    Stack stack = new Stack();
        stack.push(10);
		stack.push(40);
		stack.push(80);
		stack.push(90);
  		  
		System.out.println(stack.peek());
		System.out.println(stack.pop());		
		System.out.println(stack.peek());  
	 }
 }