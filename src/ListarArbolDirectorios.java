import java.io.File;
 
public class ListarArbolDirectorios {
    public static void main(String[] args) {
        walkin(new File("C:/Users/Juan Pablo Abad/SO")); //Replace this with a suitable directory
    }
 
    public static void walkin(File dir) {
 
        File listFile[] = dir.listFiles();
        if (listFile != null) {
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                    walkin(listFile[i]);
                } else {
                    System.out.println(listFile[i].getPath());
                }
            }
        }
    }
}
