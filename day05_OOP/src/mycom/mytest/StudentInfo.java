package mycom.mytest;


public class StudentInfo {
    private int sid;
    private String sname;
    private int kor;
    private int math;
    private int eng;
    private int total;

    public StudentInfo() {

    }
    public StudentInfo(int sid, String sname, int kor, int math, int eng) {
        this.sid = sid;
        this.sname = sname;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.total = this.kor + this.math + this.eng;
    }

    public void display(){
        System.out.println(String.format("%d\t%s\t%d\t%d\t%d\t%d",this.sid, this.sname, this.kor, this.math, this.eng, this.total));
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        if(kor > -1 && kor < 101) {
            this.kor = kor;
        }
    }
    
}
