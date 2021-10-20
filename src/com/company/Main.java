package com.company;

import java.util.Scanner;

public class Main {
    static String login(String x, String n) {
      if (n.equals("Sib29top") && x.equals("Sib29")) {
          System.out.println("dostup otkrit"+"\n"+ "secret: sib 29 the best");
      } else System.out.println("parol nevernii" );
return x;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
String n;
String x;
        System.out.println("Dostup k sekretu");
        System.out.println("login engiz");
        x=sc.nextLine();
        System.out.println("parol engiz");
n=sc.nextLine();
        login(x,n);
    }
}
