/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining.liquid;

import abstractiontraining.container.IContainer;
import abstractiontraining.material.IObject;

/**
 *
 * @author Tokiroto
 */
public interface ILiquid extends IObject {
    int getType();
    void flow(IContainer from, IContainer to);
    boolean isSafe(IContainer to);
}
