class Hidratacion {
    int botellas;

    String sensacion1 = "Cómodo";
    String sensacion2 = "Exigente";
    String sensacion3 = "Muy duro";

    public Hidratacion(int botellas) {
        this.botellas = botellas;
    }

    public void hidratar(Atleta atleta) {
        for (int i = 0; i < botellas; i++) {
            atleta.energia += 3;
        }
    }

    public String getSensacion() {
        if (botellas < 2) return sensacion3;
        else if (botellas == 2) return sensacion2;
        else return sensacion1;
    }
}