/*
 * Mavuno: A Hadoop-Based Text Mining Toolkit
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package edu.isi.mavuno.util;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

/**
 * @author metzler
 *
 */
public class TextLongPairWritable extends PairWritable<Text, LongWritable> {

	public TextLongPairWritable() {
		super(new Text(), new LongWritable());
	}
	
}
