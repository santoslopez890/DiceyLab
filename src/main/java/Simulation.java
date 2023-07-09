import java.util.ArrayList;
import java.util.Random;

public class Simulation {
    private static double numberOfTosses;
    private static int numberOfDies;





    private static final ArrayList<Integer> rollResults=new ArrayList<>();

    public static void getSimulationperams(int numberOfDies, int numberOfTosses) {
        Simulation.numberOfTosses = numberOfTosses;
        Simulation.numberOfDies =numberOfDies;
    }
//Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
//
//Create a simulation where two dies are thrown one million times. Keep track of all results.


    public static void runSimulation() {
        Random rd = new Random();
        int sumOfRoll = 0;
        int diceRoll;
        int max=6;
        int min=1;


        for (int i = 0; i < numberOfTosses; i++) {
            for (int j = 0; j < numberOfDies; j++) {
                diceRoll= rd.nextInt(max - min + 1) + min;
               sumOfRoll+=diceRoll;
            }
            rollResults.add(sumOfRoll);
            sumOfRoll=0;
        }

    }
   public static void printResults() {
        int twos = 0;
        int threes = 0;
        int fours=0;
        int fives=0;
        int sixes=0;
        int sevens=0;
        int eights=0;
        int nines=0;
        int tens=0;
        int elevens=0;
        int twelves=0;
       for (Integer i:rollResults){
           if(i==2){twos++;}
           if(i==3){threes++;}
           if(i==4){fours++;}
           if(i==5){fives++;}
           if(i==6){sixes++;}
           if(i==7){sevens++;}
           if(i==8){eights++;}
           if(i==9){nines++;}
           if(i==10){tens++;}
           if(i==11){elevens++;}
           if(i==12){twelves++;}
       }
       System.out.println("2  :    "+twos+": "+(twos/numberOfTosses)+" **\n"+
               "3  :    "+threes+": "+(threes/numberOfTosses)+ "***\n"+
               "4  :    "+fours+": "+(fours/numberOfTosses)+" ****\n"+
               "5  :    "+fives+": "+(fives/numberOfTosses)+" *****\n"+
               "6  :    "+sixes+": "+(sixes/numberOfTosses)+" ******\n"+
               "7  :    "+sevens+": "+(sevens/numberOfTosses)+" *******\n"+
               "8  :    "+eights+": "+(eights/numberOfTosses)+" ********\n"+
               "9  :    "+nines+": "+(nines/numberOfTosses)+" *********\n"+
               "10 :    "+tens+": "+(tens/numberOfTosses)+" **********\n"+
               "11 :    "+elevens+": "+(elevens/numberOfTosses)+" ************\n"+
               "12 :    "+twelves+": "+(twelves/numberOfTosses)+" ************\n"

       );


   }
}