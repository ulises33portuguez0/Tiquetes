/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;
import java.time.LocalDate;

/**
 *
 * @author ulise
 */
public class Incidente extends Tiquete{
    private LocalDate fechaSolucion;
    private String descripcionSolucion;

    public Incidente(String codigo, String descripcion, UsuarioCreador usuarioCreador) {
        super(codigo, descripcion, usuarioCreador);
    }

    public LocalDate getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(LocalDate fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
    }

    public String getDescripcionSolucion() {
        return descripcionSolucion;
    }

    public void setDescripcionSolucion(String descripcionSolucion) {
        this.descripcionSolucion = descripcionSolucion;
    }

    @Override
    public String toString() {
        return super.toString() +
               (fechaSolucion != null ? "\nFecha Solución: " + fechaSolucion : "") +
               (descripcionSolucion != null ? "\nDescripción Solución: " + descripcionSolucion : "");
    }
}
