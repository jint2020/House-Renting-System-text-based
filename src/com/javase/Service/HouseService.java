package com.javase.Service;

import com.javase.Domain.House;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseService {
    ArrayList<House> list = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    /**
     * 输入新增房子的信息
     */
    public House inputHouseInfo(){
        int len = list.size();
        int id = len+1;
        System.out.println("请输入房子所有者的名字：");
        String owner = scan.next();
        System.out.println("请输入联系电话号码：");
        String phone = scan.next();
        System.out.println("请输入房子的地址：");
        String address = scan.next();
        System.out.println("请输入房子放租金额：");
        double rent = scan.nextDouble();;
        System.out.println("请输入房子当前状态（已出租/未出租）：");
        String status = scan.next();
        House aHouse =  new House(id,owner,phone,address,rent,status);
        return aHouse;
    }
    /*
    * 新增房子
    * */
    public void addNewHouse(){
        System.out.println("\n=================1.新增房源=================");
        list.add(inputHouseInfo());
    }

    public House searchHouse(int id){
        for (House ele:list) {
            if (id == ele.getId()) {
                return ele;
            }
        }
        return null;
    }

    public void findById(){
        System.out.println("\n=================2.查找房子=================");
        System.out.println("请输入房子的ID编码：");
        int id = scan.nextInt();
        System.out.println(searchHouse(id));
    }

    public void deleteHouse(int id){
        for (House ele:list) {
            if (id == ele.getId()) {
                list.remove(ele);
                System.out.println("删除成功。");
            }
        }
    }

    public void delById(){
        System.out.println("\n=================3.删除房子=================");
        System.out.println("请输入房子的ID编码：");
        int id = scan.nextInt();
        deleteHouse(id);
    }

    public void modifyHouseInfo(int id){
        for (House ele:list) {
            if (id == ele.getId()) {
                System.out.println("请输入房子所有者的名字：");
                ele.setOwner(scan.next());
                System.out.println("请输入联系电话号码：");
                ele.setPhone(scan.next());
                System.out.println("请输入房子的地址：");
                ele.setAddress(scan.next());
                System.out.println("请输入房子放租金额：");
                ele.setRent(scan.nextDouble());
                System.out.println("请输入房子当前状态（已出租/未出租）：");
                ele.setStatus(scan.next());
                break;
            }
        }
    }

    public void modifyById(){
        System.out.println("\n=================4.修改房子=================");
        System.out.println("请输入房子的ID编码：");
        int id = scan.nextInt();
        modifyHouseInfo(id);
    }

    public void displayAllHouse(){
        System.out.println("\n=================5.房源列表=================");
        if (list.size() == 0) {
            System.out.println("数据库没有相关记录。");
            return;
        }
        for (House ele:list) {
            System.out.println(ele);
        }
    }


}
