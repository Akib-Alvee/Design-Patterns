import java.util.ArrayList;

public class Outputter {
    Outputtable obj;

    Outputter(Outputtable obj ){
        this.obj = obj;
    }

    public void printClass(){
        ArrayList<Data> info = obj.fetchInformation();
        System.out.println("{");
        for(int i=0;i<info.size();i++){
            String str = "";
            str += "  "+info.get(i).var_name+": "+info.get(i).value+"   <<<"+info.get(i).var_type+">>>";
            System.out.println(str);
        }
        System.out.println("}\n");
    }
}

