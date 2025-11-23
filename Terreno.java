class Terreno {
    String tipo;

    Duracion duracionCorta = new Duracion("Corta", 5);
    Duracion duracionMedia = new Duracion("Media", 10);
    Duracion duracionLarga = new Duracion("Larga", 21);

    public Terreno(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}