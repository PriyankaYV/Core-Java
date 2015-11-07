class TestA{

	public static void main(String[] args){
	
		AssignmentTask task1 = new AssignmentTask();
		task1.setName("t1");
		task1.start();
		
		AssignmentTask task2 = new AssignmentTask();
		task2.setName("t2");
		task2.start();
		
		AssignmentTask task3 = new AssignmentTask();
		task3.setName("t3");
		task3.start();
	}
}