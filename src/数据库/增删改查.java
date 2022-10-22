package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class 增删改查 {
    public static void main(String[] args) {
        Connection con = null;// 连接接口
        Statement stmt = null;// 发送SQL接口
        try {
            con = DriverManager.getConnection("jdbc:mysql://rm-t4n4141f6qw6o31n5yo.mysql.singapore.rds.aliyuncs.com:3306/jocker7", "yy13213yy", "YY13213yy");
            stmt = con.createStatement();

            // 添加数据库数据
//            String sql1 = "insert into jerome(id,name,age,birthday)values(11,'tom','20','2000-5-10')";
//            int result1 = stmt.executeUpdate(sql1);
//            System.out.println("有"+result1+"行记录被修改");

            // 删除数据库数据
//            String sql2 = "DELETE FROM jerome WHERE id = 11";
//            int result2 = stmt.executeUpdate(sql2);
//            System.out.println("有"+result2+"行记录被修改");

            // 修改数据库数据
//            String sql3 = "update jerome set sex = '男' WHERE id = 11";
//            int result3 = stmt.executeUpdate(sql3);
//            System.out.println("有"+result3+"行记录被修改");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (stmt != null){
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    } if (con == null) {
                    try {con.close();
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
