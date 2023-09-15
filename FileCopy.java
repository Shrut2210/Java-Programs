import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException{
        FileInputStream fn = null;
        FileOutputStream fo = null;

        try
        {
            fn = new FileInputStream("FileDemo.txt");
            fo = new FileOutputStream("FileDemo2.txt");

            int i;
            while((i = fn.read()) != -1)
            {
                fo.write(i);
            }
        }
        finally
        {
            if(fn != null)
            {
                fn.close();
            }
            if(fo != null)
            {
                fo.close();
            }
        }
    }
}
