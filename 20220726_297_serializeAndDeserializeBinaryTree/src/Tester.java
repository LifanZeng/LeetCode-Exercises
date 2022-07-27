public class Tester {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2),
                new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        Codec ser = new Codec();
        Codec deser = new Codec();
        ser.levelOrder(root);
        System.out.println();
        ser.preOrder(root);
        System.out.println();
        ser.inOrder(root);
        System.out.println();
        System.out.println(ser.serialize(root));

        TreeNode ans = deser.deserialize(ser.serialize(root));
        deser.levelOrder(ans);
        System.out.println();
        deser.preOrder(ans);
        System.out.println();
        deser.inOrder(ans);
        System.out.println();

        System.out.println(ser.serialize(ans));


    }
}
