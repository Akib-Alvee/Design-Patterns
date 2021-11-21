import java.util.ArrayList;

class Book implements Outputtable{
    private String name,author;
    private Integer numpage;

    public String toString(){
        return "Book Name: "+ this.name+"\nAuthor Name: "+this.author+"\nNumber Of Page: "+numpage;
    }

    Book(String name, String author, int numpage){
        this.name = name;
        this.author = author;
        this.numpage = numpage;
    }

    void setName(String name){
        this.name = name;
    }

    void setAuthor(String author){
        this.author = author;
    }

    void setNumPage(int numpage){
        this.numpage = numpage;
    }

    @Override
    public ArrayList<Data> fetchInformation() {
        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data("name",this.name.getClass().getSimpleName(),this.name));
        info.add(new Data("author",this.name.getClass().getSimpleName(),this.author));
        info.add(new Data("num_page",this.name.getClass().getSimpleName(),this.numpage.toString()));

        return info;
    }


}