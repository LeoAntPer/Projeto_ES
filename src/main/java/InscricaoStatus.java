public enum InscricaoStatus {
    PENDING("Pendente"),
    DISQUALIFIED("Desqualificado"),
    CANCELED("Cancelada");


    private final String description;
    InscricaoStatus (String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
