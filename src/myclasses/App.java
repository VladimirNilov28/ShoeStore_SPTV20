/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Customer;
import entity.Shoe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    private Shoe[] shoes = new Shoe[10];

    public void run(){
        String repeat = "yes";
        do{
            System.out.println("Выберите номер задачи: ");
            System.out.println("0: Выход из программы");
            System.out.println("1: Добавить покупател");
            System.out.println("2: Добавить модель");
            System.out.println("3: Список продаваемых моделей");
            System.out.println("4: Покупка покупателем обуви");
            System.out.println("5: Добавить денег покупателю");
            System.out.println("6: Список зарегистрированных покупателей");
            System.out.println("7: Доход магазина за все время работы");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = "no";
                    break;
                case 1:
                    Customer reader = new Customer();
                    System.out.print("Введите имя покупателя: ");
                    reader.setCustumerName(scanner.nextLine());
                    System.out.print("Введите тулефон покупателя: ");
                    reader.setCustumerPhone(scanner.nextLine());
                    System.out.print("Введите кол-во денег покупателя: ");
                    reader.setCusumerMoney(scanner.nextInt());
                    System.out.println("Покупатель инициирован как: "+reader.toString());
                    break;
                case 2:
                    Shoe shoe = new Shoe();
                    System.out.print("Введите название обуви: ");
                    shoe.setShoeName(scanner.nextLine());
                    System.out.print("Введите цену обуви: ");
                    shoe.setShoePrise(scanner.nextInt());
                    for (int i = 0; i < shoes.length; i++) {
                        if(shoes[i] == null){
                            shoes[i] = shoe;
                            break;
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Список обуви: ");
                    for (int i = 0; i < shoes.length; i++) {
                        if(shoes[i] != null){
                            System.out.printf("%d. %s %d"+"$"+"%n"
                                        ,i+1
                                        ,shoes[i].getShoeName()
                                        ,shoes[i].getShoePrise()
                            );
                        }   
                    }
                    break;
                default:
                    System.out.println("Выберите номер из списка!");
            }
           
        }while("yes".equals(repeat));
        System.out.println("Пока! :)");
    }
}
