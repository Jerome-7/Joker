package 对象;
/* this可以将成员方法里输出的值转换为成员变量的值，而非方法中的参数
 * 权限修饰符：
 * private（私有的）：本类可见、同包其他类或子类不可用、其他包的类或子类不可用
 * protected（）：本类可见、同包其他类或子类可用、其他包的类或子类不可用
 * public（共有的）：本类可见、同包其他类或子类可用、其他包的类或子类可用
 */
public class 类的特性 {
    // 成员变量String name
    String name;
    // 成员方法public void getName(参数){}
    public void getName(){
        // 局部变量必须要附上一个值
        int id = 0;
        System.out.println(id+name);
    }

    public static void main(String[] args) {
        // 创建类的特征的类
        类的特性 test = new 类的特性();
        test.getName();
    }
}
