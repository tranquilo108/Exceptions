package com.example.hw3;

public class Parser {
    public Person getData(String name, String phone, String date, String sex) {
        return new Person(parseName(name), parsePhone(phone),  parseDate(date), sex);
    }


    public String parseName(String name) {
        try {
            String n = name.split(" ")[2];
            if (name.split(" ").length > 3) {
                return "Error: Вы ввели лишнюю информацию ФИО";
            }
        } catch (ArrayIndexOutOfBoundsException e){
            return "Error: Вы ввели не всю информацию ФИО";
        }
        return name;
    }
    public String parsePhone(String phone) {
        try {
            if(Long.parseLong(phone) >= 80000000000L && Long.parseLong(phone) <= 89999999999L){
                return phone;
            }
        }catch (NumberFormatException e){
            return "Error: Номер телефона должен состоять только из цифр";
        }
        return "Error: Номер должен содержать 11 цифр и начинаться с цифры 8";
    }
    public String parseDate(String date) {

        try {
            String s = date.split("\\.")[2];
            if(date.split("\\.").length > 3){
                return "Error: Вы ввели лишние символы";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Error: Вы ввели неправильную дату";
        }
        return date;
    }
}
