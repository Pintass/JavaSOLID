package v2bis;

public enum Wood {
    ADIRONDACK, CEDAR, COCOBOLO, MAHIOGANY, MAPLE, SITKA, BRAZILIAN_ROSEWOOD,MAHOGANY, INDIAN_ROSEWOOD, ALDER ;

    public String toString() {
        switch (this) {
            case ADIRONDACK: return "Adirondack";
            case CEDAR: return "Cedar";
            case COCOBOLO: return "Cocobol";
            case MAHIOGANY: return "Mahiogany";
            case MAPLE: return "Maple";
            case SITKA: return "Sitka";
            case BRAZILIAN_ROSEWOOD: return  "Brazilian Rosewood";
            case MAHOGANY: return "Mahogany";
            case INDIAN_ROSEWOOD : return "Indian Rosewood";
            case ALDER: return "Alder";
            default: return "Unspecified";
        }
    }
}
