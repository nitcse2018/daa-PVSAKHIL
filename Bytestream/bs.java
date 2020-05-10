import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bs {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = null;
        FileOutputStream fw = null;
        try{
            fr = new FileInputStream("fr.txt");
            fw = new FileOutputStream("fw.txt");
            int k;
            while((k = fr.read()) != -1){
                fw.write((byte)k);
            }
        }
        finally{
            if(fr != null) fr.close();
            if(fw != null) fw.close();
        }
    }
}