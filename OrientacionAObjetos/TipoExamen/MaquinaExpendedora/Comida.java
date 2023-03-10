package TipoExamen.MaquinaExpendedora;

public abstract class Comida extends Articulo implements Alimento {
    // Variables
    private boolean caducado;

    // Constructor
    public Comida(String nombre, String codigo, double precio) {
        super(nombre, codigo, precio);
        this.caducado = false;
    }

    // Metodos
    public boolean isCaducado() {
        this.caducado = true;
        return caducado;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }

    public boolean caducar() {
        int probabilidadCaducar = (int) (Math.random() * 100); 

        if (probabilidadCaducar <= 50) {
            return true;
        } else {
            return false;
        }
    }

    // toString
    @Override
    public String toString() {
        String resultado = "";

        if(isCaducado()) {
            resultado += "caducado.";
        } else {
            resultado += "no caducado.";
        }

        return "Comida -> " 
        + getNombre() + "- " 
        + getCodigo() + "- " 
        + getPrecio() + "- "
        + ", " + getNombre() + "esta " + resultado + "."
        ;
    }


}
