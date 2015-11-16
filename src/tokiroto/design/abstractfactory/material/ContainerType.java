/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.material;

/**
 * Containers ContainerType
 * @author Tokiroto
 */
public class ContainerType implements IMaterial {
    public static final int CUP = 0;
    public static final int BUCKET = 1;
    public static final int PLATE = 2;
    
    private final int type;
    
    public ContainerType(int type) {
        this.type = type;
    }
    
    /**
     * Converts type to a string representation
     * @return 
     */
    @Override
    public String toString() {
        switch(type) {
            case ContainerType.CUP:
                return "cup";
            case ContainerType.BUCKET:
                return "bucket";
            case ContainerType.PLATE:
                return "plate";
            default:
                return "unknown type of the container";                
        }
    }    
    
    @Override
    public int getType() {
        return this.type;
    }
}
