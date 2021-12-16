import java.util.ArrayList;
import java.util.List;

class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        //创建一个学生对象
        Student s1 = new Student(1001, "tom", "23423432", "大连");
        students.add(s1);
        Student s2 = new Student(1002, "rose", "2343245", "沈阳");
        students.add(s2);

        //System.out.println(students.get(0));
        /*for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }*/

        /*for (Student student : students) {
            System.out.println(student);
        }*/
        //使用迭代器进行遍历
        //todo
    }
}
