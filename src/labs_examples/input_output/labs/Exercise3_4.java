package labs_examples.input_output.labs;


// *    4) Demonstrate the use of the DataInputStream and DataOutputStream -- around 20 min mark of byte video

import java.io.*;

public class Exercise3_4 {


    public static void main(String[] args) {
        String lineOne = "this is the first line of text";
        String lineTwo = "this is the 2nd line of text";

        String filePath = "src/labs_examples/input_output/files/exercise3-4.txt";

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(filePath)))
        {
            System.out.println(lineOne);
            dataOut.writeUTF(lineOne);

            System.out.println(lineTwo);
            dataOut.writeUTF(lineTwo);


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println("---");
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream(filePath)))
        {
            lineOne = dataIn.readUTF();
            System.out.println(lineOne);

            lineTwo = dataIn.readUTF();
            System.out.println(lineTwo);


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

