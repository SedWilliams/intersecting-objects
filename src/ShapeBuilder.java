import processing.core.PApplet;

public class ShapeBuilder extends PApplet {

    float radius = 0f;
    float diameter = 0f;
    float circumference = 0f;
    float height = 0f;
    float width = 0f;
    float shapeColor = 150f;
    float borderColor = 150f;
    float x = 0f;
    float y = 0f;
    PApplet p = null;

    ShapeBuilder setX(float x) {
        this.x = x;
        return this;
    }

    ShapeBuilder setY(float y) {
        this.y = y;
        return this;
    }

    ShapeBuilder setRadius(float radius) {
        this.radius = radius;
        return this;
    }

    ShapeBuilder setDiameter(float diameter) {
        this.diameter = diameter;
        return this;
    }

    ShapeBuilder setCircumference(float circumference) {
        this.circumference = circumference;
        return this;
    }

    ShapeBuilder setHeight(float height) {
        this.height = height;
        return this;
    }

    ShapeBuilder setWidth(float width) {
        this.width = width;
        return this;
    }

    ShapeBuilder setShapeColor(float shapeColor) {
        this.shapeColor = shapeColor;
        return this;
    }

    ShapeBuilder setBorderColor(float borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    ShapeBuilder setP(PApplet p) {
        this.p = p;
        return this;
    }

    //call this method after what ever previous set classes called to return the shape object
    Shape build() {
        return new Shape(
                this.radius,
                this.diameter,
                this.circumference,
                this.height,
                this.width,
                this.shapeColor,
                this.borderColor,
                this.p,
                this.x,
                this.y
        );
    }

}
