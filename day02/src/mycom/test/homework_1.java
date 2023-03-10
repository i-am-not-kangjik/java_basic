package mycom.test;


import java.util.ArrayList;
import java.util.Arrays;

public class homework_1 {
    public static void main(String[] args) {
        String[] data = {"paper", "money", "cellphone"};
        ArrayList<String> pocket = new ArrayList<>(Arrays.asList(data));

        if (pocket.indexOf("money") != -1) {
            ;
        } else {
            System.out.println("카드를 꺼내라");
        }
    }
}
