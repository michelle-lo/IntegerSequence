import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }

  //Postcondition: The otherseq will be reset.
  //This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    int[] arr = new int[otherseq.length()];
    int i = 0;
    while (otherseq.hasNext()) {
      arr[i] = otherseq.next();
      i++;
    }
    data = arr;
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    return currentIndex <= length() - 1;
  }

  public int next(){
    if (!hasNext()) {
      throw new NoSuchElementException("No more elements left");
    }

    int tempCurrent = data[currentIndex];
    currentIndex++;
    return tempCurrent;
  }
}
