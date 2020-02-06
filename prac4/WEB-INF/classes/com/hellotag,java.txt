package com;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class hellotag extends SimpleTagSupport
{
	public void doTag() throws JspException,IOException
	{
		JspWriter out = getJspContext().getOut();
		out.println("hello custom tag");
	}
}