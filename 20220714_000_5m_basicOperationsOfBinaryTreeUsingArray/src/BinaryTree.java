public class BinaryTree {
    private String[] arr;
    private int lastUsedIndex;

    public BinaryTree(int size){
        arr = new String[size+1];
        lastUsedIndex = 0;
        System.out.println("Blank tree of size "+size+" has been created.");
    }

    //To check whether the array arr is full
    public boolean isFull(){
        if(arr.length - 1 == lastUsedIndex){
            return true;
        }
        else{
            return false;
        }
    }

    //Insert an element
    public void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("Insert " + value + " successfully.");
        }
        else{
            System.out.println("The BT is full.");
        }
    }

    //preOrder traversal
    public void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);;
    }

    //inOrder traversal
    public void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);;
    }

    //postOrder traversal
    public void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    //levelOrder traversal
    public void levelOrder(int index){
        for(int i=1; i<= lastUsedIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //Search a value
    public int search(String value){
        for(int i=1; i<= lastUsedIndex; i++){
            if(arr[i] == value){
                System.out.println("The value " + value + " is found at position: " + i);
                return i;
            }

        }
        System.out.println("The value "+ value+ " is NOT found in the BT.");
        return -1;
    }

    //Delete a node
    public void delete(int index, String value){
        for(int i=1; i<=lastUsedIndex; i++){
            if(arr[i] == value){
                arr[i] = arr[lastUsedIndex];
                arr[lastUsedIndex] = null;
                lastUsedIndex--;
                System.out.println(value + " is deleted successfully.");
                return;
            }
        }
        System.out.print(value + " is NOT found in the Tree.");
    }

    //Delete binary tree
    public void deleteBT(int index){
        for(int i=lastUsedIndex; i>=1; i--){
            arr[lastUsedIndex] = null;
            lastUsedIndex--;
        }
        System.out.println("The tree has deleted successfully.");
    }
}
