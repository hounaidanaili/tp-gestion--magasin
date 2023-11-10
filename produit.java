
    public class produit {



        public int ident;
        public String libel;
        public String marque;
        public Double prix;

        public produit(int ident, String libel, String marque, Double prix) {
            this.ident = ident;
            this.libel = libel;
            this.marque = marque;
            this.prix = prix;
        }

        public void affichep() {
            System.out.println("Prosuit=[" + ident + "/" + libel + "/" + marque + "/" + prix + "]");

        }
    }
