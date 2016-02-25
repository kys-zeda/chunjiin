/*
* Released under the MIT license
* Copyright (c) 2014 KimYs(a.k.a ZeDA)
* http://blog.naver.com/irineu2
* 
Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
*/

package com.zeda.chunjiin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Chunjiinactivity extends Activity
{
	private Chunjiin chunjiin;
	private Button btn[];
	private EditText et;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chunjiin);
		
		et = (EditText)findViewById(R.id.chunjiin_text);
		btn = new Button[13];
		btn[0] = (Button)findViewById(R.id.chunjiin_button0);
		btn[1] = (Button)findViewById(R.id.chunjiin_button1);
		btn[2] = (Button)findViewById(R.id.chunjiin_button2);
		btn[3] = (Button)findViewById(R.id.chunjiin_button3);
		btn[4] = (Button)findViewById(R.id.chunjiin_button4);
		btn[5] = (Button)findViewById(R.id.chunjiin_button5);
		btn[6] = (Button)findViewById(R.id.chunjiin_button6);
		btn[7] = (Button)findViewById(R.id.chunjiin_button7);
		btn[8] = (Button)findViewById(R.id.chunjiin_button8);
		btn[9] = (Button)findViewById(R.id.chunjiin_button9);
		btn[10] = (Button)findViewById(R.id.chunjiin_buttonex1);
		btn[11] = (Button)findViewById(R.id.chunjiin_buttonex2);
		btn[12] = (Button)findViewById(R.id.chunjiin_buttonex3);
		
		chunjiin = new Chunjiin(et, btn);
	}
}
