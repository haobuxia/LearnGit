package edu.thss.platform.domain.itemclass.omf;

public enum Side {
    Left,
    Right;

    private Side() {
    }

    public Side another() {
        return this.equals(Right) ? Left : Right;
    }
}
