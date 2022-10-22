package 数据库;


import java.sql.*;

public class 查询数据库 {
    static Connection con = null;
    static Statement stmt = null;
    static ResultSet rs = null;

    public static void main(String[] args) {
        try {
            //连接数据库，在url最后写入要连接的库
            con = DriverManager.getConnection("jdbc:mysql://rm-t4n4141f6qw6o31n5yo.mysql.singapore.rds.aliyuncs.com:3306/jocker7", "yy13213yy", "YY13213yy");
            stmt = con.createStatement();// 创建Statement对象
            // 发送SQL语句
            rs = stmt.executeQuery("select * from jerome");
            while (rs.next()) {// 查询下一行数据
                int id = rs.getInt("id");// 获取id这一列的值
                String name = rs.getString(2);// 获取第二行的值
                String sex = rs.getString("sex");// 获取sex这一列的值
                String birethday = rs.getString(4);// 获取第四行的值
                System.out.println("编号=" + id + "姓名=" + name + "性别=" + sex + "生日" + birethday);

            }
            // 捕获异常
        } catch (Exception e) {
            // 抛出异常
            throw new RuntimeException(e);
        } finally {// 如果rs不是空则关闭
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }// 如果stmt不是空则关闭
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }// 如果con不是空则关闭
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}