public interface Movement {

    // create a move method

    default String move() {
        return "Swiggity Swoggity";
    }

    // new feture
    default String habitat(){
        return "I love my habitat";
    }
}
