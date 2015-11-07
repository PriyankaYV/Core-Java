class AssignmentTask extends Thread{
	public static int num1 = 30;
	public static int num2 = 20;
	public static int result = 0;
	
	public void run(){
	
		Thread currentThread1 = Thread.currentThread();
		
		if(currentThread1.getName().equals("t1")){
			try{
				Thread.sleep(1000);
			}
			catch(Exception ex){
			}
			result = num1 + num2;
			System.out.println(result+" "+ System.currentTimeMillis()+" "+ currentThread1.getName());
		}
		
		if(currentThread1.getName().equals("t2")){
			try{
				Thread.sleep(2000);
			}
			catch(Exception ex){
			}
			result = result * 2;
			System.out.println(result+" "+ System.currentTimeMillis()+" "+ currentThread1.getName());
			
		}
		
		if(currentThread1.getName().equals("t3")){
			try{
				Thread.sleep(3000);
			}
			catch(Exception ex){
			}
			result = result *6;
			System.out.println(result+" "+ System.currentTimeMillis()+" "+ currentThread1.getName());
		}
		
	}
}
		
