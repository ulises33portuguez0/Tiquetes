/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

/**
 *
 * @author ulise
 */
public class UsuarioCreador extends Usuario{
    private String departamento;

    public UsuarioCreador(String codigo, String nombre, String apellido1, String apellido2, String correoElectronico, String telefono, String password, String departamento) {
        super(codigo, nombre, apellido1, apellido2, correoElectronico, telefono, password);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento=" + departamento + " ";
    }
}
