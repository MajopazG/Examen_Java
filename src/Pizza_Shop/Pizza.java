package Pizza_Shop;

public class Pizza {
    private String descripcion;
    private int cantidad;
    private int costoDomicilio;
    private int valorCombo;

    public Pizza() {
    }

    public Pizza(String descripcion, int cantidad, int costoDomicilio, int valorCombo) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costoDomicilio = costoDomicilio;
        this.valorCombo = valorCombo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getValorCombo() {
        return valorCombo;
    }

    public void setValorCombo(int valorCombo) {
        this.valorCombo = valorCombo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCostoDomicilio() {
        return costoDomicilio;
    }

    public void setCostoDomicilio(int costoDomicilio) {
        this.costoDomicilio = costoDomicilio;
    }
    public double calcularCosto(){
        int subTotal = cantidad*valorCombo;
        if (subTotal >= 50000 ){
            return  subTotal;
        }else{
            return subTotal + costoDomicilio ;
        }
    }
}
