/*
 * Copyright (C) 2015 Tokiroto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tokiroto.design.observer;

/**
 * This application demonstrates an example of Observer pattern.
 * 
 * @author Tokiroto
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int newState = 10;
        Subject subject = new Subject();
        
        new BinaryObserver(subject);
        new OctalObserver(subject);
        
        System.out.println("First state : " + newState);
        subject.setState(newState);
        
        newState -= 7;
        System.out.println("Second state : " + newState);
        subject.setState(newState);
    }
}
