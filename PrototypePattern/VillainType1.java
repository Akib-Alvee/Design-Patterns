public class VillainType1 extends Villain {

    private int hp,mp;
    VillainType1(int hp,int mp){
        super();
        this.hp = hp;
        this.mp =mp;
    }
    @Override
    public Villain makeClone() {
        return new VillainType1(this.hp, this.mp);
    }

    @Override
    void attackProtagonist() {
        System.out.println("Attacking protagonist");
        
    }

    public String toString(){
        return "<<<< HP:"+this.hp+"  MP:"+this.mp+">>>>";
    }
    
}
