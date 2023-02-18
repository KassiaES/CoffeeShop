package entity;

public class CoffeShop {

    private String name;
    private String adress;
    private String phone;
    private int maximumCapacity;
    private int currentcapacity;
    private boolean open;
    private boolean clean;
    private boolean stockFull;

    public CoffeShop(String name, String adress, String phone, int maximumCapacity) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.maximumCapacity = maximumCapacity;
        this.open = false;
        this.currentcapacity = 0;
        this.clean = true;
        this.stockFull = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getCurrentcapacity() {
        return currentcapacity;
    }

    public void setCurrentcapacity(int currentcapacity) {
        this.currentcapacity = currentcapacity;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isStockFull() {
        return stockFull;
    }

    public void setStockFull(boolean stockFull) {
        this.stockFull = stockFull;
    }

    @Override
    public String toString() {
        return "CoffeShop{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", maximumCapacity=" + maximumCapacity +
                ", currentcapacity=" + currentcapacity +
                ", open=" + open +
                ", clean=" + clean +
                ", stockFull=" + stockFull +
                '}';
    }
}
