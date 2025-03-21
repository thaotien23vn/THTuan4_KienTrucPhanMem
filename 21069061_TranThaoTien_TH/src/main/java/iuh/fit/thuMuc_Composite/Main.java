package thuMuc_Composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt", "Hello World");
        FileSystemComponent file2 = new File("File2.txt", "Composite Pattern");

        Directory directory1 = new Directory("Directory1");
        directory1.addComponent(file1);

        Directory directory2 = new Directory("Directory2");
        directory2.addComponent(file2);
        directory2.addComponent(directory1);

        directory2.showDetails();
    }
}