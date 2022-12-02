package practiseTasks;

public class Elevator_If {
    public static void main(String[] args) {
        int floorNum=3;
        String result="";

        if(floorNum==1)
            result="Floor1 is selected.\nCompanies:Lobby, Verizon, Starbucks";
        else if(floorNum==2)
            result="Floor 2 selected. \nCompanies:Cybertek, NASA, Intelsat";
        else if(floorNum==3)
            result="Floor 3 selected. \nCompanies: Lyft, BofA, Stake house";
        else
        result="Invalid floor-6";

        System.out.println(result);

    }
}
