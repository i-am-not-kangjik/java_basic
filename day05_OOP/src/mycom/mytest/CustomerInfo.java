package mycom.mytest;

public class CustomerInfo {
    private int cid;
    private String cname;
    private int cdate;
    private int ccount;
    private int cpoint;
    private String cclass;

    public CustomerInfo(int cid, String cname, int cdate, int ccount) {
        this.cid = cid;
        this.cname = cname;
        this.cdate = cdate;
        this.ccount = ccount;

        if (ccount < 3){
            this.cpoint = ccount * 20;
        } else if (ccount < 5) {
            this.cpoint = ccount * 30;
        } else if (ccount < 10) {
            this.cpoint = ccount * 50;
        } else {
            this.cpoint = ccount * 100;
        }

        if (this.cpoint < 100) {
            this.cclass = "Family";
        } else if (this.cpoint < 300) {
            this.cclass = "Gold";
        } else if (this.cpoint < 500) {
            this.cclass = "VIP";
        } else {
            this.cclass = "VVIP";
        }
    }

    public void display(){
        System.out.println(String.format("%d\t%s\t%d\t%d\t%d\t%s",
                this.cid, this.cname, this.cdate, this.ccount, this.cpoint, this.cclass));
    }
}
