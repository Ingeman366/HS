package harrysaloon;

public class Customer {
    private String name;
    //private int sumTotalOfService;


    public void setname(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

   /* public void setSumTotalOfService(int sumTotalOfService){
        this.sumTotalOfService =sumTotalOfService;
    }
    public int getSumTotalOfService(){
        return sumTotalOfService;
    }*/


    Customer (String name){
        setname(name);
    }


}
