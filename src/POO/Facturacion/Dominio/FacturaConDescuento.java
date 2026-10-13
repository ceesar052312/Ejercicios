package POO.Facturacion.Dominio;

import java.time.LocalDateTime;

public class FacturaConDescuento extends FacturaSinIva{

    private int porcDescuento;

    public FacturaConDescuento(int numero, long valor, LocalDateTime fecha, int porcDescuento) {
        super(numero, valor, fecha);
        this.porcDescuento = porcDescuento;
    }

    public int getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(int porcDescuento) {
        this.porcDescuento = porcDescuento;
    }
}
