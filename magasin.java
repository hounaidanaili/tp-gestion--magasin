public class magasin {


    public int ident;
    public  String adrs;
    public int cap=50;
    public produit[] produits=new produit[50] ;
    int nbrproduit=0;
    public  int numero;
    public static int cpt;






    public magasin(int ident, String adrs, int cap) {
        this.ident = ident;
        this.adrs=adrs;
        this.cap=cap;
        numero=cpt;
        cpt++;
    }

    public void ajouter(produit pds){

        if(nbrproduit<=cap){
        produits[nbrproduit]=pds;
        nbrproduit++;}

        else
            System.out.println(" impbossible");


    }
    public void affiche(){
int i;
        System.out.println(ident+"/"+adrs+"/"+cap);
        for (i=0;i<nbrproduit;i++)
          produits[i].affichep();


    }




}
