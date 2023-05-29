package l4;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class homework4 {
    public static void main(String[] args) {
        System.out.println("-----TASK 1-----");
        task1("the".toLowerCase(), "hello The world".toLowerCase());
        System.out.println("-----TASK 2-----");
        task2('l', "hello The world");
        System.out.println("-----TASK 3-----");
        task3("hello the world");
        System.out.println("-----TASK 4-----");
        task4("alarm albinos Alaska bored borned");
        System.out.println("-----TASK 5-----");
        task5("alarm albinos Alaska bored borned");
        System.out.println("-----TASK 6-----");
        task6("alarm albinos Alaska bored borned");
        System.out.println("-----TASK 7-----");
        task7("alarm. albinos. Alaska. bored. borned");
        System.out.println("-----TASK 8-----");
        task8("aa                   ");
    }

    public static void task1(String subst, String st){

        if(st.contains(subst))
            System.out.println("There is such a word as "+'"'+subst+'"');
        else
            System.out.println("There is no such a word as "+'"'+subst+'"');
    }

    public static void task2(char letter, String st) {
        if(st.indexOf(letter)==st.indexOf(letter))
            System.out.println("There is such a letter as " + '"' + letter + '"');

        else
            System.out.println("There is no such a letter as " + '"' + letter + '"');

        System.out.println("First occurrence "+st.indexOf(letter));
        System.out.println("Last occurrence "+st.lastIndexOf(letter));

    }

    public static void task3(String st) {
        String[] str = st.split(" ");
        int min = 0;
        String word= "";
        for (int i = 0; i < str.length; i++) {
            if(min>str[i].length() || min == 0){
                min=str[i].length();
                word = str[i];
            }
        }
        System.out.println("The shortest word: "+word);
        System.out.println("Amount of letters in "+'"'+word+'"'+": "+ min);
    }

    public static void task4(String st) {
        String[] str = st.split(" ");
        for (int i = 0; i < str.length; i++) {
            if(str[i].charAt(0)=='A' || str[i].charAt(0)=='a'){
                System.out.println(str[i]);
            }
        }
    }

    public static void task5(String st){
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)!=' '){
                count++;
            } else{
                break;
            }
        }
        System.out.println(st.replaceAll(st.substring(0, count), "hello"));
    }

    public static void task6(String st){int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)!=' '){
                count++;
            } else{
                break;
            }
        }
        String subst = st.substring(0, count);
        System.out.println(st.replaceAll(subst, subst.toUpperCase()));
    }

    public static void task7(String st){
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)=='.') {
                st= st.replace(st.charAt(i), ',');
            }
        }
        System.out.println(st);
    }

    public static void task8(String st){
        String[] str =st.split("");
        List strCol = Arrays.asList(str);

        int max = 0;
        String letter= "";

        for (String i:str) {
            for (int j = 0; j < str.length; j++) {
                if(max<Collections.frequency(strCol, i) || max==0){
                    max=Collections.frequency(strCol, i);
                    letter = i;
                }
            }
        }

        System.out.println("Letter "+'"'+letter+'"'+" have "+max+" occurrences in that sentence");
    }

}
