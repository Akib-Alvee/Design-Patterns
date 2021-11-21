public class Mango extends JuiceMaker{
    public String toString(){
        return "Mango";
    }
    @Override
    void customize() {
        blend(new Mango());
        addSugar(2);
        refrigerate(20);
    }

}
