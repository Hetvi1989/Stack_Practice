import java.util.Scanner;

public class StackDriver {

	public static void main(String[] args) {
		StackPractise sp = new StackPractise(100);
		
		Scanner sc = new Scanner(System.in);
		int arr[];
		
		System.out.println("Enter the number of elements you want add in array");
		int size_of_stack = sc.nextInt();
		
		System.out.println("Enter the elemnts now");	
		for (int i = 0; i < size_of_stack; i++) {
			System.out.print("Enter element at position " +i + ": ");
			
			arr = new int[size_of_stack];
			
			arr[i] = sc.nextInt();}
		
		sp.printStack();
		
		System.out.println("Choose the option you want to perform");
		System.out.println("=====================================");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Minimum element in array");
		System.out.println("4. None");
		
		int option = sc.nextInt();
		
		
		switch(option) {
		case 1 :
			System.out.println("Enter the elment other than 0");
			sp.push(sc.nextInt());
			sp.printStack();
			break;
		case 2:
			System.out.println(sp.pop());
			break;
		case 3:
		System.out.println(sp.min);
		break;
		
		case 4:
			System.out.println("Choose correct option");
		}

	}

}
