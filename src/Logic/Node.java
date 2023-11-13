package Logic;

import java.util.ArrayList;
import java.util.List;


public class Node {
    private String key;
    private Node right;
    private Node left;
    private Node parent;
    private boolean red;
    private List<String> value = new ArrayList<String>();

    public Node(String key, String value, String descId, String descEn) {
        this.key = key.toLowerCase();
        this.value.add(value);
        this.value.add(descEn);
        this.value.add(descId);
        
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setValue(List<String> newValue) {
        this.value = new ArrayList<>(newValue);
    }

    public List<String> getValue() {
        return value;
    }


    public String getGimmick() {
        if (key.compareTo("clock") == 0 || key.compareTo("jam") == 0) {
            return "date";
        }
        if (key.compareTo("penghapus") == 0 || key.compareTo("eraser") == 0) {
            return "erase";
        }
        if (key.compareTo("foto") == 0 || key.compareTo("picture") == 0) {
            return "popup";
        }
        if (key.compareTo("peta") == 0 || key.compareTo("map") == 0) {
            return "link";
        }
        
        
        return "none";
    }
}
