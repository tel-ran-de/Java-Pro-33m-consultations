import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int a = 1;
    Integer b = 1;

    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(7);
    list.add(-1);

//    System.out.println("Before sort: " + list);
//
//    Collections.sort(list);
//
//    System.out.println("After sort: " + list);


    Cat vaska = new Cat("Vaska", 10);
    vaska.setName("NewName");
    System.out.println(((Animal)vaska).getName());
    Dog sharik = new Dog("sharik", 10);
    Cat marusa = new Cat("Marusa", 10);
    Dog drujok = new Dog();
    List<Animal> animalList = new ArrayList<>();
    animalList.add(vaska);
    animalList.add(sharik);
    animalList.add(marusa);

//    System.out.println("Before sort: " + animalList);
////    Collections.sort(animalList, new CompareAnimalByAgeAndName());
//    Collections.sort(animalList);
//    System.out.println("After sort: " + animalList);

    Person ivan = new Person("Ivan", 43);
    Person sveta = new Person("Sveta", 31);
    Person dima = new Person("Dima", 25);

    List<Person> personList = new ArrayList<>();
    personList.add(ivan);
    personList.add(sveta);
    personList.add(dima);

    personList.sort(new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });

    personList.sort(Comparator.comparing(Person::getName));


    Comparator<Person> personComparator = Comparator.comparing(Person::getAge);

    Collections.sort(personList, personComparator);

    personList.sort(personComparator);


    System.out.println(personList);


//    boolean isEqualsPrimitive = a == b;
//    System.out.println(isEqualsPrimitive);


//    System.out.println(sharik.equals(vaska));
//    System.out.println(vaska.equals(sharik));

//    Cat marusa = new Cat("Vasks", 3);
//
//
//    Person vasiliy = new Person("Vaska", 3);
//
//    System.out.println(vaska.equals(vasiliy));
//    Cat vaska = null;
//    Cat marusa = null;

//    boolean isCatEquals = vaska == marusa;

//    System.out.println(isCatEquals);
//    System.out.println(vaska.equals(marusa));


//    String s1 = null;
//    String s2 = "String";
//
//    System.out.println(s1.equals(s2));


    Pair pair1 = new Pair("abc", "last");
    Pair pair2 = new Pair("pklz", "yelp");
    Pair pair3 = new Pair("rpng", "note");
    Pair pair4 = new Pair("ppza", "xyz");


    List<Pair> pairList = new ArrayList<>();
    pairList.add(pair1);
    pairList.add(pair2);
    pairList.add(pair3);
    pairList.add(pair4);

    System.out.println("Before sort: " + pairList);

    Collections.sort(pairList);

    System.out.println("After sort: " + pairList);

  }
}
