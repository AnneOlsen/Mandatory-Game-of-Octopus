import java.util.Random;
import java.util.Scanner;

public class Octopus extends Animal {

    // det er en god ide at instantiere random før metoden. Når den ligger i metoden, bliver den instantieret antal gange metoden bliver kaldt.
    // ved at ligge den her, bliver den kun instantieret 1 gang.
    // Helt det samme er gældende for min og max
    // Vi laver det final, fordi der ikke skal ændres på nedenstående

    private static final Random random = new Random();
    private static final int min = 1;
    private static final int max = 10;

    private static final GameOfOctopus gameThread = new GameOfOctopus();

    public void makeADoActivity() {
        // create an infinite loop that calls select activity and prints it out
        // call it from main
        // man kan lave uendeligt loops ved at skrive "for(;;){sout(noget)}
        // man kan ogsp lave et while loop og skrive true i condition

        while (true) {
            // make Otte do 1 activity per second
            // nedenstående Thread.sleep kræver en exception og hvis den sættes i metode signaturen så skal den også sættes på main metoden
            // Ved at lave en try catch håndtere man exceptionen med det samme i metoden, og man skal ikke have en exeption i main metoden
            try {
                String activity = selectActivity();
                System.out.println(activity);
                if (activity.equals("Mate")) {
                    GameOfOctopus gameThread = new GameOfOctopus();
                    gameThread.start();
                }
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    //implement a custom move method that returns the string "Swich Swosh"

    @Override
    public String move() {
        return "Swich Swosh";
    }

    // implement an activity method that when given a number from 1 - 6
    // returns a string of an activity that is does
    // you can make is repeat certain activities that is does more frequently
    // Make activitynumber a random number from 1-10

    private String selectActivity() {
        String activity = " ";

        int activitynumber = random.nextInt(max) + min;

        switch (activitynumber) {
            case 1:
                // i stedet for "activity" kan man også bare skrive return. men så kan man kke lave 2 cases i 1.
                activity = "sleep";
                break;

            case 2:
                activity = "Mate";
                break;

            case 3:
                activity = "Jet ink";
                break;
            case 4, 5:
                activity = "Eat";
                break;
            case 6:
                activity = "bevæger armene";
                break;

            default:
                activity = move();
        }
        return activity;

    }


    // new fetures 

    public String livingHabitat() {
        String habitat = " ";

        int habitatnumber = random.nextInt(max) + min;

        switch (habitatnumber) {
            case 1:
                habitat = "I live in crevices";
                break;

            case 2:
                habitat = "I live in rocks";
                break;

            case 3, 4:
                habitat = "I live in corals";
                break;
            case 5:
                habitat = "I live in shells";
                break;

            default:
                habitat = "I am homeless :'(";
        }
        return habitat;
    }


    public String showLivingHabitat() {

        while (true) {

            try {
                String habitat = livingHabitat();
                System.out.println(habitat);
                if (habitat.equals("I live in corals")) {
                    GameOfOctopus gT = new GameOfOctopus();
                    gT.start();
                }
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    @Override
    public String habitat(){
        return "I love my home, but not when i'm homeless";
    }
}

