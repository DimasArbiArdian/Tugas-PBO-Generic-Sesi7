package Sesi7;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Dimas");
        nama.add("Arbi");
        nama.add("Ardian");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Arbi");

        boolean adaDimas = nama.contains("Dimas");

        System.out.println("Apakah ada Dimas? " + adaDimas;)

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}
