package com.revature.challenge.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBucket {

    public static void bucketize(String str, int N){
        String[] words = str.split(" ");
        ArrayList<String> addedWords = new ArrayList<>();
        ArrayList<String> bucket = new ArrayList<>();

        int length =0;
        for(int i=0; i < words.length; i++){
            if(i != 0 && i < words.length -1){
                length += words[i].length()+1;
            }else{
                length += words[i].length();
            }
            if(length <= N){
                addedWords.add(words[i]);
                if (i== words.length -1){
                    addToBukect(words, addedWords, bucket, i);
                    length = words[i].length();
                }
            }else{
                if (i== words.length -1){
                    addToBukect(words, addedWords, bucket, i);
                }
                addToBukect(words, addedWords, bucket, i);
                length=0;
                length = words[i].length()+1;
            }
        }
        System.out.println(bucket.toString());
    }

    private static void addToBukect(String[] words, ArrayList<String> addedWords, ArrayList<String> bucket, int i) {
        StringBuilder supportStr = new StringBuilder();
        for(String word : addedWords){
            supportStr.append(word);
            supportStr.append(" ");
        }
        bucket.add(String.valueOf(supportStr).trim());
        addedWords.clear();
        addedWords.add(words[i]);
    }


}
