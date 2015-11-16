/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.liquid;

import abstractiontraining.material.LiquidType;
import abstractiontraining.container.IContainer;

/**
 *
 * @author Tokiroto
 */
public class Water extends ALiquid implements ILiquid {

    public Water() {
        this.type = new LiquidType(LiquidType.WATER);
        System.out.println("Instance of water was created !");
    }
    
    @Override
    public int getType() {
        return type.getType();
    }

    @Override
    public void flow(IContainer from, IContainer to) {
        if (from != null) {
            from.decreaseLevel();
        }
        if (to != null) {
            to.increaseLevel();
        }
    }

    @Override
    public String toString() {
        return type.toString();
    }

    @Override
    public boolean isSafe(IContainer to) {
        return true;
    }

    @Override
    public void makeDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
