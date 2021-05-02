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
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreEstudiante = "Anthony";
        double calMat1 = 7.4;
        double calMat2 = 8.9;
        double calMat3 = 9.2;

        PromedioEstudiante promEst = new PromedioEstudiante(nombreEstudiante,
                calMat1, calMat2, calMat3);

        promEst.establecerNombreEstudiante(nombreEstudiante);
        promEst.establecerCalificacionMateria1(calMat1);
        promEst.establecerCalificacionMateria2(calMat2);
        promEst.establecerCalificacionMateria3(calMat3);
        promEst.establecerPromedioCalificacion();

        System.out.println(promEst);

        String nombreEstudiante2 = "Gabriel";
        double califMat1 = 7.8;
        double califMat2 = 5.3;
        double califMat3 = 6.2;

        PromedioEstudiante promEst2 = new PromedioEstudiante(nombreEstudiante2,
                califMat1, califMat2, califMat3);

        promEst2.establecerNombreEstudiante(nombreEstudiante2);
        promEst2.establecerCalificacionMateria1(califMat1);
        promEst2.establecerCalificacionMateria2(califMat2);
        promEst2.establecerCalificacionMateria3(califMat3);
        promEst2.establecerPromedioCalificacion();

        System.out.println(promEst2);
    }

}
