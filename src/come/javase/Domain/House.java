package come.javase.Domain;

public class House {
    private int id;
    private String owner;
    private String phone;
    private String address;
    private double rent;
    private String status;

    public House(int id, String owner, String phone, String address, double rent, String status) {
        this.id = id;
        this.owner = owner;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", rent=" + rent +
                ", status='" + status;
    }
}
