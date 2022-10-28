import java.util.StringJoiner;

public class Pair implements Comparable<Pair> {
  String firstString;
  String secondString;

  public Pair(String firstString, String secondString) {
    this.firstString = firstString;
    this.secondString = secondString;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Pair.class.getSimpleName() + "[", "]")
      .add("firstString='" + firstString + "'")
      .add("secondString='" + secondString + "'")
      .toString();
  }

  @Override
  public int compareTo(Pair o) {
    if (this.firstString.compareTo(o.firstString) != 0) {
      return o.firstString.compareTo(this.firstString);
    } else {
      return o.secondString.compareTo(this.secondString);
    }
  }
}
