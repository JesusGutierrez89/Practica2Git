package ejemplos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sesion {

    public boolean login(String user, String passw) {
        File documento = new File(".\\assets\\usuarios.txt");

        try (Scanner sc = new Scanner(documento)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                
                String[] campos = linea.split("#");
                
                if (campos[0].equalsIgnoreCase(user) && campos[1].equalsIgnoreCase(passw)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();  
        }

        return false;  
    }
}