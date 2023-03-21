package mycom.mytest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello"); 
        list.add("World");
        list.add("!!!");
        
        for(String obj:list) {
            System.out.println("obj.toUpperCase() = " + obj.toUpperCase());
        }
    }
}
