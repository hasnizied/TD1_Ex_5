    public class Professeur {
        //Attribut pour professeur
        private String nom;
        private String prenom;

        //Propriete et methode d'acces  au professeur
        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public String getPrenom() {
            return prenom;
        }
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

       // constructeur par defaut]
        public Professeur()
        {

        }
        public Professeur(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        //Cette fonction retourne les information d'un professeur
        @Override
        public String toString() {
            return "Professeur [nom=" + nom + ", prenom=" + prenom + "]";
        }
    }
