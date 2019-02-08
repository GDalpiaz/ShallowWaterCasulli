/*
 * GNU GPL v3 License
 *
 * Copyright 2016 Marialaura Bancheri
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


package shallowWater1D;

//import java.util.HashMap;
import oms3.annotations.*;



@Description("Solve the Shallow Water equation for the 1D domain using Casulli method.")
@Documentation("")
@Author(name = "Giovanna Dalpiaz", contact = "giovanna.dalpiaz@gmail.com")
@Keywords("Hydrology, Shallow Water")
@Bibliography("Casulli (2010)")
//@Label(JGTConstants.HYDROGEOMORPHOLOGY)
//@Name("shortradbal")
//@Status(Status.CERTIFIED)
@License("General Public License Version 3 (GPLv3)")


public class MainSW1D {

	@Description("The hydraulic conductivity at saturation")
	@In 
	@Unit ("m/s")
	public String a=null;
	public String b=null;
	
	@Execute
	public void process() {
		System.out.println(a);
		System.out.println(b);
	}

	
	
}
