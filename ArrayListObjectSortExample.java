package ArrayListEx;

import java.util.*;

class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin",47));
        people.add(new Person("Chris", 34));
        people.add(new Person("Rajeev", 25));
        people.add(new Person("David", 31));

        System.out.println("Person list : " + people);
        people.sort((persion1, persion2) -> {
            return persion1.getAge() - persion2.getAge();
        });
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted Person List by age: " + people);
        Collections.sort(people,Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by name: " + people);
    }
}
