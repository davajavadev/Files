import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directory = new File("C:/Users/Asus/Desktop/kurs ishi");
        if(directory.exists() && directory.isDirectory()){

            File[] files = directory.listFiles();

            for (File file : files){
                System.out.println("Name " + file.getName());

                System.out.println("Length " + file.length());

                if (file.isDirectory()){
                    System.out.println("Directory affiliation: Yes");
                }
                else {
                    System.out.println("Directory affiliation: NO");
                }
                System.out.println();
            }

        }else
        {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }
}
