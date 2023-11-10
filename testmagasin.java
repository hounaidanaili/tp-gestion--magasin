public class testmagasin {

    public static void main(String[] args) {

        produit p1=new produit(1021,"lait","delice",1.200);
        produit p2=new produit(2510,"yaourt","vitalait",1.600);
        produit p3=new produit(3250,"tomate","sicam",1.200);
        magasin mgs=new magasin(12,"sidibouzid",20);
        mgs.ajouter(p1);
        mgs.ajouter(p2);
        mgs.ajouter(p3);
        mgs.affiche();
        System.out.println("le magasin numero  "+ mgs.numero+" comporte "+mgs.nbrproduit+" produits ");






    }
}
