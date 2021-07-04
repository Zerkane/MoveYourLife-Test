package meinpackage;

import junit.framework.TestCase;

public class MeineKlasseTest extends TestCase
{
  MeineKlasse meineKlasse1;

  @Override public void setUp() throws Exception
  {
    meineKlasse1 = new MeineKlasse();
  }

  @Override public void tearDown() throws Exception
  {
    meineKlasse1 = null;
  }

  public void testSetText()
  {
	  try {
		  meineKlasse1.setText( null );
		  fail("'null' ist nicht erlaubt");
	  }
	  catch( Exception ex ) {}
  }

  public void testTextHonorar()
  {
    meineKlasse1.setText( "Loram Ipsum Picture loram ipsum Picture loram ipsum loram ipsum loram ipsum loram ipsum" );
    assertTrue( "", 140 == meineKlasse1.getHonorar() );

    meineKlasse1.setText( "" );
    assertTrue( "", 0 == meineKlasse1.getHonorar() );

    meineKlasse1.setText( "Loram Ipsum Picture loram ipsum Picture" );
    assertTrue( "", 60 == meineKlasse1.getHonorar() );
  }

  public void testBilder()
  {
    meineKlasse1.setText( "Loram Ipsum Picture loram ipsum Picture" );

    assertTrue( "zwei Bilder im Beispieltext",
                2 == meineKlasse1.countPictures() );
  }
}