package com.flexon.exercise.ReadFileStringArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
//1. Write a program to read a file from a location
//2. Find all the words that appeared more than 5 times and are more than 3 characters in length.
//3. Populate a arraylist with all those words after reversing the words
//4. Iterate the arraylist and print.

public class ReadFileStringArrayList {
    public static void main(String[] args) throws IOException {
        ReadFileStringArrayList RFSL = new ReadFileStringArrayList();
        File inputFile = new File("myText.txt");
//        FileReader FileReader = new FileReader(inputFile);
//        BufferedReader bufferedReader = new BufferedReader(FileReader);
//        String line = bufferedReader.readLine();
//        while ((line = bufferedReader.readLine()) != null){
//
//        }
        Map<String, Integer> counter = new HashMap<>();
        List<String> res = new ArrayList<>();
        RFSL.getCount(inputFile, counter);
        RFSL.filter(counter, res);
        RFSL.printArray(res);
    }

    private void getCount(File inputFile, Map<String, Integer> counter) throws FileNotFoundException{
        try{
            Scanner readFileData = new Scanner(inputFile);

            while(readFileData.hasNextLine()){
                String curLine = readFileData.nextLine();
//                System.out.println(curLine);
                for (String s : curLine.trim().split(" ")){
                    counter.put(s, counter.getOrDefault(s, 0) + 1);
                }
            }
            readFileData.close();
        }catch (FileNotFoundException e){
            System.out.println("File not Found");
            System.out.println("File should be in /Users/junyuliu/Flexon/MavenExercise/JavaCode");
            throw e;
        }

    }

    private void filter(Map<String, Integer> counter, List<String> res){
        for (String s : counter.keySet()){
            if (s.length() > 3 && counter.get(s) > 5){
                StringBuilder sb = new StringBuilder(s);
                sb.reverse();
                res.add(sb.toString());
            }
        }
    }

    private void printArray(List<String> res){
        for(String s : res){
            System.out.println(s);
        }
    }

}
