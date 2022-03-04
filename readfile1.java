package main.readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class readfile1 {
    public String pathSE = "/Users/school/Desktop/javawork/Scheduler/src/main/resources/Levels_Fyi_Salary_Data - Levels_Fyi_Salary_Data.csv";
    public String pathDS = "/Users/school/Desktop/javawork/Scheduler/src/main/resources/Data_Science_Jobs_Salaries - Data_Science_Jobs_Salaries.csv";

    public static ArrayList<String>getsize(String path, int numberpath){
        ArrayList <String> ArraySalary = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            //line = br.readLine())!=null;
            for (int x = 0; (line = br.readLine())!= null; x++) {
                String[]values = line.split(",");

                ArraySalary.add(values[numberpath]);

            }
        }catch(Exception e){
            System.out.println("Exception 1");
        }
        return ArraySalary;


    }

    public static ArrayList<String>checkzero(String path, int count, int numberpath){
        ArrayList <String> ArraySalary = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            for (int x = 0; (line = br.readLine())!= null; x++) {
                String[]values = line.split(",");



                ArraySalary.add(values[numberpath]);

            }
        }catch(Exception e){
            System.out.println("Exception 2");
        }
        return ArraySalary;


    }

    public static ArrayList<Float>parser(ArrayList<String>array){
        ArrayList<Float> updatedarray = new ArrayList<Float>();
        try {
            for (int x = 0; x < 245; x++) {
                float value = Float.parseFloat(array.get(x));
                updatedarray.add(value);
            }
        }catch(Exception e){
            System.out.println("Exception 3");
        }


        return updatedarray;
    }
}
