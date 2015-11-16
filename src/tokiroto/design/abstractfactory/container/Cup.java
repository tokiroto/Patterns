/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.container;

import abstractiontraining.liquid.ILiquid;
import abstractiontraining.material.ContainerType;
import abstractiontraining.material.IMaterial;
import abstractiontraining.material.Material;

/**
 *
 * @author Tokiroto
 */
public class Cup extends AContainer {
    boolean isTested = false;
    
    public Cup() {
        this.type = new ContainerType(ContainerType.CUP);
        this.material = new Material(Material.CERAMIC);
        this.capacity = 0.33f;
        System.out.println("Cup was created !");
    }
    
    public Cup(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public int fillIn(ILiquid liquid) {
        if (this.liquid != null && this.liquid.getType() != liquid.getType()) {
            this.liquid = liquid;
            isTested = false;
        }else{
            this.liquid = liquid;
        }
        if (!isTested) {
            super.examine();
            isTested = true;
        }
        liquid.flow(null, this);
        return getLevel();
    }

    @Override
    public int pourOut() {
        liquid.flow(this, null);
        return getLevel();
    }
    
    @Override
    public int getLevel() {
        return (int) ((level / capacity) * 100);
    }

    @Override
    public int getType() {
        return type.getType();
    }

    @Override
    public float getCapacity() {
        return capacity;
    }
    
    @Override
    public void increaseLevel() {
        if (health > 0) {
            if (level >= 0 && level < capacity) {
                level += 0.05f;
            }else{
                System.out.println("Cup is full and " + liquid.toString() + " is pouring out!");
            }
        }
        
        if (level > capacity) {
            level = capacity;
        }
    }
    
    @Override
    public void decreaseLevel() {
        if (level >= 0) {
            level -= 0.05f;
        }
        if (level < 0) {
            level = 0;
            System.out.println("Cup is empty !");
        }
    }
    
    @Override
    public IMaterial getMaterial() {
        return material;
    }
    
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void makeDamage(int damage) {
        if (health > 0 && !this.liquid.isSafe(this)) {
           health -= damage; 
        }else{
            if (health < 0) {
                super.result();
            }            
        }    
    }
    
    @Override
    public String toString() {
        return type.toString();
    }

}
