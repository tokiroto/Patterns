/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.material;

/**
 *
 * @author Tokiroto
 */
public class Material implements IMaterial {

    public static final int STEEL = 0;
    public static final int CERAMIC = 1;
    public static final int TITAN = 2;
    public static final int PLASTIC = 3;
    
    private final int type;
    
    public Material(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        switch(type){
            case STEEL:
                return "steel";
            case CERAMIC:
                return "ceramic";
            case TITAN:
                return "titan";
            case PLASTIC:
                return "plastic";
            default:
                return "unknown material type";
        }
    }
    
    @Override
    public int getType() {
        return this.type;
    }
        
}
