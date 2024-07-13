public class Main {
    public static void main(String[] args) {

        //Bir Car clasi yaradin ve marka model reng ekrana yazdiran method yazin.

        String marka="BMW";
        String model="F10";
        String color="Silver";

        Car masin=new Car();

        masin.setMarka(marka);
        masin.setModel(model);
        masin.setColor(color);

        masin.getCarObjectData();

    }

}