/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import LogicaDeNegocio.Tiquete;
import LogicaDeNegocio.EstadoTiquete;
import .GlobalException;
import .NoDataException;

import java.util.ArrayList;
import java.util.List;

public class ServicioTiquete {
    private List<Tiquete> tiquetes;

    public ServicioTiquete() {
        this.tiquetes = new ArrayList<>();
    }

    public void agregarTiquete(Tiquete tiquete) throws GlobalException {
        if (tiquete == null) {
            throw new GlobalException("No se puede agregar un tiquete nulo.");
        }
        tiquetes.add(tiquete);
    }

    public Tiquete buscarTiquetePorCodigo(String codigo) throws NoDataException {
        for (Tiquete t : tiquetes) {
            if (t.getCodigo().equalsIgnoreCase(codigo)) {
                return t;
            }
        }
        throw new NoDataException("No se encontró un tiquete con el código: " + codigo);
    }

    public List<Tiquete> listarTiquetes() throws NoDataException {
        if (tiquetes.isEmpty()) {
            throw new NoDataException("No hay tiquetes registrados.");
        }
        return tiquetes;
    }

    public void cambiarEstadoTiquete(String codigo, EstadoTiquete nuevoEstado) throws NoDataException, GlobalException {
        Tiquete tiquete = buscarTiquetePorCodigo(codigo);
        if (tiquete.getEstado() == EstadoTiquete.RESUELTO || tiquete.getEstado() == EstadoTiquete.CANCELADO) {
            throw new GlobalException("No se puede cambiar el estado de un tiquete que ya fue resuelto o cancelado.");
        }
        tiquete.setEstado(nuevoEstado);
    }
}
