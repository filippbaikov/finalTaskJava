import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        System.out.println("введи фамилию");
        Scanner scanner =new Scanner(System.in);


        while (true){
            String name = scanner.next();
            if ("q".equalsIgnoreCase(name)){
                System.out.println("давай досвидания");
                System.exit(0);
            }
            System.out.println(phoneBook.getPhoneByName(name));
        }








        }



    }
