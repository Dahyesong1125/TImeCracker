public class Line {
    protected Point p1;
    protected Point p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    void draw() {
        System.out.println("Line drawn from " + p1 + " to " + p2);
    }
}

