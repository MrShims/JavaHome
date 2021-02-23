package com.Task3;

public class Task3 {
    public static void main(String[] args){

        int a = 12;
        System.out.println(getBinary(a));

    }
    private static String getBinary(int a) {
        StringBuilder sb = new StringBuilder();
        int i;
        for(i=0; i<32; i++){
            sb.append(((a&1)==1)?1:0);
            a>>=1;
            if (i==7 || i==15 || i==23) sb.append(' ');
        }
        sb.reverse();
        return sb.toString();

    }
}

