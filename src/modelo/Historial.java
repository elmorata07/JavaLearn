package modelo;

/**
 *
 * @author ADALBERTO
 */
public class Historial {
    
    
    private int codigo;
    private String descripcion;
    private Procedimiento procedimientos;

    public Historial() {
      procedimientos = new Procedimiento();
    }

    public Historial(int codigo, String descripcion, Procedimiento procedimientos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.procedimientos = procedimientos;
    }
    
    
    


    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Procedimiento getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(Procedimiento procedimientos) {
        this.procedimientos = procedimientos;
    }
    
    
    
}
