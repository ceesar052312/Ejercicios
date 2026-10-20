package POO.Facturacion.Dominio;

import java.time.LocalDateTime;

public abstract class FacturaSinIva extends Factura{

    public FacturaSinIva(int numero, long valor, LocalDateTime fecha) {
        super(numero, valor, fecha);
    }
    @Override
    public long calcularTotal() {
        return this.getValor();
    }
}
