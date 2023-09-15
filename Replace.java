import java.io.*;

public class Replace {
    public static void main(String[] args) throws IOException{
        Reader br = new FileReader("FileDemo3.txt");
        Writer w = new FileWriter("FileDemo.txt");

        int r = br.read();
        String str = "";
        int c=0;
        String k="This";
        try
        {
            while(r != -1)
            {
                str = str + (char)r;
                
                
                if((char)r == ' ')
                {
                    if(str.equals(k))
                    {
                        w.write("That");
                        c++;
                    }
                    else
                    {
                        w.write(str);
                    }
                    str = "";
                }
                r = br.read();
            }
        }
        catch(Exception e)
        {
            e.fillInStackTrace();
        }

        System.out.println(c);

    }
}
