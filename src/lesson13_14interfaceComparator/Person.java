package lesson13_14interfaceComparator;
/**
 * JavaAdvanced
 * 05/08/2020
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

/*@Override // by name
    public int compareTo (Person person){
        return this.name.compareTo(person.name);
    }*/


    /*@Override // by age
    public int compareTo(Person person) {
        return this.age-person.age;
    }*/

    /*@Override  // class code  by age
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -1;
        }
        return 0;
    }*/

    // by name and age
    @Override
    public int compareTo(Person person) {
        int nameComparing = this.name.compareTo(person.name);
        if (nameComparing == 0) {
            return this.age - person.age;
        } else {
            return nameComparing;
        }
    }
    // by name and age
   /* @Override
    public int compareTo(Person person) {
        int nameComparing = this.name.compareTo(person.name);
        if (this.name.compareTo(person.name) == 0) {
            return this.age - person.age;
        } else {
            return this.name.compareTo(person.name);
        }
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




}
