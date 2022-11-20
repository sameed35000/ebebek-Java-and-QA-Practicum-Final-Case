public abstract class Product {
    private Integer price;
    private Integer discount;
    private Integer stock;
    private String name;
    private String brandName;
    private Integer RAM;
    private Integer SSD;
    private Double screen;

    public Product(Integer price, Integer discount, Integer stock, String name, String brandName, Integer RAM, Integer SSD, Double screen) {
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brandName = brandName;
        this.RAM = RAM;
        this.SSD = SSD;
        this.screen = screen;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getSSD() {
        return SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Double getScreen() {
        return screen;
    }

    public void setScreen(Double screen) {
        this.screen = screen;
    }
}
