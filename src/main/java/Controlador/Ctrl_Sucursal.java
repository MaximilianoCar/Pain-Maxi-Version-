package Controlador;

import Modelo.Medico;
import Modelo.Sucursal;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ctrl_Sucursal {

    // Lee en el Json la lista de Sucursales que tiene
    public static List<Sucursal> getListaSucursales() {
        List<Sucursal> sucursales = new ArrayList<>();
        try {

            Scanner file = new Scanner(new FileReader("formato.json"));
            StringBuilder sb = new StringBuilder();

            while (file.hasNext()) {
                sb.append(file.next());
            }
            file.close();

            String rjson = sb.toString();
            Type SucursalType = new TypeToken<List<Sucursal>>() {
            }.getType();
            sucursales = new Gson().fromJson(rjson, SucursalType);

            return sucursales;
        } catch (JsonSyntaxException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return sucursales;
    }

    // Guarda al Json la Lista de Sucursales
    public static void saveListaSucursales(List<Sucursal> sucursales) {
        String json = new Gson().toJson(sucursales);
        try {
            FileWriter file = new FileWriter("formato.json");
            file.write(json);
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Validar que el nombre de la Sucursal Exista en el Sistema
    public static int buscarSucursal(String nombre, List<Sucursal> sucursales) {
        
        if (sucursales != null) {
            for (int i = 0; i < sucursales.size(); i++) {
                if (sucursales.get(i).getNombre().equals(nombre)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Genera el ID del medico
    public static String generarIDMedico() {
        char[] Arr = new char[8];
        Arr[0] = 'M';
        for (int i = 1; i < 8; i++) {
            int n = (int) (Math.random() * 9);
            char c = (char) (n + '0');
            Arr[i] = c;
        }

        String IDMedico = String.valueOf(Arr);
        JOptionPane.showMessageDialog(null, "El ID del médico es: " + IDMedico);
        return IDMedico;
    }

    // Registra el Medico al Sistema
    public static void RegistrarMedico(String id,
            String especialidad,
            String nombre,
            String apellido,
            String CI,
            String sexo,
            String Fecha_De_Nacimiento,
            String Lugar_De_Nacimiento,
            String Estado_Civil,
            String Direccion_De_HAbitacion,
            String telefono,
            List<Medico> medicos) {
        Medico NuevoMedico = new Medico(id,
                especialidad,
                nombre,
                apellido,
                CI,
                sexo,
                Fecha_De_Nacimiento,
                Lugar_De_Nacimiento,
                Estado_Civil,
                Direccion_De_HAbitacion,
                telefono);

        medicos.add(NuevoMedico);
    }

    // Añade Nueva Sucursal
    public static void AñadirSucursal(String nombre, String direccion, List<Sucursal> sucursales) {
        Sucursal NuevaSucursal = new Sucursal(nombre, direccion);
        sucursales.add(NuevaSucursal);
    }

}
