public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); //by default public and abstract.
    
}

class Queen implements ChessPlayer {
    public void moves() { //if we will not make it public so it will automatically be a default visibility.      
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {     
        System.out.println("up, down,left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {    
        System.out.println("up, down,left, right, diagonal - (by 1 step)");
    }
}

// Output-
// up, down, left, right, diagonal (in all 4 directions)