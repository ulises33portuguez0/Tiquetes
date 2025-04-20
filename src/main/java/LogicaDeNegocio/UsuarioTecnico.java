/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

public class UsuarioTecnico extends Usuario{
    private String rol;
    
    public UsuarioTecnico(String codigo, String nombre, String apellido1, String apellido2, String correoElectronico, String telefono, String password, String rol){
        super(codigo, nombre, apellido1, apellido2, correoElectronico, telefono, password);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Rol= " + rol + " ";
    }
}
