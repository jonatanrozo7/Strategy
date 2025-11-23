class Duracion {
    String nombreDuracion;
    int km;

    Hidratacion hidratacionMucha = new Hidratacion(4);
    Hidratacion hidratacionNormal = new Hidratacion(2);
    Hidratacion hidratacionNinguna = new Hidratacion(0);

    public Duracion(String nombreDuracion, int km) {
        this.nombreDuracion = nombreDuracion;
        this.km = km;
    }

    public void aplicarDuracion(Atleta atleta) {
        int kmRecorridos = 0;

        while (kmRecorridos < km && atleta.energia > 0) {
            atleta.energia -= 5;
            kmRecorridos++;
        }
    }
}