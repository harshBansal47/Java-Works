public class LnkLst_BehindCode {
    public static void main(String[] args) {
        
    }
}

class Ll{
     public Ll(){

     }

    class Node{
        Data data;
        Node next;
        Node(Data data){
            this.next = null;
            this.data = data;
        }
    }

    public void addFirst(Data data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode ; 
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(Data data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode ; 
            return;
        }
        Node currNode = head;
        
        while(){

        }
    }

}