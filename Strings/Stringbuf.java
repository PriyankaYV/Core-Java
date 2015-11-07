class Stringbuf{
	
	public static void main(String[] args){
	
		StringBuffer strb = new StringBuffer("felight rocks"); //String buffer u cant directly assign, you r supposed to create an object
		
		System.out.println(strb.append("rocks"));
		System.out.println(strb.insert(4,"rocks"));
		System.out.println(strb.replace(1,4,"wall12"));
		System.out.println(strb.delete(4,6));
		System.out.println(strb.reverse());
	}
}	