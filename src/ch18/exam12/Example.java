package ch18.exam12;

import java.io.IOException;
import java.io.OutputStream;

public class Example {

   public static void main(String[] args) {
      
      try {
         OutputStream os = System.out;
         os.write(65);
         os.write(new byte[] {66,67,68});
         os.write(new byte[] {69,70,71}, 0, 2);
         os.flush();
         os.close();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}