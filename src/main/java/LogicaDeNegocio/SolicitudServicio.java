/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;
import java.time.LocalDate;

public class SolicitudServicio extends Tiquete{
    private String justificacion;
    private int prioridad;
    private LocalDate fechaEjecucion;

    public SolicitudServicio(String codigo, String descripcion, UsuarioCreador usuarioCreador, String justificacion, int prioridad) {
        super(codigo, descripcion, usuarioCreador);
        this.justificacion = justificacion;
        this.prioridad = prioridad;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaEjecucion() {
        return fechaEjecucion;
    }

    public void setFechaEjecucion(LocalDate fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nJustificación: " + justificacion +
               "\nPrioridad: " + prioridad +
               (fechaEjecucion != null ? "\nFecha Ejecución: " + fechaEjecucion : "");
    }
}
