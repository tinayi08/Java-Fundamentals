package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodTraining {
    public static void main (String[] args) {
        int a = 5;
        int b = 6;
        int c = 2;
        int multi1 = multiply(a, b, c);
        System.out.println(multi1);
        passByValue(a);
        int multi2 = multiply(a, b);
        System.out.println(multi2);

       //4
        Scanner scan = new Scanner(System.in);
//        System.out.println("Provide a word:");
//        String word = scan.next();
//        consonants(word);

       //6
//        System.out.println("Provide a number:");
//        int num = scan.nextInt();
//        prime(num);

        //3
//        System.out.println("Provide number 1");
//        int one = scan.nextInt();
//        System.out.println("Provide number 2");
//        int two = scan.nextInt();
//        System.out.println("Provide number 3");
//        int three = scan.nextInt();
//        System.out.println("Provide number 4");
//        int four = scan.nextInt();
//        largestOf4(one, two, three, four);


        //9
//        System.out.println("Provide 6 numbers for an array:");
//        int [] reverseArray = new int [6];
//        reverseArray[0] = scan.nextInt();
//        reverseArray[1] = scan.nextInt();
//        reverseArray[2] = scan.nextInt();
//        reverseArray[3] = scan.nextInt();
//        reverseArray[4] = scan.nextInt();
//        reverseArray[5] = scan.nextInt();
//        reverseArray(reverseArray);

        //8
//        System.out.println("Provide a max number");
//        int maxNum = scan.nextInt();
//        System.out.println("Provide 2 divisors");
//        int divisor1 = scan.nextInt();
//        int divisor2 = scan.nextInt();
//        int arrayListLength = num8(maxNum, divisor1, divisor2).size();
//        System.out.println("The length of the array list is :" + arrayListLength);

        //5
        ascii();

        //7
        int[] values = {45, 78, 29, 4, 105, 34, 54};
        int[] highLow = highestLowestArray(values);

    }



    //7
    public static int[] highestLowestArray(int[] array) {
        int smallest = array[0];
        int largest = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > largest) {
                largest = array[i];
            } else if(array[i] < smallest){
                smallest = array[i];
            }

        }
        int[] highLow = {largest, smallest};
        return highLow;
    }

    //5
    public static void ascii() {
        System.out.println(" |\\___/| ");
        System.out.println(" | o_o | ");
        System.out.println("  \\_^_/  ");
    }


    //8
    public static ArrayList<Integer> num8 (int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> intArrayList = new ArrayList();
        for (int i = 0; i <= maxNum; i++){
            if(i%divisor1 == 0 && i%divisor2 == 0){
                intArrayList.add(i);
            }
        }
        return intArrayList;
    }



    //9
    public static void reverseArray(int[] reverseArray) {
        int temp;
        for(int i = 0; i < reverseArray.length / 2; i++){
            temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length-1-i];
            reverseArray[reverseArray.length-1-i] = temp;
        }
        for (int val : reverseArray) {
            System.out.println(val);
        }
    }

    //3
    public static void largestOf4(int one, int two, int three, int four) {
        if(one > two && one > three && one > four) {
            System.out.println(one + " is the largest");
        } else if (two > one && two > three && two > four){
            System.out.println(two + " is the largest");
        } else if (three > one && three > two && three > four) {
            System.out.println(three + " is the largest");
        } else {
            System.out.println(four + " is the largest");
        }

    }

    //6
    public static void prime(int prime){
        int count = 0;
        for(int i = 2; i < prime; i++){
            if(prime%i == 0) {
                continue;
            }else {
                count++;
            }
        }
        if(count == prime-2) {
            System.out.println(prime + " is a prime number");
        } else {
            System.out.println(prime + " is not a prime number");
        }
    }
    //4
    public static void consonants(String word) {
        int i = 0;
        String conso = "bcdfghjklmnpqrstvwxyz";
        int count = 0;
        while (i < word.length()) {
            char d = word.charAt(i);
            if(conso.indexOf(d) > 0) {
                count++;
            }
            i++;
        }
        System.out.println("Consonants in " + word + " are " + count);
    }


    //1
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    //1
    public static double multiply(double a, double b) {
        return a * b;
    }
    //1
    public static int multiply(int a, int b) {
        return a * b;
    }
    //2
    public static void passByValue(int a) {
        a = 10;
    }


}

