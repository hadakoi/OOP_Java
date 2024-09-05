public class ByTwos implements Series {
  private int start;
  private int current;

  public ByTwos() {
    this.start = 0;
    this.current = start;
  }

  @Override
  public int getNext() {
    int value = current;
    current += 2;
    return value;
  }

  @Override
  public void reset() {
    current = start;
  }

  @Override
  public void setStart(int start) {
    this.start = start;
    this.current = start;
  }
}
