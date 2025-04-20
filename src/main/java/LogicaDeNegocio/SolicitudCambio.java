/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;



public class SolicitudCambio extends Tiquete{
    private LocalDate fechaRequerida;
    private LocalDate fechaEjecucion;
    private List<String> pasosRequeridos;

    public SolicitudCambio(String codigo, String descripcion, UsuarioCreador usuarioCreador, LocalDate fechaRequerida) {
        super(codigo, descripcion, usuarioCreador);
        this.fechaRequerida = fechaRequerida;
        this.pasosRequeridos = new ArrayList<>();
    }

    public LocalDate getFechaRequerida() {
        return fechaRequerida;
    }

    public void setFechaEjecucion(LocalDate fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }

    public LocalDate getFechaEjecucion() {
        return fechaEjecucion;
    }

    public List<String> getPasosRequeridos() {
        return pasosRequeridos;
    }

    public void agregarPaso(String paso) {
        pasosRequeridos.add(paso);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nFecha Requerida: " + fechaRequerida +
               (fechaEjecucion != null ? "\nFecha Ejecución: " + fechaEjecucion : "") +
               "\nPasos Requeridos: " + pasosRequeridos;
    }
}
