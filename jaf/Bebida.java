public class Bebida {
    private static int idnuevo=1;
    private int id;
    private double cantidad;
    private double precio;
    private String marca;


    public Bebida( double cantidad, double precio, String marca) {
    
        this.id = idnuevo ++;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;

        
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(){
        this.marca = marca;
    }


    @Override
    public String toString() {
        return 
            " id='" + getId() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", marca='" + getMarca() + " " ;
    }
    
    

}
