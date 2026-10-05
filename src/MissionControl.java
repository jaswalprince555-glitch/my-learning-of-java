public class MissionControl{

    public static void main(String[] args){
    byte a = 4;
    float fuel = 98.5f;
    long distance = 150000000000l;
    boolean missioncontrol = true;
    char rank = 'A';
    int speed = 500;

    System.out.println("===SPACESHIP DIAGNOSTICS===");
    System.out.println("Engines:"+ a);
    System.out.println("Fuel:"+ fuel + "%");
    System.out.println("Distance:" + distance);
    System.out.println("Launch Ready?" + missioncontrol);
    System.out.println("Rank:" + rank);
    System.out.println("Boosted Speed:" + (speed + (int)99.9));
    System.out.println("========================");

    }
}
