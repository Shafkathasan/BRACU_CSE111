public class Rectangle extends Shape {
    public int x, y;
    public double area;
    public Rectangle (int _x, int _y) {
        x =_x;
        y =_y;
    }
    public double getArea() {
        area = x*y;
        return area;
    }
}