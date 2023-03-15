package mycom.mytest;

public class Main {
    public static void main(String[] args) {

        CustomerInfo c1 = new CustomerInfo(1, "홍길동", 20120212, 3);
        CustomerInfo c2 = new CustomerInfo(2, "김길동", 20120812, 2);
        CustomerInfo c3 = new CustomerInfo(3, "이길동", 20130112, 10);
        CustomerInfo c4 = new CustomerInfo(4, "박길동", 20110912, 11);
        CustomerInfo c5 = new CustomerInfo(5, "최길동", 20100712, 6);
        CustomerInfo c6 = new CustomerInfo(6, "한길동", 20120112, 8);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
    }
}
//    StudentInfo s1 = new StudentInfo(1, "홍길동", 88, 56, 82);
//    StudentInfo s2 = new StudentInfo(2, "이길동", 18, 36, 54);
//    s1.display();
//    s2.display();