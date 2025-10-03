package Modelisation;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private List<FileItem> roots = new ArrayList<>();

    public void addRoot(FileItem item) {
        roots.add(item);
    }

    public void listAll() {
        for (FileItem item : roots) {
            item.list("");
        }
    }

    public int totalSize() {
        int total = 0;
        for (FileItem item : roots) {
            total += item.getSize();
        }
        return total;
    }
}
