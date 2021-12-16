package com.lzw.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzw.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    //  1.JavaBean和json的转换
    @Test
    public void test1(){
        Person person = new Person(1,"lzw");
        //  创建Gson对象
        Gson gson = new Gson();
        //  toJson()方法可以把java对象转换成为字符串
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);
        //  fromJson把json字符串转换回Java对象
        //  第一个参数是json字符串
        //  第二个参数是转换回去的Java对象类型
        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }
    //  2.List和json的转换
    @Test
    public void test2(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"lzw"));
        personList.add(new Person(2,"lzw2"));

        Gson gson = new Gson();
        //  把list集合转换为json字符串
        String personListString = gson.toJson(personList);
        System.out.println(personListString);
        List<Person> list = gson.fromJson(personListString,new PersonListType().getType());
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person);

    }

    //  3.map和json的转换
    @Test
    public void test3(){
        Map<Integer,Person> personMap = new HashMap<Integer,Person>();
        personMap.put(1,new Person(1,"lzw1"));
        personMap.put(2,new Person(2,"lzw2"));

        Gson gson = new Gson();
        //  把map集合转换成为json字符串
        String personMapString = gson.toJson(personMap);
        System.out.println(personMapString);
//        Map<Integer,Person> personMap2 = gson.fromJson(personMapString, new PersonMapType().getType());
        //  使用匿名内部类优化
        Map<Integer,Person> personMap2 = gson.fromJson(personMapString, new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap2);
        Person p = personMap2.get(1);
        System.out.println(p);
    }
}
