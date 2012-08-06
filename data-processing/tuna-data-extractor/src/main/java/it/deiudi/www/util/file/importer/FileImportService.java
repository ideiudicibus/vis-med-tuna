package it.deiudi.www.util.file.importer;

import java.util.Collection;

public abstract interface FileImportService
{
  public abstract void executeImport();

  public abstract Collection<Object> getContents();
}

/* Location:           /Users/ignazio/projects/einvoice-integration/trunk/target/ares118/WEB-INF/lib/importer-0.0.1-SNAPSHOT.jar
 * Qualified Name:     it.katalys.www.util.file.importer.FileImportService
 * JD-Core Version:    0.6.0
 */