import java.util.*;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        System.out.println("hello world");
    }

}

// 전화번호 나타내는 클래스
class PhoneNumber {
    public final String phoneNumber;

    // 생성자
    public PhoneNumber(String rawPhonenumber) {
        this.phoneNumber = rawPhonenumber.replaceAll("[^0-9]", "");
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "phoneNumber ='" + phoneNumber + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof  PhoneNumber)) return false;
        return phoneNumber.equals(((PhoneNumber) o).phoneNumber);
    }

    public static void phone() {
        Person minju = new Person("민주");
        minju.addPhoneNumber(new PhoneNumber("010-8225-1849"));
        minju.addPhoneNumber(new PhoneNumber("01066301849"));
        minju.addPhoneNumber(new PhoneNumber("010 9901 1849"));

        Person jaemin = new Person("재민");
        jaemin.addPhoneNumber(new PhoneNumber("010-8225-1849"));
        jaemin.addPhoneNumber(new PhoneNumber("01066301849"));
        jaemin.addPhoneNumber(new PhoneNumber("010 9901 1849"));

        PhoneBook book = new PhoneBook();
        book.addPerson(minju);
        book.addPerson(minju);
        System.out.println(book.search(new PhoneNumber("0000")));
    }
}

class Person {
    public final String name;
    private final List<PhoneNumber> numbers;

    public Person(String name) {
        this.name = name;
        numbers = new ArrayList<>();
    }

    public void addPhoneNumber (PhoneNumber number) {
        numbers.add(number);
    }

    public boolean hasPhoneNumber (PhoneNumber number) {
        return numbers.contains(number);
    }

    @Override
    public  String toString() {
        return "Person{" + "name='" + name + '\'' + ", numbers=" + numbers + '}';
    }
}

class PhoneBook {
    private final Set<Person> people;

    public PhoneBook() {
        people = new HashSet<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person search(PhoneNumber number) {
        return people.stream().filter(p -> p.hasPhoneNumber(number))
                .findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "PhoneBook{" + "people=" + people + '}';
    }
}