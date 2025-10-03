package Modelisation;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileItem {
    private List<FileItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name, 0);
    }

    public void add(FileItem item) {
        items.add(item);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileItem item : items) {
            total += item.getSize();
        }
        return total;
    }

    @Override
    public void list(String indent) {
        System.out.println(indent + "[DIR] " + this.getClass().getSimpleName());
        for (FileItem item : items) {
            item.list(indent + "  ");
        }
    }
}
