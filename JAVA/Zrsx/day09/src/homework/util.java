package homework;

import java.util.Scanner;

public class util {
    public static void student(Student []students){
        int count = 0;
        boolean flag = true;
        boolean flag2 = false;
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("------------------");
            System.out.println("1.增加学生信息");
            System.out.println("2.编辑学生信息");
            System.out.println("3.查询全部学生信息");
            System.out.println("4.模糊查询学生信息");
            System.out.println("5.退出系统");

            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    /*if(!students[students.length-1].getNo().equals("null")){
                        Student []newStudents = Arrays.copyOf(students,students.length+1);
                    }else {*/
                    while (true) {
                        System.out.println("请输入学生学号：");
                        students[count].setNo(sc2.next());
                        System.out.println("请输入学生姓名：");
                        students[count].setName(sc2.next());
                        System.out.println("请输入学生性别：");
                        students[count].setSex(sc2.next().charAt(0));
                        System.out.println("请输入学生年龄：");
                        students[count].setAge(sc2.nextInt());
                        System.out.println("添加成功！");
                        System.out.println("\t");
                        count++;
                        break;
                    }
                    //}
                    break;

                case 2:
                    System.out.println("请输入要编辑的学生的学号：");
                    String change = sc3.next();
                    for (int i = 0; i < count; i++) {
                        if (students[i].getNo().equals(change)) {
                            System.out.println("请输入修改后的学生学号：");
                            students[i].setNo(sc2.next());
                            System.out.println("请输入修改后的学生姓名：");
                            students[i].setName(sc2.next());
                            System.out.println("请输入修改后的学生性别：");
                            students[i].setSex(sc2.next().charAt(0));
                            System.out.println("请输入修改后的学生年龄：");
                            students[i].setAge(sc2.nextInt());
                            System.out.println("修改成功！");
                            flag2 = false;
                            break;
                        }
                    }

                    if (flag2){
                        System.out.println("该学生不存在！");
                    }

                    System.out.println("\t");
                    break;

                case 3:
                    System.out.println("当前所有学生信息如下：");
                    if (!students[0].getNo().equals("null")) {
                        for (int i = 0; i < count; i++) {
                            if (!students[i].getNo().equals("null")) {
                                System.out.println(students[i]);
                            } else {
                                System.out.println("当前没有学生，请添加！");
                                break;
                            }
                        }
                    } else {
                        System.out.println("当前没有学生，请添加！");
                    }
                    System.out.println("\t");
                    break;

                case 4:
                    System.out.println("请输入要查找的学生的姓/名：");
                    String find = sc3.next();
                    for (int i = 0; i < count; i++) {
                        if (students[i].getName().contains(find)) {
                            System.out.println(students[i]);
                            flag = false;
                        }
                    }

                    if(flag) {
                        System.out.println("没有这个学生！");
                    }

                    System.out.println("\t");
                    break;

                case 5:
                    System.out.println("退出成功！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入已有功能：");
                    System.out.println("\t");
                    break;
            }

        }
    }
}
