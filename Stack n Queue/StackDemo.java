public class StackDemo{
	public static int capacity = 3;
	public static int[] arry = new int[capacity];
	int top = -1;
	
	public void push(int pushedElement){
		if(top < capacity-1){
			top++;
			arry[top] = pushedElement;
			System.out.println("elements" + pushedElement+" is pushed into the stack");
			printarray();
		}
		else{
		System.out.println("Stack overflow");
		}
	}
	public void pop(){
		if(top>=0){
			top--;
			System.out.println("pop operation done");
			printarray();
		}
		else{
			System.out.println("stack underflow");
		}
	}
	public void printarray(){
		if(top>=0){
		
			for(int i=0;i<=top;i++){
				System.out.println(arry[i]);
			}
		}
	}
}
	
			
			