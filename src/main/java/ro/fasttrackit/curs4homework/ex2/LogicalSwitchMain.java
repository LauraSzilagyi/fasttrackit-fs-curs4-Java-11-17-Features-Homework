package ro.fasttrackit.curs4homework.ex2;

public class LogicalSwitchMain {
    public static void main(String[] args) {
        Person person = new Person("Ana", 30, "testaddress");
        Person person2 = new Person("Ioan", 27, "testaddress");
        Person sw1 = LogicalSwitch.switchCustom(person);
        Person sw2 = LogicalSwitch.switchCustom(person2);
        System.out.println(sw1);
        System.out.println(sw2);
    }
}
