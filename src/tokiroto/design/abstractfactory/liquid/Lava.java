/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.liquid;

import abstractiontraining.material.LiquidType;
import abstractiontraining.material.Material;
import abstractiontraining.container.IContainer;

/**
 *
 * @author Tokiroto
 */
public class Lava extends ALiquid implements ILiquid {

    public Lava() {
        this.type = new LiquidType(LiquidType.LAVA);
        this.damage = 39;
        System.out.println("Instace of lava was created !");
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
            to.makeDamage(this.damage);
            to.increaseLevel();
        }
    }
    
    @Override
    public String toString() {
        return type.toString();
    }

    @Override
    public boolean isSafe(IContainer to) {
        if (to != null) {
            switch(to.getMaterial().getType()) {
                case Material.TITAN:
                    return true;
            }
        }
        return false;
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
