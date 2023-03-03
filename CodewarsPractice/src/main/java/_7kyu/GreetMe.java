package _7kyu;

/*
https://www.codewars.com/kata/535474308bb336c9980006f2
 */
public class GreetMe {
    public static String greet(String name){
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.append(Character.toUpperCase(name.charAt(0)))
                .append(name.substring(1).toLowerCase())
                .append("!");
        return stringBuilder.toString();
    }

    public static String greetAlter(String name){
        return String.format("Hello %s!", name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
    }
}
