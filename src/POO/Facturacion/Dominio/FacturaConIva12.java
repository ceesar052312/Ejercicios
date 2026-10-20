package POO.Facturacion.Dominio;

import java.time.LocalDateTime;

public class FacturaConIva12 extends FacturaConIva{

    public FacturaConIva12(int numero, long valor, LocalDateTime fecha, int iva) {
        super(numero, valor, fecha, iva);
    }
}
