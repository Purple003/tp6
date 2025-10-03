package Modelisation;

public class FileItem {
    private String name;
    private int size;

    public FileItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void list(String indent) {
        System.out.println(indent + name + " (" + size + " B)");
    }
}
