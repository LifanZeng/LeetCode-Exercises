import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size){
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size + " has been created.");
    }

    //is Full?
    public boolean isFull(){
        if(arr.length - 1 == lastUsedIndex){
            return true;
        }
        else{
            return false;
        }
    }

    //Insert method
    public void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted.");
        }
        else{
            System.out.println("The BT is full.");
        }
    }

    //preOrder Traversal
    public void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    //inOrder Traversal
    public void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    //postOrder Traversal
    public void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    //levelOrder Traversal
    public void levelOrder(int index){
        for(int i=1; i<=lastUsedIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //Search a value
    public int search(String value){
        for(int i=1; i<=lastUsedIndex; i++){
            if(arr[i] == value){
                System.out.print(value + " exists at the location: " + i);
                return i;
            }
        }
        System.out.print("The node is NOT found in the Tree.");
        return -1;
    }
}
