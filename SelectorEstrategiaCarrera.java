class SelectorEstrategiaCarrera {
    public static EstrategiaCarrera obtener(Tenis tenis, Terreno terreno) {

        switch (terreno.getTipo().toLowerCase()) {
            case "asfalto":
                return new EstrategiaCarreraPorTerreno(10, 40);
            case "montaña":
                return new EstrategiaCarreraPorTerreno(15, 50);
            case "playa":
                return new EstrategiaCarreraPorTerreno(12, 45);
            default:
                return new EstrategiaCarreraPorTerreno(10, 40);
        }
    }
}