/**
 * Copyright 01.08.2012 Alex Vikulov (vikuloff@gmail.com)

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.stockchart.points;

/**
 * @author alexv
 *
 */
public class LinePoint extends AbstractPoint
{
	public LinePoint() 
	{
		super(1);
	}
	
	public LinePoint(double v)
	{
		super(new double[] { v });
	}
	
	public double getValue() 
	{
		return super.getValueAt(0);
	}

	public void setValue(double v) 
	{
		super.setValueAt(0, v);
	}
}
