/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;
import Control.Control;
import LogicaDeNegocio.*;
import .GlobalException;
import .NoDataException;
import javax.swing.JOptionPane;
import java.util.List;

public class VistaTiquete {
    private Tiquete tiquete;

    public VistaTiquete() {
        tiquete = new Tiquete();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "=== MENÚ SISTEMA DE TIQUETES ===\n" +
                "1. Crear Tiquete\n" +
                "2. Listar Tiquetes\n" +
                "3. Cambiar Estado de Tiquete\n" +
                "4. Buscar Tiquete por Código\n" +
                "0. Salir\n" +
                "Seleccione una opción:"
            ));

            switch (opcion) {
                case 1:
                    crearTiquete();
                    break;
                case 2:
                    listarTiquetes();
                    break;
                case 3:
                    cambiarEstadoTiquete();
                    break;
                case 4:
                    buscarTiquete();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "¡Saliendo del sistema!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 0);
    }

    private void crearTiquete() {
        try {
            String codigo = JOptionPane.showInputDialog("Ingrese el código del tiquete:");
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción:");
            String tipo = JOptionPane.showInputDialog("Ingrese el tipo (Incidente, SolicitudCambio, SolicitudServicio):");

            UsuarioCreador creador = new UsuarioCreador("C1", "Usuario", "Apellido1", "Apellido2", "correo@correo.com", "12345678", "password", "IT"); 
            UsuarioTecnico tecnico = new UsuarioTecnico("T1", "Tecnico", "Apellido1", "Apellido2", "tecnico@correo.com", "87654321", "password", "Soporte"); 

            Tiquete tiquete = null;

            switch (tipo.toLowerCase()) {
                case "incidente":
                    tiquete = new Incidente(codigo, descripcion, creador, tecnico);
                    break;
                case "solicitudcambio":
                    String fechaRequerida = JOptionPane.showInputDialog("Ingrese la fecha requerida para el cambio (YYYY-MM-DD):");
                    tiquete = new SolicitudCambio(codigo, descripcion, creador, tecnico, fechaRequerida, "Pasos para ejecutar");
                    break;
                case "solicitudservicio":
                    String justificacion = JOptionPane.showInputDialog("Ingrese la justificación del servicio:");
                    int prioridad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la prioridad (1 a 4):"));
                    tiquete = new SolicitudServicio(codigo, descripcion, creador, tecnico, justificacion, prioridad);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de tiquete inválido.");
                    return;
            }

            controlador.crearTiquete(tiquete);
            JOptionPane.showMessageDialog(null, "Tiquete creado correctamente.");
        } catch (GlobalException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el tiquete: " + e.getMessage());
        }
    }

    private void listarTiquetes() {
        try {
            List<Tiquete> tiquetes = controlador.listarTiquetes();
            if (tiquetes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay tiquetes registrados.");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Tiquete t : tiquetes) {
                    sb.append(t.toString()).append("\n\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        } catch (NoDataException e) {
            JOptionPane.showMessageDialog(null, "Error al listar tiquetes: " + e.getMessage());
        }
    }

    private void cambiarEstadoTiquete() {
        try {
            String codigo = JOptionPane.showInputDialog("Ingrese el código del tiquete:");
            String nuevoEstadoStr = JOptionPane.showInputDialog(
                "Ingrese el nuevo estado:\n" +
                "CREADO\n" +
                "ASIGNADO\n" +
                "EN_PROGRESO\n" +
                "RESUELTO\n" +
                "CANCELADO"
            );

            EstadoTiquete nuevoEstado = EstadoTiquete.valueOf(nuevoEstadoStr.toUpperCase());
            controlador.cambiarEstadoTiquete(codigo, nuevoEstado);
            JOptionPane.showMessageDialog(null, "Estado del tiquete actualizado correctamente.");
        } catch (NoDataException | GlobalException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar estado: " + e.getMessage());
        }
    }

    private void buscarTiquete() {
        try {
            String codigo = JOptionPane.showInputDialog("Ingrese el código del tiquete:");
            Tiquete tiquete = controlador.buscarTiquete(codigo);
            JOptionPane.showMessageDialog(null, tiquete.toString());
        } catch (NoDataException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar tiquete: " + e.getMessage());
        }
    }
}
