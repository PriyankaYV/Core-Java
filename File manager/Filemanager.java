import java.io.*;
class Filemanager{

	public boolean writeToFile(String filename, String data){
		
		try{
		File file = new File(filename);
		if(file.exists()){
			FileWriter filewriter = new FileWriter(file,true);
			filewriter.write(data);
			filewriter.close();
			return true;
		}else{
			file.createNewFile();
			return writeToFile(filename,data);
		}
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}
}
