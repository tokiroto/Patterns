/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining;

import abstractiontraining.container.Bucket;
import abstractiontraining.container.Cup;
import abstractiontraining.container.IContainer;
import abstractiontraining.liquid.ILiquid;
import abstractiontraining.material.ContainerType;

/**
 *
 * @author Tokiroto
 */
public class ContainerFactory extends AbstractFactory {

    @Override
    protected ILiquid getLiquid(int type) {
        return null;
    }

    @Override
    protected IContainer getContainer(int type) {
        switch (type) {
            case ContainerType.BUCKET:
                return new Bucket();
            case ContainerType.CUP:
                return new Cup();
            default:
                return null;
        }
    }
    
}
