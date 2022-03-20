package Main;

import Vista.I_Vista_Principal;
import com.google.gson.Gson;

public class Main {
   
    public static void main(String args[]) 
    {
        I_Vista_Principal Interfaz = I_Vista_Principal.GetInstance();
        Interfaz.setVisible(true);
    }
}


