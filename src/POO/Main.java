package POO;

public class Main {
    Carro toyota = new Carro("Toyota", "Corrolla", 2022, "Rojo", 4, "Automatica","Gasolina", 180, "Delantera",1500, false, "Abc-123", 5, "Teka", "Pista");
    Carro ford = new Carro("Ford", "Mustang", 2023, "Negro", 2, "Manual", "Gasolina", 250, "Trasera", 5000, true, "XYZ-987", 4, "Piel", "Deportivas");
    Carro lamborghini = new Carro("Lamborghini", "Aventador", 2024, "Amarillo", 2, "Automática", "Gasolina", 350, "AWD", 0, false, "LMB-001", 2, "Piel", "Deportivas");
    Carro tesla = new Carro("Tesla", "Model 3", 2023, "Blanco", 4, "Automática", "Eléctrico", 225, "AWD", 12000, false, "TSL-333", 5, "Piel sintetiva", "Bajo consumo");
    Carro chevrolet = new Carro("Chevrolet", "Tahoe", 2021, "Gris", 5, "Automática", "Gasolina", 190, "4x4", 45000, true, "CHV-456", 7, "Piel", "Todo terreno");
    Carro honda = new Carro("Honda", "Civic", 2020, "Azul", 4, "Manual", "Gasolina", 200, "Delantera", 38000, false, "HND-789", 5, "Tela", "Pista");
    Carro porche = new Carro("Porsche", "911 Carrera", 2023, "Plata", 2, "Automática", "Gasolina", 293, "Trasera", 8000, false, "POR-911", 4, "Cuero", "Deportivas");
    Carro jeep = new Carro("Jeep", "Wrangler", 2022, "Rojo", 4, "Manual", "Gasolina", 160, "4x4", 22000, true, "JEP-4x4", 5, "Tela impermeable", "Off-road");
    Carro nissan = new Carro("Nissan", "Sentra", 2019, "Blanco", 4, "Automática", "Gasolina", 175, "Delantera", 60000, false, "NIS-111", 5, "Tela", "Pista");
    Carro audi = new Carro("Audi", "R8", 2022, "Gris Mate", 2, "Automática", "Gasolina", 330, "AWD", 11000, false, "AUD-008", 2, "Piel", "Deportivas");
    Carro hyundai = new Carro("Hyundai", "Tucson", 2023, "Negro", 5, "Automática", "Híbrido", 193, "AWD", 14000, false, "HYU-222", 5, "Tela", "Pista");
    Carro mercedez = new Carro("Mercedes-Benz", "Clase C", 2021, "Azul Marino", 4, "Automática", "Gasolina", 240, "Trasera", 28000, true, "MER-300", 5, "Piel", "Pista");
    Carro mazda = new Carro("Mazda", "CX-5", 2023, "Rojo Cristal", 5, "Automática", "Gasolina", 201, "AWD", 9500, false, "MZD-555", 5, "Piel", "Pista");
    Carro subaru = new Carro("Subaru", "WRX", 2021, "Azul", 4, "Manual", "Gasolina", 230, "AWD", 31000, true, "SUB-555", 5, "Tela", "Deportivas");
    Carro kia = new Carro("Kia", "Sportage", 2024, "Gris", 5, "Automática", "Gasolina", 180, "Delantera", 1000, false, "KIA-888", 5, "Tela", "Pista");
    Carro ferrari = new Carro("Ferrari", "F8 Tributo", 2023, "Rojo Ferrari", 2, "Automática", "Gasolina", 340, "Trasera", 3500, false, "FER-008", 2, "Cuero", "Deportivas");
    Carro volvo = new Carro("Volvo", "XC90", 2023, "Plata", 5, "Automática", "Híbrido", 210, "AWD", 16000, false, "VLV-090", 7, "Piel", "Pista");
    Carro dodge = new Carro("Dodge", "Challenger SRT", 2022, "Naranja", 2, "Manual", "Gasolina", 320, "Trasera", 12500, false, "DDG-700", 5, "Piel/Alcántara", "Deportivas");
    Carro peugeot = new Carro("Peugeot", "208", 2021, "Amarillo", 5, "Automática", "Gasolina", 188, "Delantera", 27000, false, "PGT-208", 5, "Tela", "Pista");
    Carro renaulti = new Carro("Renault", "Duster", 2019, "Marrón", 5, "Manual", "Gasolina", 165, "4x4", 62000, true, "RNL-404", 5, "Tela", "Mixtas");
    Carro mclaren = new Carro("McLaren", "720S", 2023, "Naranja", 2, "Automática", "Gasolina", 341, "Trasera", 4200, false, "MCL-720", 2, "Alcántara", "Pista/Deportivas");
    Carro bmw = new Carro("BMW", "X5", 2024, "Negro", 5, "Automática", "Gasolina", 243, "AWD", 3000, false, "BMX-500", 5, "Piel", "Pista");
    Carro susuki = new Carro("Suzuki", "Jimny", 2022, "Verde Mente", 3, "Manual", "Gasolina", 145, "4x4", 18000, true, "SZK-001", 4, "Tela", "Off-road");
    Carro fiat = new Carro("Fiat", "500", 2020, "Rojo", 3, "Manual", "Gasolina", 160, "Delantera", 33000, false, "FIT-500", 4, "Tela", "Pista");
    Carro buggati = new Carro("Bugatti", "Chiron", 2022, "Azul / Negro", 2, "Automática", "Gasolina", 420, "AWD", 800, false, "BGT-001", 2, "Piel / Fibra de carbono", "Deportivas");
    Carro cupra = new Carro("Cupra", "Formentor", 2024, "Gris Mate", 5, "Automática", "Gasolina", 250, "AWD", 3000, false, "CPR-100", 5, "Piel / Tela", "Deportivas");
    Carro genesis = new Carro("Genesis", "G80", 2023, "Azul", 4, "Automática", "Gasolina", 240, "AWD", 9000, false, "GNS-800", 5, "Cuero Nappa", "Pista");
    Carro maserati = new Carro("Maserati", "MC20", 2023, "Blanco", 2, "Automática", "Gasolina", 325, "Trasera", 2500, false, "MSR-020", 2, "Cuero / Alcántara", "Deportivas");
    Carro rolls_royce = new Carro("Rolls-Royce", "Phantom", 2024, "Negro", 4, "Automática", "Gasolina", 250, "Trasera", 500, false, "RRS-001", 5, "Piel artesanal", "Pista");
    Carro cadilac = new Carro("Cadillac", "Escalade", 2023, "Negro", 5, "Automática", "Gasolina", 180, "4x4", 15000, true, "CAD-999", 7, "Piel", "Pista");

