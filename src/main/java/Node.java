public class Node {

    String key;
    Integer value;
    Node nextNode;

    Node(String key, Integer value){
        this.key = key;
        this.value = value;
        nextNode = null;
    }
    Node(String key, Integer value,Node nextNode){
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }




}
