
package pp_fp06.PizzaRestaurant.enums;

public enum PizzaSize {
    /**
     * o tamanho da pizza pode ser "SMALL", "MEDIUM" OU "BIG"
     */
    SMALL, MEDIUM, BIG;
    
    public static String PizzaSizeToString(PizzaSize size){
        /**
         * dependendo do tamanho, é imprimido a mensagem correspondente na tela
         */
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


