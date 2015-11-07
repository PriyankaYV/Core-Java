class MotherTest{
	public static void main(String[] args){
	
		Mother.son dave = new Mother().new son();
		dave.dosomething();
		//To call non static inner class we should instantiate both mother and son class
		
		Mother.Daughter pyv = new Mother.Daughter();
		pyv.dosomething();
		// to call static inner class 
	}
}