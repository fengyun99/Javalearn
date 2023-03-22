import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class HashCodeEqualsClass{}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }
    //必须重写
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class UseHashCodeAndEquals {
    public static void main(String[] args) {
//        HashCodeEqualsClass hcec1 = new HashCodeEqualsClass();
//        HashCodeEqualsClass hcec2 = hcec1;
//        HashCodeEqualsClass hcec3 = new HashCodeEqualsClass();
//        System.out.println(hcec1.equals(hcec2));
//        System.out.println(hcec1.equals(hcec3));
//        //hashcode同一个对象引用相同
//        System.out.println(hcec1.hashCode());
//        System.out.println(hcec2.hashCode());
//        System.out.println(hcec3.hashCode());
        //怎么处理的？不是现在方法解决
        Person person = new Person("at");
        Person personcopy = new Person("at");
        System.out.println(person.hashCode());
        System.out.println(personcopy.hashCode());
        System.out.println(person.equals(personcopy));
        //HashMapTest
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("Kevin"),"Hi");

        System.out.println(map.get(new Person("Kevin")));

    }
}
