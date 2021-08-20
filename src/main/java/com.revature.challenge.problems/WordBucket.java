package com.revature.challenge.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBucket {

    public static void bucketize(String str, int N){
        String[] strArray = str.split(" ");
        ArrayList<String> wordsAdded = new ArrayList<>();
        ArrayList<String> bucket = new ArrayList<>();

        for (int i = 0; i < strArray.length; i++){
            if(!wordsAdded.contains(strArray[i])){
                if(strArray[i].length()>N){
                    wordsAdded.add(strArray[i]);
                    bucket.add(strArray[i]);
                }else{
                    if(i < strArray.length -1){
                        int length = 0;
                        for (int j = i; j < strArray.length; j++) {
                            if(j==i) {
                                length += strArray[j].length();
                            }else{
                                length += strArray[j].length()+1;
                            }

                            if(length >= N){
                                break;
                            }else{
                                wordsAdded.add(strArray[j]);
                                bucket.add(strArray[i]);
                            }
                        }
                    }else{
                        wordsAdded.add(strArray[i]);
                        bucket.add(strArray[i]);
                    }

                }
            }

        }

        System.out.println(bucket.toString());

    }


}
