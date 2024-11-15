//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            Filiere f = new Filiere("UIT") ;
            f.AjouterProf("N_prof1","P_prof1");
            f.AjouterProf("N_prof2","P_prof2");
            f.AjouterProf("N_prof3","P_prof3");
            f.AjouterProf("N_prof4","P_prof4");
            f.AfficherProf();
            System.out.println("----------------------------------------------------");
            f.SupprimerProf("N_prof1");
            f.AfficherProf();
            System.out.println("----------------------------------------------------");
            f.ChercherProf("N_prof2");
            System.out.println("----------------------------------------------------");
            f.ModifierProf("Mohammed","Ali","N_prof2");
            f.AfficherProf();

        }
    }