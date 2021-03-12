public class StrassenBahn {
    public static void main(String[] args) {


        timeToTarget (5,6,6);
        timeToTarget (1,1,6);
       /* for (int i = 1; i <7; i++) {
            timeToTarget (i,0,0);
        }*/


    };

    public static void timeToTarget(int station_number,int station_with_problem,int additional_time) {
        String[] my_string= {  "Bei Station 1 sind es noch 20 Minuten",
                               "Bei Station 2 sind es noch 16 Minuten",
                               "Bei Station 3 sind es noch 15 Minuten",
                               "Bei Station 4 bleiben noch 10 Minuten über",
                               "Bei Station 5 sind es dann nur noch 3 Minuten",
                               "Du bist am Ziel!!! Aussteigen!!"};
        int[] timeToTarget= { 20,16,15,10,3,0};

        if(station_number<=station_with_problem) {
            timeToTarget[station_number-1]=timeToTarget[station_number-1]+additional_time;
        }
        System.out.println("Station number ist: "+my_string[station_number-1]);

        System.out.println("time to target ist: " +timeToTarget[station_number-1]);
        System.out.println("from string"+my_string[station_number-1]);

    }
}
