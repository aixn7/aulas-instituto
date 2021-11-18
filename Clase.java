
/**
 * Write a description of class Clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    private int numeroAlumnos;
    private boolean abierta;
    private MesaProfesor mesaProfesor;
    
    public Clase(int numeroDeAlumnos, boolean estaAbierta){
        numeroAlumnos = numeroDeAlumnos;
        abierta = estaAbierta;
        mesaProfesor = new MesaProfesor (50,"verde");
    }
}
