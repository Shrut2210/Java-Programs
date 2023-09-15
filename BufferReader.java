import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws IOException{

        PrintWriter pw = new PrintWriter("FileDemo.txt");

        BufferedReader br = new BufferedReader(new FileReader("FileDemo2.txt"));

        String line = br.readLine();
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("FileDemo3.txt"));

        line = br.readLine();

        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        pw.close();
        br.close();

    }
}
