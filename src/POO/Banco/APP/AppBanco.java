package POO.Banco.APP;

import POO.Banco.Dominio.Banco;
import POO.Banco.Dominio.CuentaBancaria;
import POO.Banco.Dominio.Persona;

public class AppBanco {

    public static void main(String[] args) {
        //Bancos

        Banco bbva = new Banco("BBVA", "Terrence");
        Banco bancolombia = new Banco("Bancolombia", "Carlos");
        Banco daviplata = new Banco("DaviPlata", "Thiago");
        Banco nequi = new Banco("Nequi", "Gomez");
        Banco bancoDeBogota = new Banco("Banco de bogota", "Santiago");

        //Personas

        Persona cesar = new Persona("Cesar", "1082905463", "cesar@gmail.com", 18);
        Persona julian = new Persona("Julian", "1087453210", "julian@gmail.com", 18);
        Persona juan = new Persona("Juan", "1087645232","juan@gmail.com", 18);
        Persona mateo = new Persona("Mateo", "1046732190","mateo@gmail.com",20);
        Persona carlos = new Persona("Carlos", "1065437890", "carlos@gmail.com", 24);
        Persona gregorio = new Persona("Gregorio", "1076543210", "elgore@gmail.com", 19);
        Persona miguel = new Persona("Miguel", "1075643817", "little@gmail.com", 19);
        Persona ezequiel = new Persona("Ezequiel", "1092391273", "zeke@gmail.com", 21);
        Persona valentin = new Persona("Valentin", "1075643212", "valen@gmail.com", 18);
        Persona victor = new Persona("Victor", "1087645321", "tio@gmail.com", 15);

        //Cuentas bancarias

        CuentaBancaria cuentaCesar = new CuentaBancaria("1001", 200000, "1234", "Ahorros",cesar,bbva);
        CuentaBancaria cuentaJulian = new CuentaBancaria("1002", 50000,"5678", "Corriente",julian,bancolombia);
        CuentaBancaria cuentaJuan = new CuentaBancaria("1003", 100000,"9101","Nomina",juan,daviplata);
        CuentaBancaria cuentaMateo = new CuentaBancaria("1004",500000,"1213","Ahorros",mateo,nequi);
        CuentaBancaria cuentaCarlos = new CuentaBancaria("1005", 100000, "1415", "Corriente",carlos,bancoDeBogota);
        CuentaBancaria cuentaGregorio = new CuentaBancaria("1006",35000, "1617", "Nomina",gregorio,bancolombia);
        CuentaBancaria cuentaMiguel = new CuentaBancaria("1007",50000.50,"1819","Corriente",miguel,bancoDeBogota);
        CuentaBancaria cuentaEzequiel = new CuentaBancaria("1008", 25000,"2021","Ahorros",ezequiel,bbva);
        CuentaBancaria cuentaValentin = new CuentaBancaria("1009",15000,"2223","Corriente",valentin,nequi);
        CuentaBancaria cuentaVictor = new CuentaBancaria("1010",40000,"2425","Ahorros",victor,daviplata);

        //Transacciones

        cuentaCesar.transferir(20000,cuentaJulian);
        cuentaJuan.depositar(15000);
        cuentaMateo.retirar(100000);
        cuentaCarlos.transferir(50000,cuentaCesar);
        cuentaGregorio.depositar(100000);
        cuentaMiguel.transferir(50000,cuentaEzequiel);
        cuentaValentin.retirar(50000);//Quiero que falle aproposito
        cuentaVictor.retirar(15000);
        cuentaCarlos.transferir(50000,cuentaMateo);
        cuentaVictor.transferir(10000,cuentaGregorio);

        cuentaCesar.mostrarSaldo();
        cuentaCarlos.mostrarSaldo();
        cuentaJulian.mostrarSaldo();
        cuentaJuan.mostrarSaldo();
        cuentaMateo.mostrarSaldo();
        cuentaMiguel.mostrarSaldo();
        cuentaEzequiel.mostrarSaldo();
        cuentaValentin.mostrarSaldo();
        cuentaVictor.mostrarSaldo();







    }

}
