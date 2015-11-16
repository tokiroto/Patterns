/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiontraining;

/**
 *
 * @author Tokiroto
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int type) {
        switch(type) {
            case AbstractFactory.CONTAINER:
                return new ContainerFactory();
            case AbstractFactory.LIQUID:
                return new LiquidFactory();
            default:
                return null;
        }
    }
}
