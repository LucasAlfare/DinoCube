package br.stm.dinocube;

public class FacePiece {

    private FaceColor color;
    private int[] originalPlace;
    private int id;

    FacePiece(FaceColor color, int[] originalPlace, int id) {
        this.color = color;
        this.originalPlace = originalPlace;
        this.id = id;
    }

    public FaceColor getPieceColor() {
        return color;
    }

    public int[] getOriginalPlace() {
        return originalPlace;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FacePiece) {
            FacePiece cp = (FacePiece) obj;
            return cp.color == color && cp.originalPlace[0] == originalPlace[0]
                    && cp.originalPlace[1] == originalPlace[1];
        }

        return false;
    }

    public FacePiece clonePiece() {
        return new FacePiece(color, originalPlace, id);
    }
}
