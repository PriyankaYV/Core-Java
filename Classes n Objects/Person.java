package com.feli.ems.per;
class Person{
	
	String name;
	int age;
	
	Public void accept() throws IOException{
	
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("enter the name of person");
		name = br.readLine();
		System.out.println("enter the age of person");
		age = br.readLine();
		
	}
	public void check(){
		if(age<18)
			System.out.println("young");
			else if(age>18 && age<50)
				System.out.println("adult");
			else
				System.out.println("aged");
	}
	
}