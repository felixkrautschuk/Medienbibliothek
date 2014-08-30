package com.example.felix.medienbibliothek;

public class Person
{
    private int index;
    private String nachname;
    private String vorname;
    private boolean status;

    public Person(int index, String nachname, String vorname)
    {
        this.index = index;
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public int getIndex()
    {
        return index;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String getVorname()
    {
        return vorname;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public void setVorname(String vorname)
    {
        vorname = vorname;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }
}
