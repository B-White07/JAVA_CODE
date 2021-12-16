import java.io.Serializable;

class Student implements Serializable {

    //JavaBean
    /**
     * 1.属性私有化，提供公有的方法
     * 2.实现序列化接口
     * 3.要有无参和全参构造方法
     */

    private int no;
    private String name;
    private String phone;
    private String address;


    public Student() {
    }


    public Student(int no, String name, String phone, String address) {
        this.no = no;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "no=" + no +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
