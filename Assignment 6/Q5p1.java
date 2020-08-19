public class Q5p1 implements Printable{
    private String name;
    private int year;

    public Q5p1(String n, int y){
        n = name;
        y = year;
    }

    @Override
    public void print(){
        System.out.println("My nmae is: " + name);
        System.out.println("I am born in: "+ year);
    }

    public static void main(String[] args) {
        Q5p1[] a;
        a = new q5p1[2];
        a[0] = new q5p1("Alex", 2001);
        a[1] = new q5p1("James", 2000);
        for(int i =0;i<2){
            a[i].print();
        }
    }
}
