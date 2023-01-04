import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Boxer implements Serializable {

    private int width;
    private int height;
    
    public void setWidth(int w) {
        width = w;
        }

        public void setHeight(int h) {
            height = h;
        }

    public static void main(String[] args) throws IOException {
        Boxer myBox = new Boxer();
        myBox.setHeight(320);
        myBox.setWidth(30);

        FileOutputStream fs = new FileOutputStream("foo.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(myBox);
        os.close();

        FileInputStream fileStream = new FileInputStream("foo.ser");
        ObjectInputStream osi = new ObjectInputStream(fileStream);

        try {
            Object one = osi.readObject();
        } catch (ClassNotFoundException e) {            
            e.printStackTrace();
        }

        osi.close();        

    }
}