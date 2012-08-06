package it.deiudi.www.medtuna.excel.model;

public class TimemapDataItem implements java.io.Serializable{

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	private static final long serialVersionUID = 1L;
	
	
	
	private String start;
	private String end;
	private Point point;
	private String title;
	private Options options;
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}
	
	
	

	
}
