package it.deiudi.www.util.file.importer;

import java.util.Collection;

public abstract interface RowExtractor
{
  public abstract Collection<Object> getRawRows()
    throws Exception;

  public abstract void setSource(String paramString);

  public abstract void init()
    throws Exception;
}

/* Location:           /Users/ignazio/projects/einvoice-integration/trunk/target/ares118/WEB-INF/lib/importer-0.0.1-SNAPSHOT.jar
 * Qualified Name:     it.katalys.www.util.file.importer.RowExtractor
 * JD-Core Version:    0.6.0
 */