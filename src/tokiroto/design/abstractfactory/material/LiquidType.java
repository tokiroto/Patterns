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
public class LiquidType implements IMaterial {
    public static final int LAVA = 0;
    public static final int WATER = 1;
    
    private final int type;
    
    public LiquidType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        switch(type) {
            case LiquidType.LAVA:
                return "lava";
            case LiquidType.WATER:
                return "water";
            default:
                return "unknown type of liquid";
        }
    }    
    
    @Override
    public int getType() {
        return this.type;
    }
}
