public class Q5p2 implements Printable{
    private String name;
    private String height;

    public Q5p1(String n, String h){
        n = name;
        h = height;
    }

    @Override
    public void print(){
        System.out.println("My name is: " + name);
        System.out.println("My Height: "+ height);
    }

    public static void main(String[] args) {
        Q5p1[] a;
        a = new q5p1[2];
        a[0] = new q5p1("Alex", "5ft 11");
        a[1] = new q5p1("James", "6ft 3");
        for(int i =0;i<2){
            a[i].print();
        }
    }
}
