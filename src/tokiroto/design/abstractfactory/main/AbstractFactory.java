/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining;

import abstractiontraining.liquid.ILiquid;
import abstractiontraining.container.IContainer;

/**
 *
 * @author Tokiroto
 */
public abstract class AbstractFactory {
    
    public static final int LIQUID = 0;
    public static final int CONTAINER = 1;
    
    protected abstract ILiquid getLiquid(int type);
    protected abstract IContainer getContainer(int type);
}
