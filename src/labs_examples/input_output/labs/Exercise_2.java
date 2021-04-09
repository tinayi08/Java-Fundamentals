package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, head back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
public class Exercise_2 {


    public static void main(String[] args) throws IOException {
        String filePath = "src/labs_examples/input_output/files/char_data.txt";
        String outFilePath = "src/labs_examples/input_output/files/Exc2.txt";
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(filePath);
            fw = new FileWriter(outFilePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int c;
            while((c=fr.read()) != -1) {
                //if (c == 97) {
                //    c = 126;
                //}
                fw.write(c-5);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                fr.close();
            }
            if(fw != null) {
                fw.close();
            }
        }


    }


//    public static void readCharByCharAndChangeChar (String filePath,String outFilePath) throws IOException {
//        FileReader fr = new FileReader(filePath);
//        FileWriter fw = new FileWriter(outFilePath);
//        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int c;
//        while((c=fr.read()) != -1) {
//            fw.write(c);
//        }
//            String str = br.readLine();
//            fw.write(str.replace('a','-'));
//    }


}
