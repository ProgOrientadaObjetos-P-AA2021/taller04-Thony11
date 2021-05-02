/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Lenovo
 */
public class PromedioEstudiante {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificacion;

    public PromedioEstudiante(String nom, double mate1, double mate2, double mate3) {
        nombreEstudiante = nom;
        calificacionMateria1 = mate1;
        calificacionMateria2 = mate2;
        calificacionMateria3 = mate3;
    }

    public void establecerNombreEstudiante(String nom) {
        nombreEstudiante = nom;
    }

    public void establecerCalificacionMateria1(double mate1) {
        calificacionMateria1 = mate1;
    }

    public void establecerCalificacionMateria2(double mate2) {
        calificacionMateria2 = mate2;
    }

    public void establecerCalificacionMateria3(double mate3) {
        calificacionMateria3 = mate3;
    }

    public void establecerPromedioCalificacion() {
        promedioCalificacion = (calificacionMateria1
                + calificacionMateria2 + calificacionMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedioCalificacion() {
        return promedioCalificacion;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos Estudiante\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion de la materia 1: %.2f\n"
                + "Calificacion de la materia 2: %.2f\n"
                + "Calificacion de la materia 3: %.2f\n"
                + "Promedio de Calificaciones: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionMateria1(),
                obtenerCalificacionMateria2(),
                obtenerCalificacionMateria3(),
                obtenerPromedioCalificacion());
        return cadena;
    }

}
