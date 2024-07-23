// Encapuslation is the concept of restricting access to certain parts of an object.
// Data hiding for security perpose.

public class Main{
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop();
        l1.setPrice(1000);
        System.out.println(l1.getPrice());
    }
}

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        //validation for price
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("You cannot set the price");
        } else {
            this.price = price;
        }
    }

    public int getPrice(){
        return price;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }

    public int getRam(){
        return ram;
    }
}