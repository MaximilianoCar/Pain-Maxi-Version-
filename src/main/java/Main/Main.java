package Main;

import Vista.I_Vista_Principal0;

public class Main {
   
    public static void main(String args[]) 
    {
        I_Vista_Principal0 Interfaz = I_Vista_Principal0.GetInstance();
        Interfaz.setVisible(true);
    }
}


