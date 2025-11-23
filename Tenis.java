class Tenis {
    String marca;
    String modelo;
    String tipo;

    Terreno terreno1 = new Terreno("Asfalto");
    Terreno terreno2 = new Terreno("Montaña");
    Terreno terreno3 = new Terreno("Playa");

    public Tenis(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return marca + " " + modelo + " " + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Terreno getTerreno1() { return terreno1; }
    public Terreno getTerreno2() { return terreno2; }
    public Terreno getTerreno3() { return terreno3; }
}
