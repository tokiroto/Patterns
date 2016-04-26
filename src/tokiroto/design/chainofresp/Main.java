/*
    This file is part of AbstractFactory Design Pattern.

    Foobar is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with AbstractFactory Design Pattern.  If not, see <http://www.gnu.org/licenses/>.
 */
package tokiroto.design.chainofresp;

/**
 * This application demonstrates an example of Chain of Responsibility pattern.
 * We have few logger with priority. Then We chained them and show a message. 
 * That message due priority can be able to be shown or just to be passed to an another logger.
 * @author Tokiroto
 */
public class Main {
    
    private static AbstractLogger getChain() {
        AbstractLogger consoleLogger = new ConsoleLogger();
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new FileLogger();
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        
        return errorLogger;
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChain();
        
        chainOfLoggers.logMessage(AbstractLogger.ERROR, "This is a error level infomation.");
        
        chainOfLoggers.logMessage(AbstractLogger.INFO, "This is an info information.");
        
        chainOfLoggers.logMessage(AbstractLogger.DEBUG, "This is a debug level infomation.");
//        
//        chainOfLoggers.logMessage(AbstractLogger.INFO, "This is final info log.");
    }
}
