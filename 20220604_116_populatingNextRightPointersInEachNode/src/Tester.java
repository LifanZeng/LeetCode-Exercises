public class Tester {
    public static void main(String[] args){
        Node node6 = new Node(6);
        Node root = new Node(1,
                new Node(2, new Node(4), new Node(5), node6),
                new Node(3, node6, new Node(7), null),
                null);


        Solution solution = new Solution();
        solution.connect(root);

        Node tmp = root;
        while(true){
            System.out.println(tmp.val);
            if(tmp.next != null) {
                tmp = tmp.next;
            }
            else{
                System.out.println("#");
                break;
            }
        }

        tmp = root.left;
        while(true){
            System.out.println(tmp.val);
            if(tmp.next != null) {
                tmp = tmp.next;
            }
            else{
                System.out.println("#");
                break;
            }
        }

        tmp = root.left.left;
        while(true){
            System.out.println(tmp.val);
            if(tmp.next != null) {
                tmp = tmp.next;
            }
            else{
                System.out.println("#");
                break;
            }
        }

    }
}
