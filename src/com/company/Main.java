package com.company;

import java.util.*;

public class Main {

    private static java.lang.Object Object;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a1 = scanner.nextLine();
        String a2 = scanner.nextLine();
        String a3 = scanner.nextLine();
        String a4 = scanner.nextLine();
        String a5 = scanner.nextLine();

        ArrayList<Object> a = new ArrayList<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);

        Iterator<Object> iter = a.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
        System.out.println("--------");

        String b1 = scanner.nextLine();
        String b2 = scanner.nextLine();
        String b3 = scanner.nextLine();
        String b4 = scanner.nextLine();
        String b5 = scanner.nextLine();

        ArrayList<Object> b = new ArrayList<>();
        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        Iterator<Object> iter1 = b.iterator();

        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        System.out.println("-------");


        List<String> c = new ArrayList<>();
        c.add(a1);
        c.add(b5);
        c.add(a2);
        c.add(b4);
        c.add(a3);
        c.add(b3);
        c.add(a4);
        c.add(b2);
        c.add(a5);
        c.add(b1);
        Iterator<String> iter2 = c.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        System.out.println("--------");
        c.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("----------");
        System.out.println("sortirvka");
        Iterator<String> iter3 = c.iterator();
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }


    }


}


