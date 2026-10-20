package POO.Facturacion.App;

import POO.Facturacion.Dominio.*;

import java.time.LocalDateTime;

public class AppFacturacion {
    public static void main(String[] args) {

        //Factura con iva
        FacturaConIva12 juego = new FacturaConIva12(1,200000, LocalDateTime.of(2026,5, 15,10,30), 20);
        FacturaConIva12 mueble = new FacturaConIva12(2, 350000,LocalDateTime.of(2026, 10, 14, 10, 0),20);
        FacturaConIva12 libro = new FacturaConIva12(3,50000,LocalDateTime.of(2026, 10, 14, 8, 0),20);
        FacturaConIva12 raqueta = new FacturaConIva12(4,100000,LocalDateTime.of(2026, 10, 14, 9, 0),20);
        FacturaConIva12 paraguas = new FacturaConIva12(5,35000,LocalDateTime.of(2026, 10, 14, 10, 30),10);

        //Factura con iva y descuento
        FacturaConIvaYDescuento cama = new FacturaConIvaYDescuento(1,500000,LocalDateTime.of(2026, 10, 14, 11, 0),20,10);
        FacturaConIvaYDescuento escaparate = new FacturaConIvaYDescuento(2,350000,LocalDateTime.of(2026, 10, 14, 12, 0),15,20);
        FacturaConIvaYDescuento martillo = new FacturaConIvaYDescuento(3,20000,LocalDateTime.of(2026, 10, 14, 13, 0),5,10);
        FacturaConIvaYDescuento mesa = new FacturaConIvaYDescuento(4,100000,LocalDateTime.of(2026, 10, 14, 14, 0),12,35);
        FacturaConIvaYDescuento moto = new FacturaConIvaYDescuento(5,1000000,LocalDateTime.of(2026, 10, 14, 15, 30),30,50);

        //Factura con descuento
        FacturaConDescuento matricula = new FacturaConDescuento(1,600000,LocalDateTime.of(2026, 10, 15, 10, 0),30);
        FacturaConDescuento pollo = new FacturaConDescuento(2,10000,LocalDateTime.of(2026, 10, 16, 14, 30),15);
        FacturaConDescuento yogur = new FacturaConDescuento(3,7500,LocalDateTime.of(2026, 10, 17, 9, 15),5);
        FacturaConDescuento celular = new FacturaConDescuento(4,800000,LocalDateTime.of(2026, 10, 18, 16, 45),25);
        FacturaConDescuento tablet = new FacturaConDescuento(5,500000,LocalDateTime.of(2026, 10, 19, 11, 0),10);

        //Facturacion
        Facturacion lista = new Facturacion();

        lista.getFacturasSinDescuento().add(juego);
        lista.getFacturasSinDescuento().add(mueble);
        lista.getFacturasSinDescuento().add(libro);
        lista.getFacturasSinDescuento().add(raqueta);
        lista.getFacturasSinDescuento().add(paraguas);

        lista.getFacturasConDescuento().add(cama);
        lista.getFacturasConDescuento().add(escaparate);
        lista.getFacturasConDescuento().add(martillo);
        lista.getFacturasConDescuento().add(mesa);
        lista.getFacturasConDescuento().add(moto);
        lista.getFacturasConDescuento().add(matricula);
        lista.getFacturasConDescuento().add(pollo);
        lista.getFacturasConDescuento().add(yogur);
        lista.getFacturasConDescuento().add(celular);
        lista.getFacturasConDescuento().add(tablet);

        lista.mostrarTotal();



    }
}
