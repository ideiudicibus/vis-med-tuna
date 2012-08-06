package it.deiudi.www.medtuna.excel.model;

public class Options{

public Options(String[] tags,String theme,String description){
	this.tags=tags;
	this.theme=theme;
	this.description=description;
}
private	String theme;
private	String description;
private	String[] tags;


public String[] getTags() {
	return tags;
}
public void setTags(String[] tags) {
	this.tags = tags;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

	
}