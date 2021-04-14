package labs_examples.input_output.labs;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream -- around 20 min mark of byte video
 *
 *
 */

public class Exercise31 {

    public static void main(String[] args) throws IOException {
        fileInputStream();


    }



    public static void fileInputStream () throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src/labs_examples/input_output/files/Exercise3-1");
            out = new FileOutputStream("src/labs_examples/input_output/files/Exercise3-1_out.txt");
            int c;
            while((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }

    }

}
