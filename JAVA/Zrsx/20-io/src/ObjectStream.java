import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //outputObjectStream();
        //1.指定一个要操作的文件路径
        File file = new File("E:", "obj.txt");

        //创建一个输入流
        FileInputStream fis = new FileInputStream(file);

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student stu = (Student) ois.readObject();

        ois.close();

        System.out.println(stu);


    }

    private static void outputObjectStream() throws IOException {
        Student student = new Student();
        student.setName("张三");
        student.setAge(19);
        student.setPhone("88888888");
        student.setAddress("大连");

        //1.指定一个要操作的文件路径
        File file = new File("E:", "obj.txt");
        if (!file.exists())
            file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);

        //2.指定一个输出流，ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);

        oos.flush();

        oos.close();
        fos.close();
    }
}

class Student implements Serializable {
    private String name;
    private int age;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
