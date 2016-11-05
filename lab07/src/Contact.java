/**
 * CS180 - Lab 07 - Matrix
 *
 * modify method
 *
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */

public class Contact {
    private String name;
    private long number;
    private String address;

    public Contact(String name){
        this.name = name;
        this.number = 0;
        this.address = null;
    }
    public Contact(String name, long number){
        this.name = name;
        this.number = number;
        this.address = null;

    }
    public Contact(String name, long number, String address){
        this.name = name;
        this.number = number;
        this.address = address;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
    long getNumber(){
        return this.number;
    }
    void setNumber(long number){
        this.number = number;
    }
    String getAddress(){
        return this.address;
    }
    void setAddress(String address){
        this.address = address;
    }
    boolean equals(Contact contact){
        if(this.name.equals(contact.name))
            return true;
        return false;
    }
}
