package com.javarush.task.task21.LikesCount;

public class Solution {
    public static String whoLikesIt(String...names){
        String result="";
            switch (names.length){
                case 0:
                    result="Nobody likes this";
                    break;
                case 1:
                    result=String.format("%s likes this",names[0]);
                    break;
                case 2:
                    result = String.format("%s and %s like this",names[0],names[1]);
                    break;
                case 3:
                    result = String.format("%s, %s and %s like this",names[0],names[1],names[2]);
                    break;
                default:
                    result = String.format("%s, %s and %d others like this",names[0],names[1],names.length-2);
            }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Ivan"));
        System.out.println(whoLikesIt("Ivan","Maria"));
        System.out.println(whoLikesIt("A","B","C"));
        System.out.println(whoLikesIt("A","B","C","D"));
    }
}
