package entities;

import java.util.Date;
import java.util.Objects;

public class LogData {

	private String name;
	private Date moment;
	
	public LogData(String name, Date moment) {
		this.name = name;
		this.moment = moment;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogData other = (LogData) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
