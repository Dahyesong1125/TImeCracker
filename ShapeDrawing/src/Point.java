public class Point {
  
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
      return this.x;
  }

  public int gety() {
    return this.y; // this 꼭 안 써도 됨 -> 근데 가독성을 위함
}

public String toString() {
   //(3, 4)
  return String.format(format:"%s, %s"), this.x, this.y);
}

}
