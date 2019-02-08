/*
 * GNU GPL v3 License
 *
 * Copyright 2016 Giovanna Dalpiaz
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

package shalloWater1D;

import shallowWater1D.*;
import org.junit.Test;

/**
 * Test the {@link TestRichards1DSolver} module.
 * 
 * @author Giovanna Dalpiaz
 */

public class Test_shalloWater1D {
	
	
	@Test
	public void Test() throws Exception {
		
		MainSW1D test_SW1D = new MainSW1D();
		test_SW1D.a = "cippaaaaaa";
		
		test_SW1D.process();
	}
}




