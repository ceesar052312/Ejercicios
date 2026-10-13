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
        return 0;
    }
}

