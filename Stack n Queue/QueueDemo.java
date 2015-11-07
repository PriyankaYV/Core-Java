class QueueDemo{
	
	private static int capacity = 10;
	int[] arry = new int[capacity];
	int top = -1;
	int rear = 0;
	int size = 0;
	
	public void pushElmnts(int element){
		if(top<capacity-1){
			top++;
			arry[top] = element;
			System.out.println("element"+element+ "is pushed into queue");
			printarray();
		}
		else{
			System.out.println("overflow");
		}
	}
	public void pop(){
		if(top>=rear){
			
			rear++;
			System.out.println("pop operation done");
			printarray();
		}
		else{
		System.out.println("underflow");
		}
	}
	public void printarray(){
		if(top>=rear){
		
			for(int i=rear;i<=top;i++){
				System.out.println(arry[i]);
			}
		}
	}
}
			
			
	