package day08_FinalDuck.src.mycom.mytest.duck;

import day08_FinalDuck.src.mycom.mytest.duck.*;

import java.awt.*;
import java.util.Random;

public class DuckManager {
    private Duck[] arr = new Duck[20];

    public DuckManager(){
        makeDucks();
    }
    private void makeDucks(){
        Random rnd = new Random();
        int type;
        for(int i=0;i<arr.length;i++){
            type = rnd.nextInt(4);
            switch (type){
                case 0:
                    arr[i] = new MallardDuck();
                    break;
                case 1:
                    arr[i] = new RedDuck();
                    break;
                case 2:
                    arr[i] = new RubberDuck();
                    break;
                case 3:
                    arr[i] = new DecoyDuck();
            }
        }
    }

    public void displayAllDucks(Graphics g) {
        for (Duck d:arr){
            d.display(g);;
        }
    }

    public void swimAllDucks(Graphics g){
        for (Duck d:arr){
            d.swim(g);
        }
    }

    public void quackAllDucks(Graphics g){
        for (Duck d:arr){
            if(d instanceof Quackable){
                ((Quackable) d).quack(g);
            }
        }
    }
    public void flyAllDucks(Graphics g){
        for (Duck d:arr){
            if(d instanceof Flyable){
                ((Flyable) d).fly(g);
            }
        }
    }
}
