package com.icss_01;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
        ve.speedUp();
        ve.updateCarId("辽A9752");
        System.out.println("兰博基尼：" + " \n车牌：" + ve.getCarId() + "\t速度：" + ve.getSpeed()
                + "\t载重量：" + ve.getSize());

        System.out.println();

        Vehicle ve2 = new Vehicle("辽B5086",150,200.00);
        ve2.speedDown();
        System.out.println("玛莎拉蒂：" + " \n车牌：" + ve2.getCarId() + "\t速度：" + ve2.getSpeed()
                + "\t载重量：" + ve2.getSize());
    }
}
