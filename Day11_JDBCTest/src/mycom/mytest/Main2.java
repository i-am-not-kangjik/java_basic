package mycom.mytest;

import java.sql.*;

public class Main2 {
    // 프로젝트 구조에서 라이브러리 추가 Maven기반 -> ojdbc8 검색, oracle꺼 선택
    public static void main(String[] args) {
        Connection conn = null;

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String pw = "tiger";
        String driver = "oracle.jdbc.driver.OracleDriver";


        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pw);

            if (conn!=null) {
                System.out.println("연결 성공");
            }
            Statement stmt = conn.createStatement();
            String query = "select * from emp";

            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                System.out.print(rs.getString(1)+"\t");
                System.out.println(rs.getString(2));
            }

            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();

        } catch (SQLException e) {
            System.out.println("url이나 입력정보가 올바르지 않습니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버가 유효하지 않습니다.");
        }
    }
}
