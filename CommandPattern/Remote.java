import java.util.ArrayList;

public  class Remote {
    ArrayList<Command> btn_arr = new ArrayList<>();
    Remote(){
        for (int i=0;i<10;i++){
            btn_arr.add(new NullCommand());
        }
    }
    void setCommand(int idx,Command command){
        btn_arr.set(idx,command);
    }
    void pushButton(int idx){
        btn_arr.get(idx).execute();
    }
}
