public class Vector3 {

    private double x;
    private double y;
    private double z;

    public Vector3(double xx, double yy, double zz)
    {
        x = xx;
        y = yy;
        z = zz;
    }

    Vector3 crossProduct(Vector3 vec)
    {

        double i = (y*vec.z - z*vec.y);
        double j = (z*vec.x - x*vec.z);
        double k = (x*vec.y - y*vec.x);

        vec.x = i;
        vec.y = j;
        vec.z = k;


        return new Vector3(i,j,k);
    }

    public static void main(String[] args) {
        Vector3 v1 = new Vector3(+1,+2,+3);
        Vector3 v2 = new Vector3(-3,-5,-7);
        v1.crossProduct(v2);
        System.out.print(v1.crossProduct(v2).x + "i");
        if(v1.crossProduct(v2).y>=0){
            System.out.print(" + ");
        }else{
            System.out.print(" - ");
        }
        System.out.print(v1.crossProduct(v2).y + "j");
        if(v1.crossProduct(v2).z>=0){
            System.out.print(" + ");
        }else{
            System.out.print(" - ");
        }
        System.out.print(v1.crossProduct(v2).z + "k");
    }
}