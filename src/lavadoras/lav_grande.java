package lavadoras;

public class lav_grande {
    float precio;
    double  domicilio;
    int canHoras;
    double cuentaCobro;

    public lav_grande(float precio, double domicilio, int canHoras, double cuentaCobro) {
        this.precio = precio;
        this.domicilio = domicilio;
        this.canHoras = canHoras;
        this.cuentaCobro = cuentaCobro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(double domicilio) {
        this.domicilio = domicilio;
    }

    public int getCanHoras() {
        return canHoras;
    }

    public void setCanHoras(int canHoras) {
        this.canHoras = canHoras;
    }

    public double getCuentaCobro() {
        return cuentaCobro;
    }

    public void setCuentaCobro(double cuentaCobro) {
        this.cuentaCobro = cuentaCobro;
    }
}
