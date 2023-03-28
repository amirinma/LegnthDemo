/**
This program demonstrate the rectanlge class's setLength method.
*/

public class LengthDemo{
   public static void main(String[] args){
      Rectanlge box = new Rectanlge();//creates a rectangle object and assign its address to the box veriable 
      System.out.println("Sending the length and width values down to the class field.");// indicates what we are doing
      
      box.setLength(10.0);// call the box object's setLength method 
      box.setWidth(20.0); // call the box object's setWidth method
      System.out.println("Done setting length and width!"); // indicates we are done
      System.out.println("The box's length is: " + box.getLength());
      System.out.println("The box's width is: " + box.getWidth());
   }
}