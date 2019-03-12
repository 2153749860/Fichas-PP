
package pp_fp06.PizzaRestaurant.enums;

public enum PizzaSize {
    SMALL, MEDIUM, BIG;
    
    public static String PizzaSizeToString(PizzaSize size){
        switch(size){
            case SMALL:
                return "This Pizza is small.";
            case MEDIUM:
                return "This Pizza is medium.";
            case BIG:
                return "This Pizza is big.";
            default:
                return "The size is not valid";
        }
    }
}


