import java.util.ArrayList;
public class Bins extends DiceRoll{
    private static int resultBinStart;
    private static int resultBinEnd;

    public static void getBinSize(int start,int end){
        Bins.resultBinStart=start;
        Bins.resultBinEnd=end;
    }
    static ArrayList<Integer> list = DiceRoll.results();

    public static int bin(int binNumToStore){
        int incrementNum=0;
        for (int j = resultBinStart; j < resultBinEnd; j++) {

            for (Integer i : list) {
                if (i == 2 && j == 2 && binNumToStore == 2) {
                    incrementNum++;
                }
                if (i == 3 && j == 3 && binNumToStore ==3) {
                    incrementNum++;
                }
                if (i == 4 && j == 4 && binNumToStore ==4) {
                    incrementNum++;
                }
                if (i == 5 && j == 5 && binNumToStore ==5) {
                    incrementNum++;
                }
                if (i == 6 && j == 6 && binNumToStore ==6) {
                    incrementNum++;
                }
                if (i == 7 && j == 7 && binNumToStore ==7) {
                    incrementNum++;
                }
                if (i == 8 && j == 8 && binNumToStore ==8) {
                    incrementNum++;
                }
                if (i == 9 && j == 9 && binNumToStore ==9) {
                    incrementNum++;
                }
                if (i == 10 && j == 10 && binNumToStore ==10) {
                    incrementNum++;
                }
                if (i == 11 && j == 11 && binNumToStore ==11) {
                    incrementNum++;
                }
                if (i == 12 && j == 12 && binNumToStore ==12) {
                    incrementNum++;
                }
            }

        }
        System.out.println("there are "+incrementNum+ " "+ binNumToStore +"s");
        return incrementNum;
    }

    //Create a tracking class Bins that can be used to track these results.
    //make a couple unit tests for the Bins class.
    //Bins results = new Bins(2, 12); // for bins from 2..12
//Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//results.incrementBin(10); // should increment bin # 10


}
