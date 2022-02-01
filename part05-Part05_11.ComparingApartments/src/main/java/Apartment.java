
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares < compared.squares){
            return false; // 
        } else {
            return true;
        }
    }
    
    public int priceDifference(Apartment compared){
        int diff = 0;
        diff = (this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare);
        if(diff < 0){
            return diff * -1;
        } else {
            return diff;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return (this.squares * this.pricePerSquare > compared.squares * compared.pricePerSquare);
    }

}
