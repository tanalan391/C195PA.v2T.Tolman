package model;

public class customers {
    private int ID;
    private String name;
    private String address;
    private int postalCode;
    private String phoneNumber;

    public customers(int ID, String name, String address, int postalCode, String phoneNumber){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    public int getID(){return ID;}
    public void setID(int ID){this.ID = ID;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}
    public int getPostalCode(){return postalCode;}
    public void setPostalCode(int postalCode){this.postalCode = postalCode;}
    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}




}
