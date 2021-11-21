public class Orange extends JuiceMaker{

    @Override
    void customize() {
        blend(new Orange());
        addSugar(3);
        refrigerate(10);
    }
    
}
