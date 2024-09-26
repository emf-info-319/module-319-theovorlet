public class devoir03 {
    public static void main(String[] args) 
    {
        int jour;
        int mois;
        int annee;
        int nbJour = 0;
        
        jour = 31;
        mois = 12;
        annee = 2024;
        nbJour += jour;

        for (int i = 1; i < mois; i++)
        {
            if (i == 2 && (annee % 4) == 0)
            {
                nbJour += 29;
            }
           
            else if (i == 2 && (annee % 4) != 0)
            {
                nbJour += 28;
            }
            else if ((i % 2) != 0)
            {
                nbJour += 31;
            }
            else if ((i % 2) == 0)
            {
                nbJour += 30;
            }
           
        }
        System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour "  + nbJour+ " de l'An.");
    }
}