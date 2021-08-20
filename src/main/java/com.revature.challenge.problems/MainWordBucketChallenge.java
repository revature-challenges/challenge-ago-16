package com.revature.challenge.problems;

public class MainWordBucketChallenge {

    public static void main (String[] args){
        int N = 10;
        String str = "she sells sea shells by the sea";
        WordBucket.bucketize(str,N);

        N = 7;
        String str2 = "the mouse jumped over the cheese";
        WordBucket.bucketize(str2,N);

        N=20;
        String str3 = "fairy dust coated the air";
        WordBucket.bucketize(str3,N);

        N=2;
        String str4 = "a b c d e";
        WordBucket.bucketize(str4,N);

    }

}
