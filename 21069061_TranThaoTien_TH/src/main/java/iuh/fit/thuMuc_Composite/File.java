package thuMuc_Composite;

public class File implements FileSystemComponent {
    private String name;
    private String data;

    public File(String name, String data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + ", Data: " + data);
    }
}