import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();

        list.addElement("hello");

        list.add("world");

        list.add(0,"java");

        System.out.println(list);

        list.removeAllElements();
    }
}
