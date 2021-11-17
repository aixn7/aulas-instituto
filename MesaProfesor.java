
/**
 * Write a description of class Mesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MesaProfesor
{
    private int altura;
    private String color;

    public MesaProfesor(int alturaMesa, String colorMesa){
        altura = alturaMesa;
        color = colorMesa;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setAltura(int nuevaAltura){
        altura = nuevaAltura;
    }
    
    public void setColor(String nuevoColor){
        color = nuevoColor;
    }
    
    public void imprimirDetalles(){
        System.out.println("Altura: " + altura + "Color: " + color);
    }
}
