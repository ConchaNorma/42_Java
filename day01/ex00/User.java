package day01.ex00;

public class User {

    private static Integer _idTemp = 0;
    private String _name;
    private Integer _id;
    private Integer _balance;

    public  User(String name, Integer balance){
        if (setName(name) && setBalance(balance)) {
            this._id = ++_idTemp;
            this._name = name;
            this._balance = balance;
        } else {
            System.err.println("Cannot create User due to Incorrect Name or Balance!");
        }
        System.out.println("User: " + name + " ID: " + _id + "created with balance: " + balance);
    }

    public boolean setName(String name){
        if (name.length() > 0){
            this._name = name;
            return true;
        } else
        System.err.println("Incorrect name!");
        return false;
    }

    public boolean setBalance(Integer balance){
        if (balance >= 0){
            this._balance = balance;
            return true;
        } else
        System.err.println("Incorrect balance!");
        return false;
    }

    public Integer getId(){
        return this._id;
    }

    public String getName(){
        return this._name;
    }

    public Integer getBalance(){
        return this._balance;
    }
}
