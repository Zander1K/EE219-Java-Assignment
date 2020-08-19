public class Rectangle {

    private double length;              // private class data members
    private double width;

    public Rectangle(double l, double w) {          // class constructor
        length =l;
        width = w;
    }

    Rectangle(double x1, double y1, double x2, double y2){  // Question 6
        length = x2 - x1;
        width = y2 - y1;
    }

    double perimeter(){
        return 2*(length + width);
    }
    public void printInfo(){
        System.out.println("The Length is: " + length + "| The Width is: " + width + "| The Perimeter is: " + perimeter());
    }



    public static void main(String[] args) {
        Rectangle a1 = new Rectangle(5,5);
        a1.printInfo();
        Rectangle a2 = new Rectangle(0,0,7,7);
        a2.printInfo();
    }
}
