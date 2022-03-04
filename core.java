package main.java;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

import static main.readfile.readfile1.*;


public class core {
    public static void main(String[]args){
        main.readfile.readfile1 read = new main.readfile.readfile1();

        ArrayList<String> salary_DS = new ArrayList<>();
        ArrayList<String> salary_SE = new ArrayList<>();

        salary_DS = getsize(read.pathDS,5);


        int size = salary_DS.size();

        salary_SE = checkzero(read.pathSE, size, 5);

        ArrayList<Float> cleansalary_DS = new ArrayList<>();
        ArrayList<Float> cleansalary_SE = new ArrayList<>();
        cleansalary_DS = parser(salary_DS);
        cleansalary_SE = parser(salary_SE);

        System.out.println(cleansalary_SE.size());
        System.out.println(cleansalary_DS.size());
        System.out.println(cleansalary_SE);



    }
}
