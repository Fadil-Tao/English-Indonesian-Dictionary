package Logic;
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

       tree.add("Apple", "Apel");
       tree.add("Biscuits" , "kue");
       tree.add("Data" , "data");
       tree.add("Nigeria", "Nigeria");
       tree.add("Smart", "Pintar");
       tree.add("world", "Dunia");
       tree.add("Black", "Ireng");
       tree.add("Brown", "coklat");
       tree.add("Back", "kembali");
       tree.add("Table" , "meja");
       tree.add("Mouse" , "tikus");
       tree.add("come" , "datang");
       
    
       tree.inorderTraversal(tree.getRoot());
    }
}
