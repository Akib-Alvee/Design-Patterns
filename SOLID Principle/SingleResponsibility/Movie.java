import java.util.ArrayList;

class Movie implements Outputtable{
    private String name,director;
    private Integer runtime;
    private Double imdbRating;

    public String toString(){
        return "Book Name: "+ this.name+"\ndirector Name: "+this.director+"\nNumber Of Page: "+runtime;
    }

    Movie(String name, String director, int runtime,double imdbRating){
        this.name = name;
        this.director = director;
        this.runtime = runtime;
        this.imdbRating = imdbRating;
    }

    void setName(String name){
        this.name = name;
    }

    void setdirector(String director){
        this.director = director;
    }

    void setruntime(int runtime){
        this.runtime = runtime;
    }

    @Override
    public ArrayList<Data> fetchInformation() {
        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data("name",this.name.getClass().getSimpleName(),this.name));
        info.add(new Data("director",this.name.getClass().getSimpleName(),this.director));
        info.add(new Data("runtime",this.name.getClass().getSimpleName(),this.runtime.toString()));
        info.add(new Data("imdbRating",this.name.getClass().getSimpleName(),this.imdbRating.toString()));

        return info;
    }

}