package modelo;

import java.util.ArrayList;
 
/**
 *
 * @author ADALBERTO
 */
public class Mascota {

    private int codigo;
    private String nombreResponsable, nombreMascota, raza, numeroContacto;
    private ArrayList<Historial> historials;

    public Mascota() {
        historials = new ArrayList();
    }

    public Mascota(int codigo, String nombreResponsable, String nombreMascota, String raza, String numeroContacto) {
        this.codigo = codigo;
        this.nombreResponsable = nombreResponsable;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.numeroContacto = numeroContacto;
        this.historials = historials;
    }
    
    


    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public ArrayList<Historial> getHistorials() {
        return historials;
    }

    public void setHistorials(ArrayList<Historial> historials) {
        this.historials = historials;
    }
    
    
    
    
    

}
