package afvink6;

import java.util.*;
import java.io.*;


public class afvink6 {
    LinkedHashMap<String, String> hmap = new LinkedHashMap<>();
    LinkedHashMap<String, String> match = new LinkedHashMap<>();
    String matches = "";
    boolean tellen = true;


    public afvink6() {
        setHmap();
        lees();
        //System.out.println(matches);
        match.forEach((k,v)-> System.out.println(k + " en "+ v));


    }
    public static void main(String[] args) {
        afvink6 ver = new afvink6();
    }

    public int vergelijkVanCNaarA(String [] n1, String [] n2){
        int gelijk_teller = 0;
        tellen = true;
        int teller = 0;
        while (tellen) {
            //System.out.println(n1);
            //System.out.println(n1[n1.length - (1 + teller)]);
            if (n1[n1.length - (1 + teller)].equals(n2[teller]))
                gelijk_teller += 1;
            else {
                tellen = false;
            }
            teller += 1;
        }
        System.out.println("van 2 -> 1: " + gelijk_teller);
        return gelijk_teller;
    }

    public int vergelijkVanANaarC(String [] n1, String [] n2){
        int gelijk_teller2 = 0;
        tellen = true;
        int teller2 = 0;
        while (tellen) {
            System.out.print(n2[n2.length - (1 + teller2)] + " ");
            System.out.println(n1[teller2]);
            if (n2[n2.length - (1+ teller2)].equals(n1[teller2]))
            {//System.out.println(n1[teller2]);
                gelijk_teller2 += 1;}
            else
            {tellen = false;}
            teller2 += 1 ;
        }
        System.out.println("van 1 --> 2: " + gelijk_teller2);
        return gelijk_teller2;
    }

    public  void setHmap(){
        hmap.put("Rosalind_0498", "AAATAAA");
        hmap.put("Rosalind_2391", "AAATTTT");
        hmap.put("Rosalind_2323", "TTTTCCC");
        hmap.put("Rosalind_0442", "AAATCCC");
        hmap.put("Rosalind_5013", "GGGTGGG");
    }

    public void lees(){
        for (int i = 0; i < hmap.size(); i ++){
            for (int a = 0; a < hmap.size(); a ++){
                if(hmap.values().toArray()[i].equals(hmap.values().toArray()[a])){
                }
                else {
                    int teller = 0;
                    System.out.println(hmap.values().toArray()[i].toString()+" en " +
                            hmap.values().toArray()[a].toString());
                    teller = vergelijkVanANaarC(hmap.values().toArray()[i].toString().split(""),
                            hmap.values().toArray()[a].toString().split(""));
                    match(teller, hmap.entrySet().toArray()[i], hmap.entrySet().toArray()[a]);
                    teller = vergelijkVanCNaarA(hmap.values().toArray()[i].toString().split(""),
                            hmap.values().toArray()[a].toString().split(""));
                    match(teller, hmap.entrySet().toArray()[a], hmap.entrySet().toArray()[i]);
                }
            }
        }
    }

    public void match(int teller,Object a, Object b){
        if (teller > 0){
            //if(match.size() < 3)
            match.put(a.toString() , b.toString());
        }

    }

}