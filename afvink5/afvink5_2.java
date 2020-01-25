package afvink5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class afvink5_2 {
    private static Map<String, String> oneThree = new HashMap<>();
    private static Map<String, String> threeFull = new HashMap<String, String>();

    public static void main(String[] args){
        afvink5_2.makeHash();
        afvink5_2.geteverything();
    }

    private static void geteverything() {
        Scanner inlezen = new Scanner(System.in);
        System.out.println("Enter a lettercode:");
        String letter = inlezen.next();

        if(letter.length() == 1){
            String codon = oneThree.get(letter);
            String full_name = threeFull.get(codon);
            System.out.println(codon);
            System.out.println(full_name);
            inlezen.close();
        }
        if(letter.length() == 3){
            String codon = oneThree.get(letter);
            String full_name = threeFull.get(letter);
            System.out.println(codon);
            System.out.println(full_name);
            inlezen.close();
        }
        else {
            String codon = threeFull.get(letter);
            String single = oneThree.get(codon);
            System.out.println(single);
            System.out.println(codon);
            inlezen.close();
        }
    }

    public static void makeHash(){
        //Create HashMap object.

        oneThree.put("Ala", "A");
        oneThree.put("Arg", "R");
        oneThree.put("Asn", "N");
        oneThree.put("Asp", "D");
        oneThree.put("Cys", "C");
        oneThree.put("Glu", "E");
        oneThree.put("Gln", "Q");
        oneThree.put("Gly", "G");
        oneThree.put("His", "H");
        oneThree.put("Ile", "I");
        oneThree.put("Leu", "L");
        oneThree.put("Lys", "K");
        oneThree.put("Met", "M");
        oneThree.put("Phe", "F");
        oneThree.put("Pro", "P");
        oneThree.put("Ser", "S");
        oneThree.put("Thr", "T");
        oneThree.put("Trp", "W");
        oneThree.put("Tyr", "Y");
        oneThree.put("Val", "V");

        oneThree.put("A", "Ala");
        oneThree.put("R", "Arg");
        oneThree.put("N", "Asn");
        oneThree.put("D", "Asp");
        oneThree.put("C", "Cys");
        oneThree.put("E", "Glu");
        oneThree.put("Q", "Gln");
        oneThree.put("G", "Gly");
        oneThree.put("H", "His");
        oneThree.put("I", "Ile");
        oneThree.put("L", "Leu");
        oneThree.put("K", "Lys");
        oneThree.put("M", "Met");
        oneThree.put("F", "Phe");
        oneThree.put("P", "Pro");
        oneThree.put("S", "Ser");
        oneThree.put("T", "Thr");
        oneThree.put("W", "Trp");
        oneThree.put("Y", "Tyr");
        oneThree.put("V", "Val");

        threeFull.put("Ala", "Alanine");
        threeFull.put("Arg", "Arginine");
        threeFull.put("Asn", "Asparagine");
        threeFull.put("Asp", "Aspartic acid");
        threeFull.put("Cys", "Cysteine");
        threeFull.put("Gln", "Glutamine");
        threeFull.put("Glu", "Glutamic acid");
        threeFull.put("Gly", "Glycine");
        threeFull.put("His", "Histidine");
        threeFull.put("Ile", "Isoleucine");
        threeFull.put("Leu", "Leucine");
        threeFull.put("Lys", "Lysine");
        threeFull.put("Met", "Methionine");
        threeFull.put("Phe", "Phenylalanine");
        threeFull.put("Pro", "Proline");
        threeFull.put("Ser", "Serine");
        threeFull.put("Thr", "Threonine");
        threeFull.put("Trp", "Tryptophan");
        threeFull.put("Tyr", "Tyrosine");
        threeFull.put("Val", "Valine");

        threeFull.put("Alanine", "Ala");
        threeFull.put("Arginine", "Arg");
        threeFull.put("Asparagine", "Asn");
        threeFull.put("Aspartic acid", "Asp");
        threeFull.put("Cysteine", "Cys");
        threeFull.put("Glutamine", "Gln");
        threeFull.put("Glutamic acid", "Glu");
        threeFull.put("Glycine", "Gly");
        threeFull.put("Histidine", "His");
        threeFull.put("Isoleucine", "Ile");
        threeFull.put("Leucine", "Leu");
        threeFull.put("Lysine", "Lys");
        threeFull.put("Methionine", "Met");
        threeFull.put("Phenylalanine", "Phe");
        threeFull.put("Proline", "Pro");
        threeFull.put("Serine", "Ser");
        threeFull.put("Threonine", "Thr");
        threeFull.put("Tryptophan", "Trp");
        threeFull.put("Tyrosine", "Tyr");
        threeFull.put("Valine", "Val");
    }

}
