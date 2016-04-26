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
 * File ( Debug ) logger implementation
 * @author Tokiroto
 */
public class FileLogger extends AbstractLogger {
    
    public FileLogger() {
        this.level = DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG Console::Logger: " + message);
    }
}
