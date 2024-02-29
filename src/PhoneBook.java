import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class PhoneBook {
    Map<Integer,String> phonebook;



    public PhoneBook(){
        phonebook=new HashMap<>();
        phonebook.put(12234,"a");
        phonebook.put(2356,"b");
        phonebook.put(4456,"c");
        phonebook.put(1555,"a");



    }

    public  List<Integer> getPhoneByName(String name) {
        List<Integer> phoneNums = new ArrayList<>();
        Set<Map.Entry<Integer, String>> entries = phonebook.entrySet();
        Scanner scanner = new Scanner(System.in);


        if (!phonebook.containsValue(name)) {


            System.out.println("такого нету у тебя");
            System.out.println("хочешь добавлю? напиши + или -");

            if ("+".equalsIgnoreCase(scanner.next())) {
                System.out.println("введи номер, жми enter");
                phonebook.put(Integer.parseInt(scanner.next()), name);
                System.out.println("я добавил " + name + " ,всё норм");


            } else {
                System.out.println("тогда выбери фамилию");
                return new ArrayList<>();


            }
        }
        for (Map.Entry<Integer, String> entry : phonebook.entrySet()) {
            if (name.equalsIgnoreCase(entry.getValue())) {
                phoneNums.add(entry.getKey());
            }
        }

        System.out.println(phoneNums);

            System.out.println( ": такой есть, если хочешь добавить к нему номер нажми +, если нет -");

            if ("+".equalsIgnoreCase(scanner.next())){
                System.out.println("введи номер");
                phonebook.put(Integer.parseInt(scanner.next()), name);

                return phoneNums;
            }
            else {
                System.out.println("тогда выбери фамилию");

            }


            return phoneNums;
        }

    }

