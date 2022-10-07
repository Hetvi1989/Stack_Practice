
public class StackPractise {
	int size_of_stack;
	int arr[] = new int [size_of_stack];
	int current_position;
	int min; 	
	
	StackPractise(int size_of_stack ){
		current_position = -1;
		min = 0;
	}
	
	boolean push(int x ) {
		
		if(current_position>=size_of_stack-1) {
			System.out.println("Stack is overflow");
			return false;
		}
		else {
			arr[++ current_position] = x;
			System.out.println(x + " is pushed in stack");
			return true;
		}
	}
	
	int pop() {
		if(current_position< 0) {
			System.out.println("Stack is underflow");
			return 0;
		}
		else {
			int x = arr[current_position--];
			return x;
		}
	}
	void printStack() {
		for (int i = current_position; i > -1; i--) {
			System.out.print(" " + arr[i]);
		}
	}
		
		int setMin() {
			if (current_position == 0) {
				min = arr[0];
				return min;
			}
			for (int i = current_position; i<=current_position; i++) {
					if (arr[i]<arr[i+1]) {
						min = arr[i];
					}
					else {
						min = arr[i+1];
					}
				}
			return min;
			}
		
}



