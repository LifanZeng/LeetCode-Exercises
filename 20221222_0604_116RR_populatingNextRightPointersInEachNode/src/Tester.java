public class Tester {
    public static void main(String[] args){
        Node root = new Node(1, new Node(2, new Node(4), new Node(5), null),
                new Node(3, new Node(6), new Node(7), null), null);
        Solution solution = new Solution();
        solution.connect(root);

        Node tmp = root; //print 1st layer
        while(true){
            System.out.print(tmp.val + ", ");
            if(tmp.next != null){
                tmp = tmp.next;
            }
            else{
                System.out.print("#" + ", ");
                break;
            }
        }

        tmp = root.left; //print 2nd layer
        while(true){
            System.out.print(tmp.val + ", ");
            if(tmp.next != null){
                tmp = tmp.next;
            }
            else{
                System.out.print("#" + ", ");
                break;
            }
        }

        tmp = root.left.left; //print 3rd layer
        while(true){
            System.out.print(tmp.val + ", ");
            if(tmp.next != null){
                tmp = tmp.next;
            }
            else{
                System.out.print("#" + ", ");
                break;
            }
        }
    }
}
