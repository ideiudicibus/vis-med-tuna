package it.deiudi.www.util.file.importer;

import java.io.File;
import java.io.InputStream;

public abstract interface FileImporter
{
  public abstract File getInputFile();

  public abstract InputStream getInputStream();

  public abstract void setInputFile(File paramFile);

  public abstract void importFile(File paramFile)
    throws Exception;

  public abstract void importFile(InputStream paramInputStream)
    throws Exception;

public abstract void setInputStream(InputStream is);
}

/* Location:           /Users/ignazio/projects/einvoice-integration/trunk/target/ares118/WEB-INF/lib/importer-0.0.1-SNAPSHOT.jar
 * Qualified Name:     it.katalys.www.util.file.importer.FileImporter
 * JD-Core Version:    0.6.0
 */