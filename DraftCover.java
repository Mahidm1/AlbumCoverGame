public class DraftCover {
    private LineUp suggestion;
    private LineUp solution;

    // this is the constructor
    public DraftCover(LineUp suggestion, LineUp solution){
        this.suggestion = suggestion;
        this.solution = solution;
    }

    // this is an instance of LineUp, which returns suggestion
    public LineUp getLineUp(){
        return suggestion;
    }

    public int getNumGood(){
        int count = 0;
        for (int i = 0; i < 6; i++){
            // if they are at the same position, add a count
            if (suggestion.getMusician(i) == solution.getMusician(i)){
                count ++;
            }
        }
        return count;
    }
    
    public int getNumTooLeft(){
        // if it is too left add a count
        int count = 0;
        for (int i = 0; i < 5; i++){
        
            if (suggestion.getMusician(i) == solution.getMusician(i + 1)){
            count ++;
            }
        }
        return count;
    }
    
    public int getNumTooRight(){
        // if it is too right add a count
        int count = 0;
        for (int i = 1; i < 6; i++){
        
            if (suggestion.getMusician(i) == solution.getMusician(i - 1)){
            count ++;
            }
        }
        return count;
    }
    // this is a method to return string output
    public String toString(){
        return suggestion.toString() + " (Too left " + getNumTooLeft() + ", Good " + getNumGood() + ", Too right " + getNumTooRight() + ")";
    }

    // this is a method to return if every musician at the right place
    
    public boolean isCorrect(){
        int count = 0;
        for (int i = 0; i < 6; i++){
        
            if (suggestion.getMusician(i) == solution.getMusician(i)){
            count ++;
                }
            }
            if (count == 6){
        }
        return true;
    
    }
}
