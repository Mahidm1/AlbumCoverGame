public class LineUp {
    private char[] characters;
    private String musicians;

    // this is a constructor
    public LineUp(char[] characters){
        this.characters = characters;
        this.musicians = "";
    }

    // assign a musician to their letters
    public char getMusician(int i){
        return characters[i];
    }
    // this method converts the musician to a string
    public String toString(){
        for (int i = 0; i <6; i++){
            if (i>4) {
                musicians += characters[i];
            }
            else {
                musicians += characters[i] + " ";
            }
        }
        return musicians;
    }
}
