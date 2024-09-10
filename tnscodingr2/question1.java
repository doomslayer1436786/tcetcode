@FunctionalInterface
interface Sayable {

    //abstract method
    String say(String message);
}

public class question1 {
    public static void main(String[] args) {
        //implementing the sayable interface using  lambda expression
        Sayable sayable = (message) -> "Hello "+message+" welcome to java";

        //calling the say method
        String greeting=sayable.say("aqeel");
        System.out.println(greeting);
    }
}

