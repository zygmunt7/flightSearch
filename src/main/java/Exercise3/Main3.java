package Exercise3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ComputerItems computerItems = new ComputerItems();
        computerItems.displayItems();
    }
}
class ComputerItems{
    ArrayList<String> list = new ArrayList<String>();

    public ComputerItems(){
        this.list.add("test");
        this.list.add("mouse");
        this.list.add("computer");
        this.list.add("keyboard");
        this.list.add("monitor");

    }
    public void displayItems(){
        for (int i=0;i< list.size();i++){
            String element2 = list.get(i);
            if (5<element2.length()){
                System.out.println(element2);
            }
        }
    }
}
