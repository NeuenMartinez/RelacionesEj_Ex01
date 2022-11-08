/*
 * @author NeuenMartinez
 */
package RelacionesEj_Ex01;

import Servicios.AdopcionService;


public class RelacionesEj_Ex01 {

    public static void main(String[] args) {


        AdopcionService as = new AdopcionService();
        as.crearPerro();
        as.crearPersona();
        as.eleccionPerro();
    }

}