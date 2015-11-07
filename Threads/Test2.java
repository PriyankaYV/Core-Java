class Test2{
	public static void main(String[] args){
		
		System.out.println("Task1");
		System.out.println("Task2");
		
		Tasky ty = new Tasky();
		ty.setName("Good Thread");
		
		Taskx tx = new Taskx();
		Thread thx = new Thread(tx);
		thx.setName("Bad Thread");
		
		Thread trx = new Thread(new Taskx());
		trx.setName("Ugly Thread");
		
		ty.start();
		thx.start();
		trx.start();
		
		try{
			thx.sleep(1000);
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		
		
		
		System.out.println("Task3");
		System.out.println("Task4");
	}
}
		
		