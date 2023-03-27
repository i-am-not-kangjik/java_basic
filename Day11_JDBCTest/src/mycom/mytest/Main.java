package mycom.mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Boolean connect = false;
        try {
            //오라클 드라이버 접속
            Class.forName(driver);
            //내 db 접속
            conn = DriverManager.getConnection(url, "madang", "madang");
            //접속성공시 true 설정
            connect = true;
            Statement stmt = conn.createStatement();
            String query ="select * from BOOK";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()) {
                System.out.print(rs.getString(1)+"\t");
                System.out.println(rs.getString(2));
            }
            //접속 끊기, 끊는 이유 : 항상 db가 연결되어 있으면 접속 오류 및 데이터 충돌이 일어나기 때문
            conn.close();
        } catch (Exception e) {
            //접속 실패시 false 잡고 예외처리해줌
            connect = false;
            e.printStackTrace();
        }
    }

}
