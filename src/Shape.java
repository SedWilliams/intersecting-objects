import processing.core.*;

public class Shape extends PApplet {

    float radius;
    float diameter;
    float circumference;
    float height;
    float width;
    float shapeColor;
    float borderColor;
    PApplet p;
    float x;
    float y;

    //shape constructor function called from builder class
    Shape(
            float radius,
            float diameter,
            float circumference,
            float height,
            float width,
            float shapeColor,
            float borderColor,
            PApplet p,
            float x,
            float y
    ) {
        this.radius = radius;
        this.diameter = diameter;
        this.circumference = circumference;
        this.height = height;
        this.width = width;
        this.shapeColor = shapeColor;
        this.borderColor = borderColor;
        this.p = p;
        this.x = x;
        this.y = y;
    }

    void drawShape() {
        p.ellipseMode(RADIUS);

        p.stroke(this.borderColor);
        p.fill(this.shapeColor);
        p.ellipse(this.x, this.y, this.radius, this.radius);
    }

    void updateShapePos(float x, float y) {
        this.x = x;
        this.y = y;
    }

}


