package lesson16Equals;

/**
 * JavaAdvanced
 * 17/08/2020
 */
public class Main {
    public static void main(String[] args) {
        Address address = new Address("Berlin","Tauban str");
        Person p1= new Person("Jack",address);
        Person p2= new Person("Nick",address);
        Person p3= new Person("Jack",address);


       // System.out.println(p1==p2);
        //System.out.println(p1==p3);       //not true,
        System.out.println(p1.equals(p3));  // true, but you have to override equal method
                                            // in Person class and Address class
    }
}
