public class Reunion
{
    private int heureDebut;
    private int heureFin;
    private boolean chevalierAttribuer;
    private int numeroChevalier;

    public Reunion()
    {
        this.chevalierAttribuer = false;
    }
    public Reunion(int hD, int hF)
    {
        this.heureDebut = hD;
        this.heureFin = hF;
        this.chevalierAttribuer = false;
    }

    public void setTrueChevalierAttribuer()
    {
        this.chevalierAttribuer = true;
    }

    public void setNumeroChevalier(int nC)
    {
        this.numeroChevalier = nC;
    }

    public int getHeureDebut()
    {
        return heureDebut;
    }

    public int getHeureFin()
    {
        return heureFin;
    }

    public boolean getChevalierAttribuer()
    {
        return chevalierAttribuer;
    }

    public int getNumeroChevalier()
    {
        return numeroChevalier;
    }
}
