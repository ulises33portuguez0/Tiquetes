/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Control;
import LogicaDeNegocio.UsuarioCreador;
import java.util.ArrayList;
/**
 *
 * @author ulise
 * Los usuarios creadores solo pueden crear tiquetes y consultar tiquetes. 
Los usuarios técnicos pueden consultar tiquetes y modificar los mismos, 
incluyendo su estado.
* https://github.com/ulises33portuguez0/Tiquetes.git
 */
public class Control {

    public static void main(String[] args) {
        ArrayList<UsuarioCreador> usuarios = new ArrayList<>();

        UsuarioCreador u1 = new UsuarioCreador("001", "Ana", "Perez", "Lopez",
                "ana@example.com", "12345678", "Ana123*", "Finanzas");

        UsuarioCreador u2 = new UsuarioCreador("002", "Luis", "Garcia", "Martinez",
                "luis@example.com", "87654321", "Luis456*", "Recursos Humanos");

        UsuarioCreador u3 = new UsuarioCreador("001", "Ana", "Perez", "Lopez",
                "ana@example.com", "12345678", "Ana123*", "Finanzas"); 

        usuarios.add(u1);
        usuarios.add(u2);

        // Ahora intentamos agregar u3 solo si no existe aún
        if (!usuarios.contains(u3)) {
            usuarios.add(u3);
        } else {
            System.out.println("El usuario con código " + u3.getCodigo() + " ya existe y no será agregado.");
        }

        // Mostrar todos los usuarios
        for (UsuarioCreador usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
