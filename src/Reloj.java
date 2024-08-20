/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author johann lopez
 */
public class Reloj {

    // Atributos
private int hora;
private int minutos;
private int segundos;
// Constructor
public Reloj (int hora, int minutos, int segundos) {
this.hora = hora;
this.minutos = minutos;
this.segundos = segundos; 
}
// Métodos setters
public void setHora ( int hora) {
this.hora = hora; 
}
public void setMinutos (int minutos){
this .minutos = minutos; 
}
public
void
setSegundos
(
int
segundos)
{
this
.segundos = segundos; }
// Métodos getters
public int getHora () { return hora; 
}
public int getMinutos (){ 
return minutos; 
}
public int getSegundos ()
{
return segundos; 
}
// Método para mostrar la hora
public String mostrarHora () { 
return String.format("%02d:%02d:%02d", hora, minutos, segundos); 
}// Método principal para probar la clase
    public static void main(String[] args) {
        Reloj miReloj=new Reloj(10,30,45); 
        System.out.println("Mi hora es: "+ miReloj.mostrarHora());
        
    }
        
}
    

