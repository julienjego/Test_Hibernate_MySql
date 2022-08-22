package fr.afpajulien;

import jakarta.persistence.*;

@Entity
@Table(name = "appart")
public class Appart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noAppart;
    private int nbrePieces;
    private float prix;
    private float surface;
    @Column(name = "immeuble_noimm")
    private String immeubleNoImm;

    public Appart() {
    }

    public Appart(int nbrePieces, float prix, float surface, String immeubleNoImm) {
        this.nbrePieces = nbrePieces;
        this.prix = prix;
        this.surface = surface;
        this.immeubleNoImm = immeubleNoImm;
    }

    public int getNoAppart() {
        return noAppart;
    }

    public int getNbrePieces() {
        return nbrePieces;
    }

    public void setNbrePieces(int nbrePieces) {
        this.nbrePieces = nbrePieces;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public String getImmeubleNoImm() {
        return immeubleNoImm;
    }

    public void setImmeubleNoImm(String immeubleNoImm) {
        this.immeubleNoImm = immeubleNoImm;
    }


    @Override
    public String toString() {
        return "Appart{" +
                "noAppart=" + noAppart +
                ", nbrePieces=" + nbrePieces +
                ", prix=" + prix +
                ", surface=" + surface +
                ", immeubleNoImm='" + immeubleNoImm + '\'' +
                '}';
    }
}
