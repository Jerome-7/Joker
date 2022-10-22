package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class 连接数据库 {
    public static void main(String[] args) {
        try {//导入驱动包
            Class.forName("com.mysql.cj.jdbc.Driver");
            //连接数据库
            String url = "jdbc:mysql://rm-t4n4141f6qw6o31n5yo.mysql.singapore.rds.aliyuncs.com:3306";
            String username = "yy13213yy" ;//账号
            String password = "YY13213yy";//密码
            Connection con = DriverManager.getConnection(url,username,password);
            //输出数据库
            System.out.println(con);
            //关闭数据库
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
