package inputoutputstrem;

import java.io.*;

public class BufferDemo {
        public static void main(String[] args) {
            try{
                FileInputStream f1 = new FileInputStream("C:\\Users\\Sufiyan\\IdeaProjects\\IOStream\\src\\inputoutputstrem\\input.txt");
                FileOutputStream f = new FileOutputStream("C:\\Users\\Sufiyan\\IdeaProjects\\IOStream\\src\\inputoutputstrem\\output.txt");
                BufferedOutputStream bout = new BufferedOutputStream(f);
                BufferedInputStream bin = new BufferedInputStream(f1);

                String s = "Ghost of the uchiha";
                byte b[] = s.getBytes();
                bout.write(b);
                int i = 0;
                while((i = f1.read()) != -1){
                    System.out.print((char)i);

                }
                bout.flush();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

