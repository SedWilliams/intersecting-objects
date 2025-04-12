import processing.core.PApplet;

/*TODO:
* Delete .class files
*/

public class Main extends PApplet {

    Shape innerShape = new ShapeBuilder().setRadius(40).setX(500f).setY(400f).setP(this).build();
    Shape outerShape = new ShapeBuilder().setRadius(40).setX(mouseX).setY(mouseY).setP(this).build();

    public void settings() {
        size(1000, 800);
    }

    public void setup() {
    }

    public void draw() {
        background(0);

        innerShape.drawShape();
        outerShape.drawShape();
        outerShape.updateShapePos(mouseX, mouseY);

        boolean intersects = intersectionAlgorithm(innerShape.x, innerShape.y, outerShape.x, outerShape.y, innerShape.radius, outerShape.radius);

        if(intersects) {
            innerShape.shapeColor = 255f;
            outerShape.shapeColor = 255f;
        } else {
            innerShape.shapeColor = 150f;
            outerShape.shapeColor = 150f;
        }
    }

    public boolean intersectionAlgorithm(float x1, float y1, float x2, float y2, float r1, float r2) {
        float distanceBetweenShapes;
        //distanceBetweenShapes = (x1-x2)/(y1-y2);

        /*
        System.out.println("radius: " + r1);
        System.out.println("Distance between the shapes: " + distanceBetweenShapes);
        try {
            Thread.sleep(2500); // Pause for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        double diff1 = Math.abs(x1 - x2);
        double diff2 = Math.abs(y1 - y2);
        double resBeforeSqrt = (Math.pow(diff1, 2.0) + Math.pow(diff2, 2));
        return Math.sqrt(resBeforeSqrt) <= (r1 + r2);
        //return distanceBetweenShapes == 0;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
