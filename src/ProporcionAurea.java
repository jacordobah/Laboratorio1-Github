public class ProporcionAurea {

    /**
     * @param args the command line arguments
     */
    public static void calcularTuProporcion(int estaturaCms, int cmsDelSueloAlOmbligo) {
        float proporcion = estaturaCms/cmsDelSueloAlOmbligo;
        if (proporción >=1,57 && proporcion <= 1,67){
            System.out.println("¡Felicidades, eres arte!");
        }
        else {
            System.out.println("¡Ohh mira un pajarito!");
        }
    }
    
}