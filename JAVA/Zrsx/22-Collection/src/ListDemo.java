import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        //泛型只能是引用数据类型
        List<String> list = new ArrayList<>();

        System.out.println("集合长度：" + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());

        //添加一个元素
        list.add("hello");

        list.add("java");

        list.add("world");


        System.out.println("集合长度：" + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());

        System.out.println(list);

        System.out.println("list.contains(\"java\") = " + list.contains("java"));
        System.out.println("(list.indexOf(\"java\")!=-1?true:false) = " + (list.indexOf("java") != -1 ? true : false));


        ArrayList<String> al = new ArrayList<>();

        al.add("oracle");
        al.add("MySQL");
        al.add("Spring");
        al.add("MyBatis");

        list.addAll(al);

        System.out.println(list);

        list.set(0, "SpringMVC");

        System.out.println(list);

        /*System.out.println(list.remove("oracle"));
        System.out.println(list);

        System.out.println("-------------------------");
        System.out.println(list.remove(4));

        list.clear();

        System.out.println(list.size());*/


        /*List<String> lt = list.subList(2, 5);
        System.out.println(lt);*/

       /* Object[] strs = list.toArray();

        for (Object str : strs) {
            System.out.println(str.toString());
        }*/
       /*String[] str = new String[list.size()];
       list.toArray(str);

        for (String s : str) {
            System.out.println(s);
        }*/


    }
}
