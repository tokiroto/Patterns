/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.container;

import abstractiontraining.material.ContainerType;
import abstractiontraining.liquid.ILiquid;
import abstractiontraining.material.Material;
import com.sun.xml.internal.ws.util.StringUtils;

/**
 *
 * @author Tokiroto
 */
public abstract class AContainer implements IContainer {
    protected int health = 100;
    protected float capacity; // capacity of current container in ml (liters )
    protected Material material; // material of current container
    protected float level; // level of liquid inside of current container
    protected ILiquid liquid; // liquid type inside of current container
    protected ContainerType type; // type of current container
    
    protected void examine() {
        if (this.liquid.isSafe(this)) {
            System.out.println(StringUtils.capitalize(this.liquid.toString()) + " is safe to pour in " + this.toString() + " maden by " + this.material.toString());
        }else{
            System.out.println(StringUtils.capitalize(this.material.toString()) + " " 
                            + StringUtils.capitalize(this.toString()) 
                            + " is not safe to use with " + this.liquid.toString());
        }
        
    }
    
    protected void result() {
        health = 0;
        level = 0;
        System.out.println(StringUtils.capitalize(this.toString()) + " was destroyed by " + this.liquid.toString());
    }
}
