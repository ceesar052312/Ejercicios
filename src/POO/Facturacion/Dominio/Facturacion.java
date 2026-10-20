package POO.Facturacion.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Facturacion {

    private List<Factura> FacturasConDescuento = new ArrayList<>();
    private List<Factura> FacturasSinDescuento = new ArrayList<>();

    public void mostrarTotal(){
        long totalConDescuento = 0;
        for (Factura i : getFacturasConDescuento()){
            totalConDescuento += i.calcularTotal();
        }
        long totalSinDescuento = 0;
        for (Factura i : getFacturasSinDescuento()){
            totalSinDescuento += i.calcularTotal();
        }
        System.out.println("Total facturas con descuento $" + totalConDescuento);
        System.out.println("Total facturas sin descuento $" + totalSinDescuento);
        System.out.println("Total general de todas las facturas $" + (totalConDescuento + totalSinDescuento));
    }

    public List<Factura> getFacturasConDescuento() {
            return FacturasConDescuento;
    }

    public List<Factura> getFacturasSinDescuento() {
        return FacturasSinDescuento;
    }

    public void setFacturasConDescuento(List<Factura> facturasConDescuento) {
        FacturasConDescuento = facturasConDescuento;
    }

    public void setFacturasSinDescuento(List<Factura> facturasSinDescuento) {
        FacturasSinDescuento = facturasSinDescuento;
    }
}
