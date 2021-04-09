package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *
 *
 */

public class Exercise33 {
    public static void main(String[] args) {
        bByteStream();
        bCharacterStream();
    }

    public static void bCharacterStream() {
        BufferedReader input = null;
        PrintWriter output = null;
        try {
            input = new BufferedReader(new FileReader("src/labs_examples/input_output/files/Exercise33_char_data"));
            output = new PrintWriter(new FileWriter("src/labs_examples/input_output/files/Exercise33_char_data_out"));
            String s;
            while((s = input.readLine()) != null) {
                output.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                input.close();
                output.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void bByteStream () {
        FileInputStream input = null;
        BufferedInputStream bInputStream = null;

        try {
            input = new FileInputStream("src/labs_examples/input_output/files/Exercise33_byte_data");
            bInputStream = new BufferedInputStream(input);
            byte[] b = new byte[8]; // why does it output this way?
            int i = 0;
            while((i = bInputStream.read(b)) != -1) {
                System.out.println(new String(b, 0, i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                bInputStream.close();
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}
