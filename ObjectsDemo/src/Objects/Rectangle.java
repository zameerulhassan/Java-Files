
package Objects;
public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Points origin;
     
    // four constructors
    public Rectangle() {
    origin = new Points(0, 0);
    }
    public Rectangle(Points p) {
    origin = p;
    }
    public Rectangle(int w, int h) {
    origin = new Points(0, 0);
    width = w;
    height = h;
    }
    public Rectangle(Points p, int w, int h) {
    origin = p;
    width = w;
    height = h;
    }
 
    // a method for moving the rectangle
    public void move(int x, int y) {
    origin.x = x;
    origin.y = y;
    }
 
    // a method for computing the area of the rectangle
    public int getArea() {
    return width * height;
    }
}
