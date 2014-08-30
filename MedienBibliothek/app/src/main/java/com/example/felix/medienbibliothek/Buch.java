package com.example.felix.medienbibliothek;

public class Buch
{
    private int artikelNummer;
    private String titel;
    private String kuenstler;
    private String vertrieb;
    private boolean status;
    private int jahr;
    private int stueckzahlVerfuegbar;
    private int stueckzahlVerliehen;

    public Buch(int artikelNummer, String titel, String kuenstler, String vertrieb, int jahr, int stueckzahlVerfuegbar, int stueckzahlVerliehen)
    {
        this.artikelNummer = artikelNummer;
        this.titel = titel;
        this.kuenstler = kuenstler;
        this.vertrieb = vertrieb;
        this.jahr = jahr;
        this.stueckzahlVerfuegbar = stueckzahlVerfuegbar;
        this.stueckzahlVerliehen = stueckzahlVerliehen;
    }

    int getArtNr()
    {
        return this.artikelNummer;
    }

    void setArtNr(int artikelNummer)
    {
        this.artikelNummer = artikelNummer;
    }

    String getTitel()
    {
        return this.titel;
    }

    void setTitel(String titel)
    {
        this.titel = titel;
    }

    String getKuenstler()
    {
        return this.kuenstler;
    }

    void setKuenstler(String kuenstler)
    {
        this.kuenstler = kuenstler;
    }

    String getvertrieb()
    {
        return this.vertrieb;
    }

    void setVertrieb(String vertrieb)
    {
        this.vertrieb = vertrieb;
    }

    boolean getStatus()
    {
        return this.status;
    }

    void setStatus(boolean status)
    {
        this.status = status;
    }

    int getjahr()
    {
        return this.jahr;
    }

    void setJahr(int jahr)
    {
        this.jahr = jahr;
    }

    int getStueckzahlVerfuegbar()
    {
        return this.stueckzahlVerfuegbar;
    }

    void setStueckzahlVerfuegbar(int stueckzahlVerfuegbar)
    {
        this.stueckzahlVerfuegbar = stueckzahlVerfuegbar;
    }

    int getStueckzahlVerliehen()
    {
        return this.stueckzahlVerliehen;
    }

    void setStueckzahlVerliehen(int stueckzahlVerliehen)
    {
        this.stueckzahlVerliehen = stueckzahlVerliehen;
    }

    public interface InterfaceAusgabe
    {
        public abstract void ausgabeMedium();
    }
}
