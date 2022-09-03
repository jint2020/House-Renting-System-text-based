package come.javase;

import come.javase.Domain.House;
import come.javase.Service.HouseService;
import come.javase.View.View;

import java.util.Scanner;

public class App {
    View view = new View();
    HouseService service = new HouseService();
    public void startSys(){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            view.mainMenu();
            int option = scan.nextInt();
            switch(option){
                case 1 :
                    service.addNewHouse();
                    break;
                case 2 :
                    service.findById();
                    break;
                case 3 :
                    service.delById();
                    break;
                case 4 :
                    service.modifyById();
                    break;
                case 5 :
                    service.displayAllHouse();
                    break;
                case 6 :
                    System.out.println("\n感谢您使用房屋出租系统，再见");
                    flag = false;
                    break;
                default:
                    view.exitMethod();
            }
        }
    }

    public static void main(String[] args) {
        App start = new App();
        start.startSys();
    }
}
