package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("введите количество дней: ");
        int days=new Scanner(System.in).nextInt();

        convert(days);

    }
    static void convert(int days){
        if(days<=0) throw new IllegalArgumentException();
        System.out.println("In"+days+"дни:"+days*24+"часы"+days*1440+"минуты,"+days*86400+"seconds.");

    }
}
