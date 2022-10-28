import java.util.Comparator;

public class CompareAnimalByAgeAndName implements Comparator<Animal> {
  @Override
  public int compare(Animal o1, Animal o2) {
    int nameCompare = o1.getName().compareTo(o2.getName());
    int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
//    int ageCompare = o1.getAge() - o2.getAge();
    return ageCompare == 0 ? nameCompare : ageCompare;
  }
}
