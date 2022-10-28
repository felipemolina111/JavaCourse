package chapter_5;

import java.util.Scanner;

public class palindromoExample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


         String word = getWord();


        char [] word_array = word.toCharArray();
        int length_word = word_array.length;

      convertWord(word_array,length_word);
        scanner.close();
    }


    public static String getWord(){
        System.out.println("Ingrese la palabra");
        String word = scanner.next();
        return word;
    }


    public static void convertWord(char[] word_array, int length_word){

        char[] word_new = new char[length_word];
        int j= (length_word-1);

        for(int i=0; i<length_word;i++){


            word_new[j] = word_array[i];
            j = (j-1);


        }

        String word_ok = word_new.toString();
        System.out.println(word_new);



    }


}
