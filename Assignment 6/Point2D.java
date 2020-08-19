public class Point2D {
    private double x, y;

    public Point2D(double xcor, double ycor){
        x = xcor;
        y = ycor;
    }

    public Point2D midPoint(Point2D p){
        x = ((x+p.x)/2);
        y = ((y+p.y)/2);
        return new Point2D(x,y);
    }


    public String toString(){
        return "Midpoint is: (" + x + " , " + y + ")";
    }

    public static void main(String args[]) {
        Point2D p1 = new Point2D(1,1);
        Point2D p2 = new Point2D(6,3);
        System.out.println(p1.midPoint(p2));
    }
}
