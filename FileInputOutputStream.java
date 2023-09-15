import java.io.*;
import java.util.Scanner;
public class FileInputOutputStream {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fo = new FileOutputStream("FileDemo.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter anything...");
            String s = sc.nextLine();

            byte b[] = s.getBytes();
            fo.write(b);
            fo.close();
        }catch(Exception e)
        {
            e.fillInStackTrace();
            System.out.println(e);
        }


        try
        {
            FileInputStream fi = new FileInputStream("FileDemo.txt");
            int i=0;
            while((i = fi.read()) != -1)
            {
                System.out.print((char)i);
            }
            fi.close();
        }
        catch(Exception e)
        {
            e.fillInStackTrace();
        }
            
    }
}
