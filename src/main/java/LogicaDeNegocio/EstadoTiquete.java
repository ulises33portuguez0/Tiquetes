/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

public enum EstadoTiquete {
    CREADO,
    ASIGNADO,
    EN_PROGRESO,
    RESUELTO,
    CANCELADO;
    
    @Override
    public String toString(){
        switch (this){
            case CREADO:
                return "Creado";
            case ASIGNADO:
                return "Asignado";
            case EN_PROGRESO:
                return "En progreso";
            case RESUELTO:
                return "Resuelto";
            case CANCELADO:
                return "Cancelado";
        }
    }                
}
