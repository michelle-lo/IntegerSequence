public class Tester {
  public static void main (String[] args) {
    Range a1 = new Range(0, 5);
    System.out.println("\nlength()\n");
    print(a1.length(), 6);
  }

  public static void print (Object actual, Object expected) {
    String str = "";
    str += "Actual: " + actual + "\n";
    str += "Expected: " + expected + "\n";
    if (actual.equals(expected)) {
      str += "Success! :)\n";
    } else {
      str += "Fail! :(\n";
    }
    System.out.println(str);
  }
}
