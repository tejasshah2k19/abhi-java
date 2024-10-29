import java.io.File; 
import java.io.IOException;
public class FileDemo {
    public static void main(String[] args) throws IOException{

        File f = new File("c:\\tmp\\data.txt");
        //above line will not create file 
 
        //how to create file 
        f.createNewFile();//this will create new file 
        //above method will check file is present then do not create file 
        //if file is not present then create file 

        // create folder 
        File d = new File("c:\\tmp\\abhi"); 
        d.mkdir();
        
        f.delete();//remove file 
        d.delete();//remove folder -> folder must be empty 
    
        
        //create a folder and then create file inside it 

        File folder = new File("c:\\tmp\\abhi"); 
        folder.mkdir(); 

        File file = new File(folder,"Abc.java"); 
        file.createNewFile(); 
    
    }
}
