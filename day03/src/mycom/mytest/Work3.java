package mycom.mytest;

public class Work3 {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){
            for (int j = 0; j < 5-i; j++){
                System.out.print(' ');
            }
            for (int k=0; k<i; k++){
                System.out.print('*');
            }
            if (i != 1){
                System.out.println();
            }
        }
    }
}
