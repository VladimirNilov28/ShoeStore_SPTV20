/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Customer;
import entity.History;
import entity.Income;
import entity.Shoe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    private Shoe[] shoes = new Shoe[10];
    private Customer[] customers = new Customer[10];
    private History[] histories = new History[10];


    public void run(){
        
        History history = new History();
        Income income = new Income();
        Shoe shoe = new Shoe();
        Customer customer = new Customer();
        
        String repeat = "yes";
        do{
            System.out.println("Выберите номер задачи: ");
            System.out.println("0: Выход из программы");
            System.out.println("1: Добавить покупателя");
            System.out.println("2: Добавить модель");
            System.out.println("3: Список продаваемых моделей");
            System.out.println("4: Покупка покупателем обуви");
            System.out.println("5: Добавить денег покупателю");
            System.out.println("6: Список зарегистрированных покупателей");
            System.out.println("7: Доход магазина за все время работы");
            System.out.println("8: Список покупателей");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = "no";
                    break;
                case 1:
                    System.out.print("Введите имя покупателя: ");
                    customer.setCustumerName(scanner.nextLine());
                    System.out.print("Введите телефон покупателя: ");
                    customer.setCustumerPhone(scanner.nextLine());
                    System.out.print("Введите кол-во денег покупателя: ");
                    customer.setCusumerMoney(scanner.nextInt());
                    System.out.println("Покупатель инициирован как: "+customer.toString());
                    for (int i = 0; i < customers.length; i++) {
                        if (customers[i] == null){
                            customers[i] = customer;
                            break;
                        }
                    }
                    break;
                case 2:
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
                
                case 4:
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
                    
                    System.out.println("Выберите номер обуви: ");
                    int numberShoe = scanner.nextInt(); scanner.nextLine();
                    
                    System.out.println("Список покупателей: ");
                    for (int i = 0; i < customers.length; i++) {
                        if(customers[i] != null){
                            System.out.printf("%d. %s %d."+"$"+" тел.: %s%n"
                                        ,i+1
                                        ,customers[i].getCustumerName()
                                        ,customers[i].getCusumerMoney()
                                        ,customers[i].getCustumerPhone()
                            );
                        }
                    }
                    
                    System.out.println("Выберите номер покупателя: ");
                    int numberCustomer = scanner.nextInt(); scanner.nextLine();
                    history.setShoe(shoes[numberShoe - 1]);
                    history.setCustomer(customers[numberCustomer - 1]);
                    if(history.getShoe().getShoePrise() <= history.getCustomer().getCusumerMoney()){
                        for (int i = 0; i < histories.length; i++) {
                            System.out.printf("Обувь %s %d$ купил %s %s %n",
                                            history.getShoe().getShoeName(),
                                            history.getShoe().getShoePrise(),
                                            history.getCustomer().getCustumerName(),
                                            history.getCustomer().getCustumerPhone()
                                );
                            history.getCustomer().setCusumerMoney(history.getCustomer().getCusumerMoney()-history.getShoe().getShoePrise());
                            income.setIncome(income.getIncome()+history.getShoe().getShoePrise());
                            if(histories[i] == null){
                                histories[i] = history;
                                break;
                            }       
                        }
                    }
                    else {
                        System.out.println("У вас недостаточно средств! ");
                        break;
                    }
                case 8: 
                    System.out.println("Список покупателей: ");
                    for (int i = 0; i < customers.length; i++) {
                        if(customers[i] != null){
                            System.out.printf("%d. %s %d."+"$"+" тел.: %s%n"
                                        ,i+1
                                        ,customers[i].getCustumerName()
                                        ,customers[i].getCusumerMoney()
                                        ,customers[i].getCustumerPhone()
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
