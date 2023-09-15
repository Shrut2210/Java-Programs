
import java.io.*;
public class Count {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("FileDemo.txt"));
        Reader r = new FileReader(("FileDemo.txt"));

        int i=r.read();
        int cc=1;
        int cw=1;
        int cl=0;
        try
        {
            while(i != -1)
            {
                cc++;
                if(i == ' ' || i == '\n')
                {
                    cw++;
                }
                i = r.read();
            }

            while(br.readLine() != null)
            {
                cl++;
            }
        }
        catch(Exception e)
        {
            e.fillInStackTrace();
        }

        System.out.println(cc + "\n" + cw + "\n" + cl);
    }
}
