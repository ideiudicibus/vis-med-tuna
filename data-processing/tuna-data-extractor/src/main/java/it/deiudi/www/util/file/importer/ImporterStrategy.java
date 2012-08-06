package it.deiudi.www.util.file.importer;

public abstract interface ImporterStrategy
{
  public abstract String getAccessStrategy();

  public abstract String getImportStrategyExtraInfo();

  public abstract void setImportStrategyExtraInfo(String paramString);
}

/* Location:           /Users/ignazio/projects/einvoice-integration/trunk/target/ares118/WEB-INF/lib/importer-0.0.1-SNAPSHOT.jar
 * Qualified Name:     it.katalys.www.util.file.importer.ImporterStrategy
 * JD-Core Version:    0.6.0
 */