class StringClub {

   public static void main(String[] args){
             String str="Java is a programming language";
			 String str1=" ";
			 String str2=str1.concat(str);
			
			// char space=' ';
			char[] cArray=str2.toCharArray();			
			char[] arr=new char[30];
			//int ele=(int)space;
			for(int i=0; i<cArray.length; i++){
			   if(' '==cArray[i]){
			         arr[i]=cArray[i+1];
					 
			    System.out.print(arr[i]);		 
				}
				
                else{
				    continue;
                }
            }
			        
   
   }
 }
 