package com.company;

public class Main {

    public static void main(String[] args) {
        Jayloo jayloo1 = new Jayloo();
        Jayloo jayloo2 = new Jayloo();
        jayloo1.name = "Birinchi Jayloo!";
        jayloo2.name = "Ekinchi Jayloo!";
        jayloo1.adres = "Kara - Balta";
        jayloo2.adres = "Belek";
        jayloo1.chabanName = "Nursultan";
        jayloo2.chabanName = "Igor";
        Yu yu1 = new Yu("Murka", 8, 150);
        Yu yu2 = new Yu("Mumu", 6, 160);
        Yu yu3 = new Yu("Burenok", 4, 180);
        Yu yu4 = new Yu("Topoz", 7, 200);
        Yu yu5 = new Yu("Polosatiy", 9, 140);
        Koy koy1 = new Koy("Bebe", 3,50);
        Koy koy2 = new Koy("Bibi", 4, 65);
        Koy koy3 = new Koy("Baba", 6, 70);
        Koy koy4 = new Koy("Bubu", 7, 75);
        Koy koy5 = new Koy("Bobo", 9, 45);
        Koy koy6 = new Koy("Babo", 5, 65);
        Koy koy7 = new Koy("Biba", 8, 80);
        Koy koy8 = new Koy("Boba", 5, 59);
        At at1 = new At("Igogo", 12, 205);
        At at2 = new At("Igogogo", 15, 250);
        At at3 = new At("Igaga", 14, 180);
        At at4 = new At("Igagoga", 18, 240);
        At at5 = new At("Igogagoga", 16, 210);
        //------------------------------------------------
        jayloo1.yular = new String[] {yu1.toString(), yu2.toString(), yu3.toString(), yu4.toString(), yu5.toString()};
        jayloo1.koylor = new String[] {koy1.toString(), koy2.toString(),koy3.toString(),koy4.toString(),koy5.toString(),koy6.toString(),koy7.toString(),koy8.toString()};
        jayloo1.attar = new String[] {at1.toString(), at2.toString()};
        jayloo2.yular = new String[] {yu2.toString(), yu5.toString()};
        jayloo2.koylor = new String[] {koy2.toString(), koy8.toString(), koy5.toString(), koy4.toString()};
        jayloo2.attar = new String[] {at1.toString(), at2.toString(), at3.toString(), at4.toString(), at5.toString()};

        System.out.println(jayloo1);
        System.out.println();
        System.out.println(jayloo2);


    }
}
