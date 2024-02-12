// node class
class Node{
DraftCover data;
Node previous;
Node(DraftCover data){
    this.data = data;
    }

}


// set a class called LinkedList
public class LinkedList {
    Node head;
    String output;
    int index;

    // this is the constructor
    public LinkedList(){
        this.head = null;
        this.output = "";
        this.index = 0;
    }

    
    // this prints all the previous attempts
    @Override
    public String toString(){
        Node start = head;
        while (start != null){
            this.output += start.data + "\n";
            start = start.previous;
        }
        return output;
    }
}
