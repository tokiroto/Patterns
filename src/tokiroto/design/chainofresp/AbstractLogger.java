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

package tokiroto.design.chainofresp;

/**
 * AbstractLogger
 * @author Tokiroto
 */
public abstract class AbstractLogger {
    
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    
    protected int level;
    
    protected AbstractLogger nextLogger;
    
    /**
     * Assign a new logger into the chain
     * @param nextLogger 
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    
    /**
     * Log the message by priority level then go to the next available logger
     * @param level
     * @param message 
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (this.nextLogger != null) {
            this.nextLogger.logMessage(level, message);
        }
    }
    
    /**
     * Show the message
     * @param message 
     */
    protected abstract void write(String message);
}
