/*
Author: Roni Alon 315565176
Owner class reflect an owner of an animal , its attributes and methods associated with it.
 */

public class Owner {
    private long phoneNumber;
    private String name;

    //constructor
    public Owner(String name,long phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    //copy constructor
    public Owner(Owner other){
        this.name=other.name;
        this.phoneNumber= other.phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(long number) {
        this.phoneNumber=number;
    }

    //check if this owner and other are equals
    public boolean equals(Owner other){
        return this.name.equals(other.name) && this.phoneNumber==other.phoneNumber;
    }

    //prints a string of owner
    public String toString(){
        return " name: "+this.name+ " number: "+this.phoneNumber;
    }


}
