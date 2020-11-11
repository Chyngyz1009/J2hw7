package com.company;

import java.util.*;

public class Main {

    private static java.lang.Object Object;

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        addString(a, "input text");
        System.out.println("--------");

        ArrayList<String> b = new ArrayList<>();
        addString(b, "input text");
        System.out.println("-------");

        System.out.println("Reverse:");
        Collections.reverse(b);
        Iterator<String> iter = b.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        List<String> c = new ArrayList<>();
        ListIterator<String> listIterator = b.listIterator();
        ListIterator<String> strIterator = a.listIterator();

        while (strIterator.hasNext()) {
            String ss1 = strIterator.next();
            c.add(ss1);
            if (listIterator.hasNext()) {
                String ss2 = listIterator.next();
                c.add(ss2);
            }
        }
        System.out.println(c);

        c.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("----------");
        System.out.println("sortirovka");
        System.out.println(c);
    }

    public static void addString(ArrayList<String> list, String word) {
        while (list.size() < 5) {
            System.out.println(word);
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            list.add(s);

            Iterator<String> iter = list.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }
    }
}


