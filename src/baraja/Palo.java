package baraja;

public enum Palo {
    TREBOL(Color.NEGRO),
    PICA(Color.NEGRO),
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO);
    private Color color;
    private Palo(Color color){};
}
