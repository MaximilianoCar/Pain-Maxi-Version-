
import Vista.I_Vista_Principal;
//import com.google.code.gson;
import com.google.gson.Gson;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maximiliano
 */
public class MainClass {
    
    public static void main(String[] args)
    {
        I_Vista_Principal Interfaz = I_Vista_Principal.GetInstance();
        Interfaz.setVisible(true);
        
        Gson gson = new Gson();
    }
    
}
