package com.javase.View;

import java.util.Scanner;

public class View {
    Scanner scan = new Scanner(System.in);
    public void mainMenu(){
        System.out.println("-----------------房屋出租系统-----------------");
        System.out.println("\t\t\t\t1.新增房源");
        System.out.println("\t\t\t\t2.查找房子");
        System.out.println("\t\t\t\t3.删除房子");
        System.out.println("\t\t\t\t4.修改房屋信息");
        System.out.println("\t\t\t\t5.房子列表");
        System.out.println("\t\t\t\t6.退出");
        System.out.println("-------------------------------------------");
        System.out.println("请按照菜单序号输入数字：");
    }

    public void exitMethod(){
        System.out.println("Hint: 你的输入有误，请确保输入是菜单序号。");
        System.out.println("是否退出系统Y/N：");

        String exitSymbol = scan.next();
        while (true){
            if (exitSymbol.equalsIgnoreCase("Y")) {
                return;
            } else if (exitSymbol.equalsIgnoreCase("N")) {
                break;
            }
            System.out.println("是否退出系统Y/N：");
            exitSymbol = scan.next();
        }
    }
}
