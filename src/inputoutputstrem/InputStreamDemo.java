package inputoutputstrem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
        public static void main(String[] args) throws FileNotFoundException {
            try {
                FileInputStream f = new FileInputStream("C:\\Users\\Sufiyan\\IdeaProjects\\IOStream\\src\\inputoutputstrem\\input.txt");
                int i = 0;
                while((i = f.read()) != -1){
                    System.out.print((char)i);

                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


