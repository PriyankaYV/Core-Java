class Taskx implements Runnable{
	public synchronized static void check(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public void run(){
		check();
	}
}