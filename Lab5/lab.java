import java.io.*;
import java.util.LinkedList;
import java.util.Collections;

public class lab
{

    public static void main(String[] args) 
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        String readFileName = args[0];
        File readFile = new File("~/Projects/EDAA35/Lab5/" + readFileName);
        String writeFileName = args[1];
        File writeFile = new File("~/Projects/EDAA35/Lab5/" + writeFileName);
        int N = Integer.parseInt(args[2]);

        if (!writeFile.createNewFile()) {
            System.out.println("Couldn't create file! (FileName already exists)");
        }

        BufferedReader br = new BufferedReader(new FileReader(readFile));
        String currRow;

        while((currRow = br.readLine()) != null) 
        {
            numbers.add(Integer.parseInt(currRow));
        }

        br.close();

        FileWriter fr = new FileWriter(writeFile);
        fr.write("N = " + N);

        for (int n = 0; n <= N; n++) 
        {
            LinkedList<Integer> newCopiedList = (LinkedList<Integer>) numbers.clone();

            long startTime = System.currentTimeMillis();
            Collections.sort(newCopiedList);
            long stopTime = System.currentTimeMillis();

            long time = stopTime - startTime;
            fr.write("Time measurement " + n + ": " + time);
        }

        fr.close();

    }
}