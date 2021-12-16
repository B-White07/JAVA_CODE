import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        //队列 ， 通常情况下，都是先进先出 ， FIFO

        LinkedList<String> list = new LinkedList<>();

        list.add("Integer");
        list.add("Character");
        list.add("Double");
        list.add("Float");
        list.add("Byte");
        list.add("Short");
        list.add("Long");
        list.add("Boolean");

        list.addFirst("aaa");

        list.addLast("bbb");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println( list);


    }
}
