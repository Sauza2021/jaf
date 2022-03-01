public class BebidaAzucarada extends Bebida {

    private double porcentajeAzucar;
    private boolean promicion;


    


    public BebidaAzucarada(double porcentajeAzucar, boolean promicion,double cantidad, double precio, String marca) {
        super(cantidad,precio,marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promicion = promicion;
    }


    public double getPorcentajeAzucar() {
        return this.porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromicion() {
        return this.promicion;
    }

    public boolean getPromicion() {
        return this.promicion;
    }

    public void setPromicion(boolean promicion) {
        this.promicion = promicion;
    }

   @Override
    public double getPrecio(){
       if(isPromicion()){
           return super.getPrecio() * 0.9;
       }else{
           return super.getPrecio();
       }
   }
   
    @Override
    public String toString() {
        return 
            super.toString()+" porcentajeAzucar='" + getPorcentajeAzucar() + "'" +
            ", promicion='" + isPromicion() ;
    }

}  
