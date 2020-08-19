public class Book extends Publication{
    private String publisher;

    public Book(String au, String ti, String ye, String pub){
        super(au,ti,ye);
        publisher = pub;
    }

    public void display(){
        super.display();
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Book[] b;
        b = new Book[5];
        b[0] = new Book("Mildred D Taylor", "Roll of Thunder Hear My Cry", "1976", "Alexander Dare");
        b[1] = new Book("Mildred D Taylor", "Roll of Thunder Hear My Cry", "1976", "Alexander Dare");
        b[2] = new Book("Mildred D Taylor", "Roll of Thunder Hear My Cry", "1976", "Alexander Dare");
        b[3] = new Book("Mildred D Taylor", "Roll of Thunder Hear My Cry", "1976", "Alexander Dare");
        b[4] = new Book("Mildred D Taylor", "Roll of Thunder Hear My Cry", "1976", "Alexander Dare");

        int i;
        for(i=0;i<5;i++){
            b[i].display();
        }
    }

}
