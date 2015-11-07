class StringReverse {
 
	public static void main(String[] args) {
		 
		String str="Felight";
		char[] cArray=str.toCharArray();
		   int index=0;
		   char[] arr=new char[cArray.length];
		for(int i=cArray.length-1; i>=0; i--) {
		        
               // System.out.println(cArray[i]);	
			arr[i]=cArray[i];	
		}
		   
		for(int i=cArray.length-1; i>=0; i--) {
		        
             System.out.print(arr[i]);	
			
		}
	}
}	