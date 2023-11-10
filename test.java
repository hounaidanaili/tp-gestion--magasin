public class test {
    public static void main(String[] args) {





    produit p1=new produit();
    produit p2=new produit(1021,"lait","delice");
    produit p3=new produit(2510,"yaourt","vitalait");
    produit p4=new produit(3250,"tomate","sicam",1.200);
    p1.affiche();
    p2.affiche();
    p3.affiche();
    p4.affiche();
    p2.setPrix(0.700);
    p2.affiche();
    p1.setIdent(1234);
    p1.setLibel("fourmage");
    p1.setMarque("vitalait");
    p1.setPrix(1.200);
    p3.setPrix(1.500);
    p1.affiche();
    p2.affiche();
    p3.affiche();
    p4.affiche();
        System.out.println("affichage avec methode toString");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        date d1=new date(10,11,2023);
        date d2=new date(12,11,2023);
        p1.setDatexp(d1);
        p2.setDatexp(d2);
        p3.setDatexp(new date(15,12,2023));
        p4.setDatexp(new date(31,12,2023));










} }
