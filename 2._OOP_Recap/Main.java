import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {

        Octopus otto = new Octopus();
        //System.out.println(otto.move());
        //System.out.println(otto.selectActivity());
        //otto.makeADoActivity();

        // for at køre tråden skal man skrive nedenstående
        //GameOfOctopus game = new GameOfOctopus();
        //game.start(); laver en ny tråd
        //game.run(); kalder på run i main tråden men laber ikke en tråd
        //game.start();



        // Nye fetures

        GameOfOctopus game = new GameOfOctopus();

        System.out.println(otto.livingHabitat());
       // game.start();
        System.out.println(otto.habitat());

    }
}
