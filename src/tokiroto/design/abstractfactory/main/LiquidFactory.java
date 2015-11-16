/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining;

import abstractiontraining.container.IContainer;
import abstractiontraining.liquid.ILiquid;
import abstractiontraining.liquid.Lava;
import abstractiontraining.liquid.Water;
import abstractiontraining.material.LiquidType;

/**
 *
 * @author Tokiroto
 */
public class LiquidFactory extends AbstractFactory {

    @Override
    protected ILiquid getLiquid(int type) {
        switch(type) {
            case LiquidType.LAVA:
                return new Lava();
            case LiquidType.WATER:
                return new Water();
            default:
                return null;
        }
    }

    @Override
    protected IContainer getContainer(int type) {
        return null;
    }
    
}
