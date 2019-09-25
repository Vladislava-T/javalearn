package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountText {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите текст: ");
        String input_text = in.nextLine();
        String[] scanned_text = input_text.split(" ");
        Map<String, Integer> slova_schet= new HashMap<>();
        for(int i = 0; i < scanned_text.length; i++) {
            if(!slova_schet.containsKey(scanned_text[i])){
                slova_schet.put(scanned_text[i], 1);
            } else {
                slova_schet.put(scanned_text[i], slova_schet.get(scanned_text[i])+1);
            }
        }
        for (String name: slova_schet.keySet()){
            String value = slova_schet.get(name).toString();
            System.out.println(name + " " + value);
        }
    }
}
