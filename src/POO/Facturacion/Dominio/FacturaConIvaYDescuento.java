package POO.Facturacion.Dominio;

import java.time.LocalDateTime;

public class FacturaConIvaYDescuento extends FacturaConIva{

    private int porcDescuento;

    public FacturaConIvaYDescuento(int numero, long valor, LocalDateTime fecha, int iva, int porcDescuento) {
        super(numero, valor, fecha, iva);
        this.porcDescuento = porcDescuento;
    }

    public int getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(int porcDescuento) {
        this.porcDescuento = porcDescuento;
    }
}
