package 数据库;

import java.sql.*;

public class 动态SQL查询 {
    public static void main(String[] args) {
        Connection con = null;// 连接接口
        try {
            //连接数据库
            con = DriverManager.getConnection("jdbc:mysql://rm-t4n4141f6qw6o31n5yo.mysql.singapore.rds.aliyuncs.com:3306/jocker7",
                    "yy13213yy","YY13213yy");
            // 使用SQL语句查询name的统配值
            String sql = "select * from jerome where name like ? and sex = ?";
            // 创建PreparedStatement对象
            PreparedStatement ps = con.prepareStatement(sql);
            // 指定name统配符为周
            ps.setString(1,"周%");
            // 指定sex统配符为男
            ps.setString(2,"男");
            // 创建结果集对象
            ResultSet rs = ps.executeQuery();
            System.out.println("id\tname\tsex");
            while (rs.next()){
                // 输出3列数据
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (con != null){
                try {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
