package de.ait;
//Создайте абстрактный класс StringTools, со статическими методами:
//
//String FirstToUpperCase(String str);
//Данный метод должен возвращать новую строку, в которой первый символ возведен в верхний регистр.
//Например, FirstToUpperCase("apple") -> "apple';
//
//boolean isStartingFromCapital(String str); Данный метод должен показывать, начинается ли строка с большой буквы. Например, isStartingFromCapital("Apple") -> true;
//isStartingFromCapital("apple") -> false;
//
//Напишите тесты для данных методов.
public abstract class StringTools {
        public static String FirstToUpperCase(String str){
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
            return str;
    }
        public static boolean isStartingFromCapital(String str){
            if (str.equals(str.substring(0, 1).toUpperCase() + str.substring(1))){
            return true;
        }
        return false;
    }
}

