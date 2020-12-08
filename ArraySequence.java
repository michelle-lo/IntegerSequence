import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;

  }

  public void reset(){

  }

  public int length(){
    return 0;
  }
  public boolean hasNext(){
    return true;
  }

  public int next(){
    return 0;
  }
}
