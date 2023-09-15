import java.io.*;
public class FileMethods {
    public static void main(String[] args) {
        File f = new File("FileDemo.txt");

        System.out.println(f.canRead());
        System.out.println(f.isAbsolute());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canWrite());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println((long)f.lastModified());
        System.out.println(f.length());
        System.out.println(f.getName());
    }
}
