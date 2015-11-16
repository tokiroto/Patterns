/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining;

import abstractiontraining.container.IContainer;
import abstractiontraining.liquid.ILiquid;
import abstractiontraining.material.ContainerType;
import abstractiontraining.material.LiquidType;

/**
 * Simple analogies of containers and liquids
 * Using of AbstractFactory pattern
 * 
 * @author Tokiroto
 */
public class AbstractionTraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory contrainerFactory = FactoryProducer.getFactory(AbstractFactory.CONTAINER);
        AbstractFactory liquidFactory = FactoryProducer.getFactory(AbstractFactory.LIQUID);
        IContainer cup = contrainerFactory.getContainer(ContainerType.CUP);
        IContainer bucket = contrainerFactory.getContainer(ContainerType.BUCKET);
        ILiquid water = liquidFactory.getLiquid(LiquidType.WATER);
        ILiquid lava = liquidFactory.getLiquid(LiquidType.LAVA);
        System.out.println("\n---------------------------------------------------\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("Liquid level : " + bucket.fillIn(lava));
        }
        System.out.println("\n---------------------------------------------------\n");
    }
    
}
