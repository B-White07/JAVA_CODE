package com.lzw;

public class test {
    public static void main(String[] args){
        int a = 0;
         switch( a++ == 2 ? 3 : 2  ){   // a = 1;
             case 1:
                 System.out.println("the result is 1");
                 break;
             case 2:
                 System.out.println("the result is 2");
                 System.out.println(a); //  a = 1;
                 System.out.println("the first 'a++' is :" + a++);  //  a++ = a;    a = a + 1;
                 System.out.println("the second 'a++' is :" + a++);
                 break;
             case 3:
                 System.out.println("the result is 3");
                 break;
             default:
                 System.out.println("none");
                 break;
         }
    }
}
