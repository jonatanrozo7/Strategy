public class Principal {
    public static void main(String[] args) {

        // Tenis
        Tenis tenis1 = new Tenis("Nike", "Pegasus", "Montaña");
        Tenis tenis2 = new Tenis("Adidas", "Ultraboost", "Asfalto");
        Tenis tenis3 = new Tenis("Puma", "Velocity Nitro", "Playa");

        // Atletas
        Atleta atleta1 = new Atleta("Paula", 28, 200, tenis1);
        Atleta atleta2 = new Atleta("Juan", 30, 100, tenis2);
        Atleta atleta3 = new Atleta("Ana", 25, 116, tenis3);

        // ===== ATLETA 1 =====
        System.out.println("=== INFORMACIÓN DE LOS ATLETA1 ===");
        atleta1.mostrarSoloTenis();

        Tenis tenisElegido1 = atleta1.tenis;
        Terreno terrenoElegido1 = tenisElegido1.getTerreno1();

        atleta1.setEstrategia(SelectorEstrategiaCarrera.obtener(tenisElegido1, terrenoElegido1));
        atleta1.correr(tenisElegido1, terrenoElegido1);

        terrenoElegido1.duracionCorta.aplicarDuracion(atleta1);
        terrenoElegido1.duracionCorta.hidratacionMucha.hidratar(atleta1);

        System.out.println("Sensación del atleta: " +
                terrenoElegido1.duracionCorta.hidratacionMucha.getSensacion());
        System.out.println("Energía restante del atleta: " + atleta1.getEnergia());
        System.out.println(atleta1.getEnergia() > 0 ? "Terminó la carrera" : "No terminó la carrera");


        // ===== ATLETA 2 =====
        System.out.println("\n=== INFORMACIÓN DE LOS ATLETA2 ===");
        atleta2.mostrarSoloTenis();

        Tenis tenisElegido2 = atleta2.tenis;
        Terreno terrenoElegido2 = tenisElegido2.getTerreno2();

        atleta2.setEstrategia(SelectorEstrategiaCarrera.obtener(tenisElegido2, terrenoElegido2));
        atleta2.correr(tenisElegido2, terrenoElegido2);

        terrenoElegido2.duracionMedia.aplicarDuracion(atleta2);
        terrenoElegido2.duracionMedia.hidratacionNormal.hidratar(atleta2);

        System.out.println("Sensación del atleta: " +
                terrenoElegido2.duracionMedia.hidratacionNormal.getSensacion());
        System.out.println("Energía restante del atleta: " + atleta2.getEnergia());
        System.out.println(atleta2.getEnergia() > 0 ? "Terminó la carrera" : "No terminó la carrera");


        // ===== ATLETA 3 =====
        System.out.println("\n=== INFORMACIÓN DE LOS ATLETA3 ===");
        atleta3.mostrarSoloTenis();

        Tenis tenisElegido3 = atleta3.tenis;
        Terreno terrenoElegido3 = tenisElegido3.getTerreno3();

        atleta3.setEstrategia(SelectorEstrategiaCarrera.obtener(tenisElegido3, terrenoElegido3));
        atleta3.correr(tenisElegido3, terrenoElegido3);

        terrenoElegido3.duracionLarga.aplicarDuracion(atleta3);
        terrenoElegido3.duracionLarga.hidratacionNinguna.hidratar(atleta3);

        System.out.println("Sensación del atleta: " +
                terrenoElegido3.duracionLarga.hidratacionNinguna.getSensacion());
        System.out.println("Energía restante del atleta: " + atleta3.getEnergia());
        System.out.println(atleta3.getEnergia() > 0 ? "Terminó la carrera" : "No terminó la carrera");
    }
}









