import java.util.Collection;
import java.util.Queue;

public class CollectionNotepad {
    /**
     * 集合：
     *
     * 泛型 ： jdk1.5
     *        泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数
     *        通俗的来讲，就是泛指某一个类型（只能引用数据类型）
     *        通过 E, T, K ,V ...
     *        表示<T>  , <K,V>
     *
     *        泛型类，泛型接口，泛型方法
     *
     *
     * 集合： 动态数组。
     *
     * Collection 集合， Map集合
     *
     * 1. interface Collection{}
     *
     *    常用方法：
     *    1). add(T t) : boolean - Collection  向集合中追加一个元素 ，true 表示成功过 否则不成功
     *    2). addAll(Collection) : boolean - Collection   向集合中追加一个集合 ，true 表示成功过 否则不成功
     *    3). size() : int - Collection 返回集合中元素个数
     *    4). remove(Object obj) : boolean - Collection 移除指定的对象
     *    5). contains(Object obj) : boolean - Collection 判断集合中是否包含指定的元素
     *    6). isEmpty() : boolean - Collection 判断集合是否有元素，true 没有元素
     *    7). clear() : void - Collection 清空集合中元素（集合.size() ==0）
     *    8). toArray() : Object[] - Collection  将集合转换为数组
     *    9). toArray(T[] t) : T[] - Collection
     *    10).iterator() : Iterator - Collection  迭代器，遍历集合
     *
     *   常用子接口 ：
     *   List , Queue , Set , SortedSet
     *
     *   List接口 ：
     *
     *    常用方法：
     *      1). add(int index, T t):void - List  向集合中某个位置插入一个元素
     *      2). addAll(int index,Collection ) : boolean - List 向集合中插入一个集合
     *      3). get(int index) : T - List 获取指定下标的元素
     *      4). indexOf(Object obj) : int - List  返回此列表中指定元素的第一个出现的索引，或-如果此列表不包含元素，或- 1。
     *      5). lastIndexOf(Object obj) : int - List  返回此列表中指定元素的最后一个出现的索引，或-如果此列表不包含元素，或- 1。
     *      6). remove(int index) : T - List 移除指定下标位置的元素，返回当前移除的元素
     *      7). set(int index, T t): T - List  用指定元素替换此列表中指定位置的元素
     *      8). subList(int fromIndex ,int toIndex) :List<T> - List 截取指定位置的元素返回一集合。
     *
     *
     *    常用子类：
     *
     *    ArrayList , Vector ,LinkedList
     *
     *    Vector: addElement(), removeElement(Object), removeElementAt(int index)
     *            removeAllElements()
     *
     *
     *    ArrayList 和 Vector 区别
     *                   版本         效率      安全性
     *    ArrayList     jdk1.2        高       线程不安全
     *    Vector        jdk1.0        低       线程安全
     *
     *
     *  Queue 接口：
     *    常用方法：
     *      1). add(E e) : boolean - Queue  添加元素
     *      2). element() : T - Queue  返回链表的第一个元素，如果集合没有元素，抛出异常 NoSuchElementException
     *      3). peek(): T - Queue  返回链表的第一个元素，如果集合没有元素，返回null
     *      4). poll() : T -  Queue  返回链表的第一个元素，并且删除。
     *
     *     常用子类 LinkedList（双向链表）
     *        常用方法  ：
     *        addFirst(),addLast(), removeFirst(),removeLast();
     *
     *      ArrayList 和 LinkedList区别：
     *
     *      1.ArrayList 是以数组的方式存储数据，LinkedList是以链表形式存储数据
     *      2.ArrayList 检索数据速度快
     *      3.LinkedList 增删链表的头尾速度快。
     *
     *
     */


}
