/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

public abstract class Tiquete {
    protected EstadoTiquete estado;
    protected String codigo;
    protected String descripcion;
    protected UsuarioCreador usuarioCreador;
    protected UsuarioTecnico usuarioTecnicoAsignado;
    
    
    public Tiquete(String codigo, String descripcion, UsuarioCreador usuarioCreador) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.usuarioCreador = usuarioCreador;
        this.estado = EstadoTiquete.CREADO;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public UsuarioCreador getUsuarioCreador() {
        return usuarioCreador;
    }

    public UsuarioTecnico getUsuarioTecnicoAsignado() {
        return usuarioTecnicoAsignado;
    }

    public EstadoTiquete getEstado() {
        return estado;
    }

    public void setUsuarioTecnicoAsignado(UsuarioTecnico usuarioTecnicoAsignado) {
        this.usuarioTecnicoAsignado = usuarioTecnicoAsignado;
    }

    public void setEstado(EstadoTiquete estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
               "\nDescripción: " + descripcion +
               "\nUsuario Creador: " + usuarioCreador.getNombre() +
               "\nEstado: " + estado.toString() +
               (usuarioTecnicoAsignado != null ? "\nUsuario Técnico: " + usuarioTecnicoAsignado.getNombre() : "");
    }
}
