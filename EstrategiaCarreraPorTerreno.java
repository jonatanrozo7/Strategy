class EstrategiaCarreraPorTerreno implements EstrategiaCarrera {
    private int costoCompatible;
    private int costoIncompatible;

    public EstrategiaCarreraPorTerreno(int costoCompatible, int costoIncompatible) {
        this.costoCompatible = costoCompatible;
        this.costoIncompatible = costoIncompatible;
    }

    @Override
    public void aplicar(Atleta atleta, Tenis tenis, Terreno terreno) {
        boolean compatible = tenis.getTipo().equalsIgnoreCase(terreno.getTipo());
        atleta.energia -= compatible ? costoCompatible : costoIncompatible;
    }
}