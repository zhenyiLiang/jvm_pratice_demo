/**
 * @author lzy
 * @date 2022/2/5
 */
public class RuntimeInstantPool {
    public static void main(String[] args) {
        String str = new StringBuilder("计算机").append("软件").toString();
        String strIntern=str.intern();
        System.out.println("straddr: " + System.identityHashCode(str) + ", strIntern adr:" + System.identityHashCode(strIntern) + "," + (strIntern==str ));
        String str3 = new StringBuilder("计算机").append("软件").toString();
        String str3Intern = str3.intern();
        System.out.println("str3addr: " + System.identityHashCode(str3) + ", str3Intern adr:" + System.identityHashCode(str3Intern) + "," + (str3Intern==str3 ));
        System.out.println(str3Intern);
        String str2 = new StringBuilder("ja").append("va").toString();
        String str2Intern = str2.intern();
        System.out.println("str2addr: " + System.identityHashCode(str2) + ", str3Intern adr:" + System.identityHashCode(str2Intern) + "," + (str2Intern==str2 ));

    }
}
