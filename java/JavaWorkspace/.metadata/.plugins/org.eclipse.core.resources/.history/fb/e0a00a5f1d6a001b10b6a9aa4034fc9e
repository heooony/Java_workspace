package cleaning;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileService {
	static String path = System.getProperty("user.dir");
	
    public static void fileOpen() {
    	try{
    		File file = new File(path + "\\src\\cleaning\\" + "PreviousStudent.java");
    		FileReader filereader = new FileReader(file);
    		BufferedReader bufReader = new BufferedReader(filereader);
    		String line = "";
    		while((line = bufReader.readLine()) != null){
    			Student.previousStudent[Student.previousStudentLength] = line;
    			Student.previousStudentLength++;
    		}
    		bufReader.close();
    	}
    	catch (FileNotFoundException e) {}
    	catch(IOException e){System.out.println(e);}
    }
    
    public static void fileClose(String name []) {
    	File file = new File(path + "\\src\\cleaning\\" + "PreviousStudent.java");
    	try {
    		FileWriter fw = new FileWriter(file);
    		for(int i = 0; i < StudentService.count; i++) {
    			fw.write(name[i]);
    			if(i != StudentService.count - 1) {
    				fw.write("\n");
    			}
    		}
    		fw.close();
    	} catch (IOException e){
    		e.printStackTrace();
    	}
    }
}