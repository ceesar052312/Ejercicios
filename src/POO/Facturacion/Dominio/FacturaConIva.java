package POO.Facturacion.Dominio;

import java.time.LocalDateTime;

public abstract class FacturaConIva extends Factura {

    private int iva;

    public FacturaConIva(int numero, long valor, LocalDateTime fecha, int iva) {
        super(numero, valor, fecha);
        this.iva = iva;
    }

    @Override
    public long calcularTotal() {
        return this.getValor() + this.getValor() * this.iva / 100;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}

