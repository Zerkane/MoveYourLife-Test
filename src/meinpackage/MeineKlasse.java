package meinpackage;

import java.util.*;
import java.lang.*;

public class MeineKlasse
{
	private String articleText = null;
	
	public void setText(String articleText)
	{
		if ( articleText == null )
		{
			throw new java.lang.IllegalArgumentException();
		}
		this.articleText = articleText;
	}
	
	// honorar wird in cent als int ausgegeben, damit es keine Probleme mit 
	// Rundungsungenauigkeiten mit float/double gibt
	public int getHonorar()
	{
		if ( this.articleText == null || this.articleText.isEmpty() ) return 0;
		
		StringTokenizer tokens = new StringTokenizer( this.articleText );
		
		return (int)(tokens.countTokens() * 10);
	}
	
	public int countPictures()
	{
		if ( this.articleText == null || this.articleText.isEmpty() )
		{
			//java.lang.System.out.println("Kein Text");
			return 0;
		}
		
		int pictureCount = 0;
		
		StringTokenizer tokens = new StringTokenizer( this.articleText );
		while ( tokens.hasMoreTokens() )
		{
			//java.lang.System.out.println("next token: " + tokens.nextToken().toLowerCase() );
			if ( tokens.nextToken().toLowerCase().equals("picture") )
			{
				//java.lang.System.out.println("picture found");
				pictureCount++;
			}
		}
		
		return pictureCount;
	}
}