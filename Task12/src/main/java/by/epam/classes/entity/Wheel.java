package by.epam.classes.entity;

public class Wheel {
	private int diameter;
	private int width;
	private int proportionality;

	public Wheel(int diameter, int width, int proportionality) {
		this.diameter = diameter;
		this.width = width;
		this.proportionality = proportionality;
	}

	public Wheel() {
		
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getProportionality() {
		return proportionality;
	}

	public void setProportionality(int proportionality) {
		this.proportionality = proportionality;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + proportionality;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter)
			return false;
		if (proportionality != other.proportionality)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Diameter: " + diameter + "\"" + "\nWidth: " + width+ " mm" + "\nProportionality: " + proportionality + " %";
	}
}
