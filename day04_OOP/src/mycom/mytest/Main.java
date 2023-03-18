package day04_OOP.src.mycom.mytest;
public class Main {
    public static void main(String[] args) {
//전체 프로세스의 로직
//실체생성(메모리생성)-->실행하려고
//        int i =0;
//        Player pobj = new Player();
//        pobj.display();
//        Player pobj2 = new Player();
//        pobj2.display();
//
//        Enemy enemy1 = new Enemy();
//        enemy1.display();
//
//        Enemy enemy2 = new Enemy();
//        enemy2.display();

        mycom.mytest.Score score1 = new mycom.mytest.Score(1, "홍길동");
        score1.display();
        mycom.mytest.Score score2 = new mycom.mytest.Score(2, "김길동");
        score2.display();
        mycom.mytest.Score score3 = new mycom.mytest.Score(3, "이길동");
        score3.display();
    }
};