package com.bridgelabz;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;

class HeadsTails{

    public String chanceFuction(){
        Random random =new Random();
        int chance=random.nextInt(2);
        if(chance==1)
            return "tails";
            else
             return "heads";

    }
}

public class CoinFlip {

    public static String toPercentage(float n){
        return String.format("%.0f",n*10)+"%";
    }
        public static void main(String[] args) {
            HeadsTails t1 = new HeadsTails();
            int heads = 0;
            int tails = 0;
            int chances = 10;
            for (int i = 1; i<= chances; i++) {
                if (t1.chanceFuction().equals("tails")) {
                    tails++;
                } else {
                    heads++;
                }
            }


            System.out.println("Chances = " + chances);
            System.out.println("Heads: " + heads);
            float h= (float) (Math.ceil(heads*100)/100);
            System.out.println("Coin Heads in Percentage :" +toPercentage(h));
            System.out.println("Tails: " + tails);
            float t= (float) (Math.ceil(tails*100)/100);
            System.out.println("Coin Tails in Percentage :" +toPercentage(t));

        }
    }
