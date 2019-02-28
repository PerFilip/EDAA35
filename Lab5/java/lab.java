import java.io.*;
import java.util.LinkedList;
import java.util.Collections;
import java.io.IOException;

public class lab
{

    public static void main(String[] args) 
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        String readFileName = args[0];
        File readFile = new File(readFileName + ".txt");
        String writeFileName = args[1];
        File writeFile = new File(writeFileName + ".txt");
        int N = Integer.parseInt(args[2]);
        BufferedReader br;
        FileWriter fr;

        try {
            if (!writeFile.createNewFile()) {
                System.out.println("Couldn't create file! (FileName already exists)");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            br = new BufferedReader(new FileReader(readFile));
            String currRow = br.readLine();

            while(currRow != null) 
                {
                    numbers.add(Integer.parseInt(currRow));
                    currRow = br.readLine();
                }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fr = new FileWriter(writeFile);
            fr.write("N = " + N + System.lineSeparator());

            for (int n = 0; n <= N; n++) 
            {
                LinkedList<Integer> newCopiedList = (LinkedList<Integer>) numbers.clone();

                long startTime = System.nanoTime();
                Collections.sort(newCopiedList);
                long stopTime = System.nanoTime();

                long time = stopTime - startTime;
                fr.write(n + ", " + time + System.lineSeparator());
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}