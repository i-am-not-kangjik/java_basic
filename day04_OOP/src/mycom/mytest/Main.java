package mycom.mytest;
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

        Score score1 = new Score(1, "홍길동");
        score1.display();
        Score score2 = new Score(2, "김길동");
        score2.display();
        Score score3 = new Score(3, "이길동");
        score3.display();
    }
};