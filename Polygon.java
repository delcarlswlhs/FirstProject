import java.text.DecimalFormat;
/**
 * @file Polygon.java
 * @date 2/2/23
 * @author Simone Del Carlo
 *
 * @description Creates a polygon with a number of sides,
 * side length, and shape type.
 */
public class Polygon {

    //instance variables
    private int numSides;
    private double sideLength;
    private String shapeType;
    private boolean isPolygon;
    private double polygonRadius;

    //2 constructors

    /**
     * creates a default polygon
     */
    public Polygon(){
    isPolygon = true;
    numSides = 3;
    sideLength = 1.0;
    shapeType = "triangle";
    }

    /**
     * creates a polygon with number of sides, side length, and shape type
     * @param sides
     * @param sLength
     * @param sType
     */
    public Polygon(int sides, double sLength, String sType){
      numSides = sides;
      sideLength = sLength;
      shapeType = sType;
      if(numSides>2 && sideLength>0){
            isPolygon = true;
        }
      else{
            isPolygon = false;
        }
    }

    //accessors as needed

    /**
     *
     * @return number of sides
     */
    public int getNumSides(){
        return numSides;
    }

    /**
     *
     * @return side length
     */
    public double getSideLength(){
        return sideLength;
    }

    /**
     *
     * @return the shape type
     */
    public String getShapeType(){
        return shapeType;
    }

    /**
     *
     * @return the shape's perimeter
     */
    public double calculatePerimeter(){
        return numSides*sideLength;
    }

    /**
     *(always seem to get 2.34... still working on it)
     * @return the area of any n-sided polygon to 3 decimal places
     */
    public double calculateArea(){
      //polygonRadius = sideLength/(2*(1/(java.lang.Math.tan(180/numSides))));
      double polyArea = (double) numSides/4*sideLength*sideLength*((double)1/(java.lang.Math.tan(180/numSides)));
      return polyArea;
    }


    //mutators

    //set number of sides
    public void setSides(int sides){
      numSides = sides;
    }

    //set length of sides
    public void setLength(double newLength){
      sideLength = newLength;
    }

    //set the shape type
    public void setShape(String shapeName){
      shapeType = shapeName;
    }

    //toString method
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.###");
        if(isPolygon == true){
        return "Your shape is a " + shapeType + " and it has " + numSides + " sides.\n" + "It has a side length of "+ sideLength + ".\n" + "It has a perimeter of " + df.format(calculatePerimeter())+".";
    }
      else{
        return "Not a valid polygon";
      }
    }
}
