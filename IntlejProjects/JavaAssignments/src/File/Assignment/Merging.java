package File.Assignment;

import java.io.*;

public class Merging {
    public static void main(String[] args) throws IOException {

        File fis=new File("Test1.txt");
       // FileWriter fw=new FileWriter(fis);
        PrintWriter fw=new PrintWriter(fis);
        fw.println("111");
        fw.println("222");
        fw.println("333");
        fw.flush();
        fw.close();

        //FileReader fr=new FileReader(fis);
        FileReader fr=new FileReader(fis);
        BufferedReader br=new BufferedReader(fr);

        File fis1=new File("Test2.txt");
        FileWriter fw1=new FileWriter(fis1);
        fw1.write("aaa");
        fw1.write("bbb");
        fw1.write("ccc");
        fw1.flush();
        fw1.close();

        File fis2=new File("Test3.txt");
        PrintWriter pr=new PrintWriter(fis2);

        String s=br.readLine();
        while(s!=null)
        {
            System.out.println(s);
          pr.println(s);
          pr.flush();
         s=br.readLine();
        }
        pr.close();

//         File file = new File("abc.txt");
//        FileWriter Fw = new FileWriter(file); // new file will be created. override
//        FileWriter Fw2= new FileWriter("abc.txt");// new file will be created. override
//        FileWriter Fw3 = new FileWriter("abc.txt",true); // append to existing file
//        FileWriter Fw4= new FileWriter(file, true);// append to existing file
//        Fw4.write("Nikit");





    }
}
