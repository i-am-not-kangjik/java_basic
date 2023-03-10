package mycom.test;

public class Main3 {
    public static void main(String[] args) {
        int money = 1000;
        boolean card = true;
        // 돈이 3000원 이상 있거나 카드가 있다면 택시를 타고가라!
        if (money >= 3000 || card == true) {
            System.out.println("택시를 타고가라");
        } else {
            System.out.println("걸어라");
        }
    }
}
