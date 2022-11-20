public class Phone extends Product{
    private static Integer phoneID=1;
    private int printID=0;
    private Integer batteryPower;
    private String color;
    private Integer camera;

    public Phone(Integer price, Integer discount, Integer stock, String name, String brandName, Integer RAM, Integer SSD, Double screen, Integer batteryPower, String color, Integer camera) {
        super(price, discount, stock, name, brandName, RAM, SSD, screen);
        this.batteryPower = batteryPower;
        this.color = color;
        this.camera = camera;
        this.setPrintID(getPhoneID());
        phoneID++;
    }

    public int getPrintID() {
        return printID;
    }

    public void setPrintID(int printID) {
        this.printID = printID;
    }

    public static Integer getPhoneID() {
        return phoneID;
    }

    public static void setPhoneID(Integer phoneID) {
        Phone.phoneID = phoneID;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
