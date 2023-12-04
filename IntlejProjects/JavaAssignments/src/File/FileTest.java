package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {

       // File fis=new File("D:\\IntlejProjects\\JavaAssignments\\Myfolder1\\Myfolder2\\Myfolder3");
       // fis.createNewFile();
        //System.out.println(fis.exists());
        // fis.mkdirs();
        //  fis.delete();
      //  System.out.println(fis.getAbsolutePath());
       // System.out.println(fis.getCanonicalPath());
      //  fis.createNewFile();

        File file = new File("D:\\IntlejProjects\\", "\\JavaAssignments\\FIles\\Ravi2.txt");
        file.createNewFile();

        FileWriter fw=new FileWriter(file);
        fw.write('d');
        fw.write('w');
        fw.flush();
        fw.close();

        FileReader fr=new FileReader(file);

        int charcter;
        while((charcter=fr.read())!=-1)
        {
            System.out.println((char) charcter);
        }
        fr.close();

    }
}
