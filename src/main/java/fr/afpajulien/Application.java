package fr.afpajulien;


public class Application {

    public static void main(String[] args) {


        //Utils.updateAppartPrice(10, 370);

        //Utils.listAppart();
        //Utils.createAppart(4, 750, 75, "00001");
        //System.out.println("------------");
        Utils.listAppart();
        Utils.deleteAppartById(11);
        System.out.println("------------");
        Utils.listAppart();


    }


}
