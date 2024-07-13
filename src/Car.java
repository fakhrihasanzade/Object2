public class Car {

    private String marka;
    private String model;
    private String color;

    public Car() {

    }

   /* public Car(String marka, String model, String color){
        this.model=model;
        this.marka=marka;
        this.color=color;
    }*/

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarka() {
        return this.marka;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public void getCarObjectData() {

        System.out.println("Daxil edilen masin xusiyyetleri:\n Masin: " + getMarka() + "\n Model: " +
                getModel() + "\n Reng: " + getColor());

    }
}
