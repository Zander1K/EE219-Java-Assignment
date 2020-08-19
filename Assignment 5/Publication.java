public class Publication {
    private String author;
    private String title;
    private String year;

    public Publication(String au, String ti, String ye){
        author = au;
        title = ti;
        year = ye;
    }

    void display(){
        System.out.println("Author: " + author + " | Title: " + title + " | Year: " + year);
    }

    public static void main(String[] args) {
        Publication p1 = new Publication("Mildred D Taylor", "Roll of Thunder Hear My Cry", "1976");
        p1.display();
    }
}
