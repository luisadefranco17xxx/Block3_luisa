public class StrassenBahn {
    public static void main(String[] args) {

        timeToTarget (6,5,6);
        timeToTarget (5,6,6);
        timeToTarget (1,1,6);
        timeToTarget (2,1,6);
        timeToTarget (1,0,0);

    }

    public static void timeToTarget(int station_number,int station_with_problem,int additional_time) {
        String[] my_string= {  "Bei Station 1 sind es noch ",
                               "Bei Station 2 sind es noch ",
                               "Bei Station 3 sind es noch ",
                               "Bei Station 4 bleiben noch ",
                               "Bei Station 5 sind es nur noch ",
                               "Du bist am Ziel!!! Aussteigen!!"};
        int[] timeToTarget= { 20,16,15,10,3,0};
        System.out.println();
        if(station_number<=station_with_problem) {
            timeToTarget[station_number-1]=timeToTarget[station_number-1]+additional_time;
        }
        System.out.print(my_string[station_number-1]);
        System.out.println(timeToTarget[station_number-1] + " Minuten!");

    }
}
