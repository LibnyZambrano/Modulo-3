/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo3;

/**
 *
 * @author Libny Zambrano
 */
public class Modulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Creando el objeto Perro 
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(" Libny Zambrano ");
        estudiante.setCarrera(" Ingenieria Industrial ");
        estudiante.setEdad (27);
        estudiante.setSexo (" M ");
        
        System.out.println(" Nombre: " + estudiante.getNombre() );
        System.out.println(" Carrera: " + estudiante.getCarrera() );
        System.out.println(" Edad: " + estudiante.getEdad() );
        System.out.println(" Sexo: " + estudiante.getSexo() );
    }
    public static class Estudiante
    {
        //Private hace que los atributos sean accedidos dentro de la clase
        private String nombre;
        private String carrera;
        private int edad;
        private String sexo;   
        
        //Métodos públicos para acceder a los datos
        public String getNombre()
        {
        return nombre;
        }
        public String getCarrera()
        {
        return carrera;
        }
        public int getEdad()
        {
            return edad;
        }
        public String getSexo()
        {
        return sexo;
        }
        
        //Métodos públicos para establecer los datos
        public void setNombre(String nombre)
        {
        this.nombre = nombre;
        }
        public void setCarrera(String carrera)
        {
        this.carrera = carrera;
        }
        public void setEdad(int edad)
        {
        this.edad = edad;
        }
        public void setSexo(String sexo)
        {
        this.sexo = sexo;
        }
    }
        // TODO code application logic here
    }
    

