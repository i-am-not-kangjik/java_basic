package mycom.mytest;

import java.util.Random;

public class Score {
    private int num;
    private String name;
    private int Korean;
    private int English;
    private int math;
    private int total;

    public Score(int num, String name) {
        Random rand = new Random();
        this.num = num;
        this.name = name;
        this.Korean = rand.nextInt(100);
        this.English = rand.nextInt(100);
        this.math = rand.nextInt(100);
        this.total = this.Korean + this.English + this.math;
    }

    public void display(){
        System.out.println(String.format("%d\t%s\t%d\t%d\t%d\t%d",this.num, this.name, this.Korean, this.English, this.math, this.total));
    }
}
