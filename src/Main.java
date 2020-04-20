public class Main
{
    public static void main(String[] args)
    {
        Reunion reunion1 = new Reunion(10,11);
        Reunion reunion2 = new Reunion(11,14);
        Reunion reunion3 = new Reunion(12,13);
        Reunion reunion4 = new Reunion(12,13);
        Reunion reunion5 = new Reunion(12,14);
        Reunion[] tableauReunion = {reunion1,reunion2,reunion3,reunion4,reunion5};
        int progression = 0;
        int numChevalier = 1;
        int ancienneFin = 0;

        System.out.println("longueur tableau reunion : " + tableauReunion.length);
        /*
        System.out.println("reunion " + 0 + " = Heure de début : " + tableauReunion[0].getHeureDebut() + "; Heure de fin : " + tableauReunion[0].getHeureFin() + "; Statut Chevalier : " + tableauReunion[0].getChevalierAttribuer() + "; Numéro Chevalier attribuer : " + tableauReunion[0].getNumeroChevalier());
        System.out.println("reunion " + 1 + " = Heure de début : " + tableauReunion[1].getHeureDebut() + "; Heure de fin : " + tableauReunion[1].getHeureFin() + "; Statut Chevalier : " + tableauReunion[1].getChevalierAttribuer() + "; Numéro Chevalier attribuer : " + tableauReunion[1].getNumeroChevalier());
        System.out.println("reunion " + 2 + " = Heure de début : " + tableauReunion[2].getHeureDebut() + "; Heure de fin : " + tableauReunion[2].getHeureFin() + "; Statut Chevalier : " + tableauReunion[2].getChevalierAttribuer() + "; Numéro Chevalier attribuer : " + tableauReunion[2].getNumeroChevalier());
        System.out.println("reunion " + 3 + " = Heure de début : " + tableauReunion[3].getHeureDebut() + "; Heure de fin : " + tableauReunion[3].getHeureFin() + "; Statut Chevalier : " + tableauReunion[3].getChevalierAttribuer() + "; Numéro Chevalier attribuer : " + tableauReunion[3].getNumeroChevalier());
        System.out.println("reunion " + 4 + " = Heure de début : " + tableauReunion[4].getHeureDebut() + "; Heure de fin : " + tableauReunion[4].getHeureFin() + "; Statut Chevalier : " + tableauReunion[4].getChevalierAttribuer() + "; Numéro Chevalier attribuer : " + tableauReunion[4].getNumeroChevalier());
        */

        while (progression < tableauReunion.length)
        {
            ancienneFin = 0;
            System.out.println("Etat tableau à l'itération (" + numChevalier + ") :");

            for(int i = 0; i < tableauReunion.length; i++)
            {
                if((ancienneFin <= tableauReunion[i].getHeureDebut()) && !(tableauReunion[i].getChevalierAttribuer()))
                {
                    progression ++;
                    tableauReunion[i].setNumeroChevalier(numChevalier);
                    tableauReunion[i].setTrueChevalierAttribuer();
                    ancienneFin = tableauReunion[i].getHeureFin();
                }
                System.out.println("reunion " + i + " = Heure de début : " + tableauReunion[i].getHeureDebut() + "; Heure de fin : " + tableauReunion[i].getHeureFin() + "; Statut Chevalier : " + tableauReunion[i].getChevalierAttribuer() + "; Numéro Chevalier attribuer : " + tableauReunion[i].getNumeroChevalier());


            }

            System.out.println();

            if(progression < tableauReunion.length)
            {
                numChevalier ++;
            }

        }

        System.out.println("Nombre de chevalier nécessaires : " + numChevalier);


    }
}
