import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start,  int end){
    this.start = start;
    this.end = end;
  }

  public void reset(){
    current = this.start;
  }

  public int length(){
    return this.end - this.start + 1;
  }
  public boolean hasNext(){
    return true;
  }

  //@throws NoSuchElementException
  public int next(){
    return 0;
  }

}
