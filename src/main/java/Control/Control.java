/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Control;

import AccesoADatos.ServicioTiquete;
import LogicaDeNegocio.UsuarioCreador;
import java.util.ArrayList;
import AccesoDatos.ServicioTiquete;
import LogicaDeNegocio.Tiquete;
import LogicaDeNegocio.EstadoTiquete;
import Excepciones.GlobalException;
import Excepciones.NoDataException;
import java.util.List;
import presentacion.*;

/**
 *
 * @author ulise Los usuarios creadores solo pueden crear tiquetes y consultar
 * tiquetes. Los usuarios técnicos pueden consultar tiquetes y modificar los
 * mismos, incluyendo su estado.
 * https://github.com/ulises33portuguez0/Tiquetes.git
 */
public class Control {

    public static void main(String[] args) {
        VistaTiquete vista = new VistaTiquete();
        vista.mostrarMenu();
    }
    

  
}
