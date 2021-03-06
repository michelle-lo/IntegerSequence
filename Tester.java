import java.util.NoSuchElementException;
public class Tester {
  public static void main (String[] args) {
    IntegerSequence a1 = new Range(0, 5);
    System.out.println("\nlength()\n");
    print(a1.length(), 6);
    System.out.println("next()\n");
    print(a1.next(), 0);
    print(a1.next(), 1);


    IntegerSequence r = new Range(10,15);
    while(r.hasNext()){
      System.out.print(r.next());
      if( r.hasNext() ){
        System.out.print( ", " );
      }
    }
    System.out.println();
    try{
      r.next();
    } catch (NoSuchElementException e) {
      System.out.println("no such element");
    }

    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println("\nlength()\n");
    print(as.length(), 7);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }

    IntegerSequence b1 = new Range(10,20);
    IntegerSequence as1 = new ArraySequence(b1);

    System.out.println("ArraySequence(seq):");
    while(as1.hasNext()) {
      System.out.print(as1.next()+", ");
    }
    System.out.println();

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
