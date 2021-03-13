import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] my_array1=new int[2][3];
        my_array1= new int[][]{{1, 2, 3},
                               {4, 2, 6}};

        int[] my_arrayResult= new int[6];

        my_arrayResult= getFlatArray(my_array1);
        System.out.println(Arrays.toString(my_arrayResult));
    }
    public static int[] getFlatArray(int[][] numbers){
    int[] flatArray = {-1,-1,-1,-1,-1,-1};

    int z=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                //Erweitern: doppelte Zahl aussortieren
                if (!compareWithOtherValue(flatArray,numbers[i][j])){           //nummer nicht anwesend
                        flatArray[z]=numbers[i][j];
                        z++;
                } else {
                    //nicht tun?
                }

            }
        }

    return flatArray;
    };

    public static boolean compareWithOtherValue(int[] myArray, int value) {
        boolean jetHere = false;
        for (int i = 0; i < myArray.length; i++) {
            if ( myArray[i]== value) {
                return true;
            }
        }
        return jetHere;
    }

}
