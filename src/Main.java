import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(1000, 800);
    }

    public void setup() {
    }

    public void draw() {
        background(0);

        Shape innerShape = new ShapeBuilder().setRadius(10).setX(width/2f).setY(height/2f).setP(this).build();
        Shape outerShape = new ShapeBuilder().setRadius(10).setX(mouseX).setY(mouseY).setP(this).build();

        innerShape.drawShape();
        outerShape.drawShape();

        boolean intersects = intersectionAlgorithm(innerShape.x, innerShape.y, outerShape.x, outerShape.y, innerShape.radius, outerShape.radius);

        if(intersects) {
            innerShape.shapeColor = 255f;
            outerShape.shapeColor = 255f;
        }
    }

    public boolean intersectionAlgorithm(float x1, float y1, float x2, float y2, float r1, float r2) {
        float distanceBetweenShapes;
        distanceBetweenShapes = (x1-x2)/(y1-y2);

        return (-1 * r1) - (r2) + distanceBetweenShapes == 0;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
