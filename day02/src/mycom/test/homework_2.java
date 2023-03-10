package mycom.test;

import java.util.ArrayList;
import java.util.Arrays;

public class homework_2 {
    public static void main(String[] args) {
        String[] data = {"paper", "cellphone"};
        ArrayList<String> pocket = new ArrayList<>(Arrays.asList(data));
        boolean card = true;
        if ((pocket.indexOf("money") != -1) || card) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

    }
}
