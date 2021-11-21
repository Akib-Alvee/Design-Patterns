public class SingleResponsibility {
    public static void main(String[] args) {
        Book book = new Book("The Kite runner" , "Khaled Hussaini" , 240);

        //System.out.println(book);

        Movie movie1 = new Movie("Intersteller", "Christopher Nolan", 180, 8.9);
        Movie movie2 = new Movie("Inception", "Christopher Nolan", 180, 8.9);

        //System.out.println(movie);

        Outputter ot = new Outputter(movie1);
        


        ot.printClass();
        ot.obj = movie2;
        ot.printClass();
        ot.obj = book;
        ot.printClass();
    }
}
