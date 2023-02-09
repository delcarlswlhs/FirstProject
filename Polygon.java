
/**
 * @file Polygon.java
 * @date 2/2/23
 * @author Simone Del Carlo
 *
 * @description Creates a polygon with a number of sides,
 *              side length, and shape type.
 */
public class Polygon {

  // instance variables
  private int numSides;
  private double sideLength;
  private String shapeType;
  private boolean isPolygon;
  private double polyArea;
  private double shapePerimeter;

  /**
   * @description creates a default polygon
   */
  public Polygon() {
    isPolygon = true;
    numSides = 3;
    sideLength = 1.0;
    shapeType = "triangle";
  }

  /**
   * creates a polygon with number of sides, side length, and shape type
   * 
   * @param sides
   * @param sLength
   * @param sType
   */
  public Polygon(int sides, double sLength, String sType) {
    numSides = sides;
    sideLength = sLength;
    shapeType = sType;
    if (numSides > 2 && sideLength > 0) {
      isPolygon = true;
    } else {
      isPolygon = false;
    }
    if (isPolygon == false) {
      numSides = 3;
      sideLength = 1.0;
      shapeType = "triangle";
    }
  }

  // accessors as needed

  /**
   *
   * @return number of sides
   */
  public int getNumSides() {
    return numSides;
  }

  /**
   *
   * @return side length
   */
  public double getSideLength() {
    return sideLength;
  }

  /**
   *
   * @return the shape type
   */
  public String getShapeType() {
    return shapeType;
  }

  /**
   *
   * @return the area
   */
  public double getArea() {
    return calculateArea();
  }

  /**
   *
   * @return the perimeter
   */
  public double getPerimeter() {
    return calculatePerimeter();
  }

  /**
   *
   * @return the shape's perimeter
   */
  public double calculatePerimeter() {
    shapePerimeter = numSides * sideLength;
    shapePerimeter = Math.round(shapePerimeter * 1000) / 1000.0;
    return shapePerimeter;
  }

  /**
   * 
   * 
   * @return the area of any n-sided polygon to 3 decimal places
   */
  public double calculateArea() {
    polyArea = (sideLength * sideLength * numSides) / (4 * Math.tan(Math.toRadians(180 / numSides)));
    polyArea = Math.round(polyArea * 1000) / 1000.0;
    return polyArea;
  }

  // mutators

  // set number of sides
  public void setNumSides(int sides) {
    if(sides>2){
    numSides = sides;
  }
  }

  // set length of sides
  public void setSideLength(double newLength) {
    if(newLength>=1.0){
    sideLength = newLength;
    }
  }

  // set the shape type
  public void setShapeName(String shapeName) {
    shapeType = shapeName;
  }

  // toString method
  public String toString() {
    if (isPolygon == true) {
      return "Your shape is a " + shapeType + " and it has " + numSides + " sides.\n" + "It has a side length of "
          + sideLength + " units.\n" + "It has a perimeter of " + calculatePerimeter() + " units.\n"
          + "It has an area of " + calculateArea() + " units.";
    } else {
      return "Not a valid polygon. Your polygon was given a default of " + numSides
          + " sides, was named \"" + shapeType + "\", and each side has a length of " + sideLength + " units.";
    }
  }
}
