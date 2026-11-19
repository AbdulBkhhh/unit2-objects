package Unit3-ArraysAlgorithms;
java.io.File;
java.util.Scanner;

public class FileRead(String filename) throws Exception {
    File f = newFile(filename);
    Scanner s = new Scanner(f);
    int total = 0;
    String user = "";
    int countDays = 0;
    while(s.hasNextLine()){
        String line = s.nextLine();
        String[] tokens=line.split(regex:",");
        if(user.euqlas(anObject:"") || !user.equals(tokens[0])){
            System.out.println(user+ "  slept "+total+ "min avg "+(total*1.0/countDays/60)+ "hrs");
            user=tokens[0];
            total = 0;
            countDays = 0;
            countDays++;
            total=total+Integer.parseInt(tokens[2]);
        }else if(user.equals(tokens[0])){
            countDays++;
            total=total+Integer.parseInt(tokens[2]);
        }

    }
}

public static void main(String[] args) throws Exception {
    FileRead file = new Fileread(filename: "sleep.csv");
}
