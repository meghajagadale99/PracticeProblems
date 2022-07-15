package FileIO;

import java.io.IOException;
import java.io.OutputStream;

public
class FileOutputStream extends OutputStream {
    public
    FileOutputStream(String s) {
        
    }

    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public
    void write(int b) throws IOException {

    }
}
