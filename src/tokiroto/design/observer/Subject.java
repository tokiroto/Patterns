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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tokiroto
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int newState) {
        this.state = newState;
        notifyAllObservers();
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
