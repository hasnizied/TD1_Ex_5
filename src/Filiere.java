    public class Filiere {
        // les attrebuts du filiere
        private String nomFiliere;
        private Professeur[] tabP = new Professeur[4];


        // les proprietes du filiere
        public String getNomFiliere() {
            return nomFiliere;
        }

        public void setNomFiliere(String nomFiliere) {
            this.nomFiliere = nomFiliere;
        }

        public Professeur[] getTabP() {
            return tabP;
        }

        public void setTabP(Professeur[] tabP) {
            this.tabP = tabP;
        }

        public Filiere()
        {

        }

        public Filiere(String nomFiliere) {
                    this.nomFiliere = nomFiliere;
        }

        public void AjouterProf(String n ,String P)
        {
            Professeur Prof = new Professeur(n,P);
            for (int i = 0; i < tabP.length; i++) {
                if (tabP[i] == null)
                {
                    tabP[i] = Prof;
                    break;
                }
            }
        }

        public void AfficherProf()
        {
            for (Professeur p : tabP){
                if (p != null){
                    System.out.println(p);
                }

            }
        }

        public void SupprimerProf(String n){
              for (int i = 0; i < tabP.length; i++) {
                  if (tabP[i].getNom().equals(n)){
                      tabP[i] = null;
                      break;
                  }
            }
        }

        public void ChercherProf(String n)
        {
            for (Professeur p : tabP){
                if (p != null && p.getNom().equals(n)){
                     System.out.println(p);
                }

            }
        }

        public void ModifierProf(String n,String p, String Old_n)
        {
            for (Professeur p1 : tabP){
                if (p1 != null && p1.getNom().equals(Old_n)){
                    p1.setNom(n);
                    p1.setPrenom(p);
                }

            }
        }



    }
