public class GameOfOctopus extends Thread {
    // make main instantiate the game from here an allow for a new thread to create an octopus
    // en tråd betyder at man kan lave flere ting på 1 gang. Main er en tråd der hedder "mainthread"
    // det er run metoden der gør at man kan skabe en ny tård. For hver gang den bruges, skabes en ny tråd


    //@Override
    //public void run() {
      //  Octopus otto = new Octopus();
        //otto.makeADoActivity();
    //}

    // New fetures

    @Override
    public void run(){
        Octopus otto = new Octopus();
        otto.showLivingHabitat();
    }

}
