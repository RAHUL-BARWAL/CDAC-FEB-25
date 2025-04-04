import java.util.Scanner;
class Stack
 {
	 static final int MAX = 7;
	 int top;
	 int arr[] = new int[MAX];
	 
	 Stack()
	 {
		 top = -1;
	 }
	 boolean isEmpty()
	 {
		 return (top < 0);
	 }
	 boolean isFull()
	 {
		 return (top > MAX-1);
	 }
	 boolean push(int x)
	 {
		 if(top >= (MAX-1))
		 {
			 System.out.println("Stack Overflow");
			 return false;
		 }
		 else
		 {
			 x = arr[++top];
			 System.out.println("Stack Overflow");
			 return true;
		 }
	 }
	 
	 int pop() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = arr[top--]; 
			return x; 
		} 
	} 
	 int peek()
	 {
		 if(top > 0)
		 {
			 System.out.println("Stack Underflow");
			 return 0;
		 }
		 else
		 {
			int x = arr[top];
			 return x;
		 }
	 }
 }

class StackDemo1
 {
	 public static void main(String[] args)
	 {
		 Stack s = new Stack(); 
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n******** MENU *******");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. IS EMPTY?");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value: ");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped != -1)
                        System.out.println("Popped element: " + popped);
                    break;
                case 3:
                    int top = s.peek();
                    if (top != -1)
                        System.out.println("Top element: " + top);
                    break;
                case 4:
                    System.out.println("Is stack empty? " + s.isEmpty());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice! Please enter a valid option.");
            }
            System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
        } while (sc.nextInt() == 1);

        sc.close();

	 }
 }