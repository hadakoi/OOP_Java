public class Main {
  public static void main(String[] args) {
    Series series = new ByTwos();

    series.setStart(10);

    System.out.println("Series starting at 10:");
    for (int i = 0; i < 5; i++) {
      System.out.println(series.getNext());
    }

    series.reset();

    System.out.println("Series after reset:");
    for (int i = 0; i < 5; i++) {
      System.out.println(series.getNext());
    }
  }
}
