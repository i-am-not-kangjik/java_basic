package mycom.mytest;

public class Main4 {
    public static int getMax(int x, int y){
        int max = x;
        if(max < y) {
            max = y;
        }
        System.out.println("max = " + max);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("1.함수호출 시작");
        int a=20, b=30;
        int result=0;

        result=getMax(a, b);
        System.out.println("2.함수호출 시작" + result);
        getMax(70, 120);

    }
}
