package inputoutputstrem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {



        public static void main(String[] args) {
            try{
                FileOutputStream f = new FileOutputStream("C:\\Users\\Sufiyan\\IdeaProjects\\IOStream\\src\\inputoutputstrem\\output.txt");
                String s = "Hi my name is Sufiyan ";
                int i = 10;
                String s2 = "Welcome";
                byte b[] = s.getBytes();
                f.write(b);
                f.write("\n".getBytes());
                f.write(s2.getBytes());
                f.write(i);
                System.out.println("File added successfully :");
                f.close();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