    /*Blanco
    Amarillo
    Azul
    Dorado
    gris
     */


    Estrella amarilla1 = new Estrella("Amarillo","brillante", 5, "Grande");
    Estrella amarilla2 = new Estrella("Amarillo", "clásica", 5, "Mediana");
    Estrella amarilla3 = new Estrella("Amarillo", "fugaz", 4, "Pequeña");
    Estrella amarillo4 = new Estrella("Amarillo", "geométrica", 6, "Extra Grande");
    Estrella blanco1 = new Estrella("Blanco", "radiante", 5, "Mediana");
    Estrella blanco2 = new Estrella("Blanco", "navideña", 8, "Grande");
    Estrella blanco3 = new Estrella("Blanco", "minimalista", 4, "Pequeña");
    Estrella blanco4 = new Estrella("Blanco", "simétrica", 6, "Grande");
    Estrella dorado1 = new Estrella("Dorado", "real", 5, "Extra Grande");
    Estrella dorado2 = new Estrella("Dorado", "tridimensional", 12, "Grande");
    Estrella dorado3 = new Estrella("Dorado", "brillante", 5, "Mediana");
    Estrella dorado4 = new Estrella("Dorado", "decorativa", 8, "Pequeña");
    Estrella azul1 = new Estrella("Azul", "cósmica", 5, "Grande");
    Estrella azul2 = new Estrella("Azul", "neón", 4, "Mediana");
    Estrella azul3 = new Estrella("Azul", "cristal", 6, "Pequeña");
    Estrella azul4 = new Estrella("Azul", "geométrica", 8, "Extra Grande");
    Estrella gris1 = new Estrella("Plata", "metálica", 5, "Mediana");
    Estrella gris2 = new Estrella("Plata", "fugaz", 4, "Pequeña");
    Estrella gris3 = new Estrella("Plata", "fantasía", 7, "Grande");
    Estrella gris4 = new Estrella("Plata", "simétrica", 6, "Extra Grande");


}
