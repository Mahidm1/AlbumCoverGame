import java.util.ArrayList;
import java.util.Random;

public class AlbumCoverGame {
    private LineUp solution;
    public LinkedList list;

    // this is the constructors
    public AlbumCoverGame(LineUp lineup){
        this.solution = lineup;
        this.list = new LinkedList();
    }
    
    public AlbumCoverGame (){
    char[] rsolution = new char[6];
    ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        letters.add('E');
        letters.add('F');
        letters.add('G');
        letters.add('H');
        letters.add('I');
            int limit = 8;
            for (int i = 0; i < 6; i++) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(limit);
            rsolution[i] = letters.get(rand_int1);
            letters.remove(rand_int1);
            limit --;
            this.solution = new LineUp(rsolution);
        }
    }
    
    
    // this method is used to test draft cover
    public boolean testDraftCover(LineUp lineup){
        DraftCover cover = new DraftCover(lineup, this.solution);
        if (list.head == null){
            list.head = new Node(cover);
            list.head.previous = null;
        } else {
            Node temp = list.head;
            list.head = new Node(cover);
            list.head.previous = temp;
        }
        return list.head.data.isCorrect();
    }


    // this gets solution LineUp
    public LineUp getSolution(){
        return this.solution;
    }
    
    // this receives all the previous attempts
    public String getPreviousDraftCovers(){
        return list.head == null ? null : list.toString();
    }
}
