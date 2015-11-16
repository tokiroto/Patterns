/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.container;

import abstractiontraining.liquid.ILiquid;
import abstractiontraining.material.IMaterial;
import abstractiontraining.material.IObject;

/**
 *
 * @author Tokiroto
 */
public interface IContainer extends IObject {
    int fillIn(ILiquid liquid);
    IMaterial getMaterial();
    void increaseLevel();
    void decreaseLevel();
    int pourOut();
    int getType();
    int getLevel();
    float getCapacity();
}
