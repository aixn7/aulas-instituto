
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
    
    public Clase(int numeroDeAlumnos, boolean estaAbierta, MesaProfesor mesaDelProfesor){
        numeroAlumnos = numeroDeAlumnos;
        abierta = estaAbierta;
        mesaProfesor = mesaDelProfesor;
    }
    
    public int getNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public boolean getAbierta(){
        return abierta;
    }
    
    public String getDetallesMesaProfesor(){
        return "Altura: " + mesaProfesor.getAltura() + "| Color: " + mesaProfesor.getColor();
    }
    
    public void setNumeroAlumnos(int nuevoNumeroAlumnos){
        numeroAlumnos = nuevoNumeroAlumnos;
    }
    
    public void setAbierta(boolean nuevoEstado){
        abierta = nuevoEstado;
    }
    
    public void setDetallesMesaProfesor(int nuevaAltura, String nuevoColor){
        mesaProfesor.setAltura(nuevaAltura);
        mesaProfesor.setColor(nuevoColor);
    }
    
    public void imprimirDetalles(){
        System.out.println("Numero de alumnos: "+numeroAlumnos+"| Puerta abierta: "+abierta+ "| Altura: " + mesaProfesor.getAltura()+ "| Color: " + mesaProfesor.getColor());
    }
}
