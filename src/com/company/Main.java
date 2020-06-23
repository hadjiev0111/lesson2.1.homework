package com.company;

public class Main {

    public static void main(String[] args) {
            System.out.println(inf(28, 15));
            System.out.println(inf(21, 11));
            System.out.println(inf(61, -7));
            System.out.println(inf(11, 32));
            System.out.println(inf(47, -24));
        }
        public static String inf(int age, int temperature){
            String result ="";
            if (age<45 && age>25 && temperature>-20 && temperature<30) {
                result = "Можно идти гулять";
            }if (age>20 && temperature<0 && temperature>28){
                System.out.println(result);
            }
            if (age>45 && temperature>-10 && temperature<25){
                System.out.println(result);
            }
            else{
                System.out.println("Нужно остаться дома");
            }
            return result;
        }
    }
