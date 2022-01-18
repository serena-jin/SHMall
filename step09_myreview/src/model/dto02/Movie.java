package model.dto02;

public class Movie {
	private String mvName;
	private String mvGenre;
	private String mvCountry;
	private double mvRate;
	private int mvDuration;
	
	
	public Movie() {
		super();
	}


	public Movie(String mvName, String mvGenre, String mvCountry, double mvRate, int mvDuration) {
		super();
		this.mvName = mvName;
		this.mvGenre = mvGenre;
		this.mvCountry = mvCountry;
		this.mvRate = mvRate;
		this.mvDuration = mvDuration;
	}


	public String getMvName() {
		return mvName;
	}


	public void setMvName(String mvName) {
		this.mvName = mvName;
	}


	public String getMvGenre() {
		return mvGenre;
	}


	public void setMvGenre(String mvGenre) {
		this.mvGenre = mvGenre;
	}


	public String getMvContry() {
		return mvCountry;
	}


	public void setMvContry(String mvCountry) {
		this.mvCountry = mvCountry;
	}


	public double getMvRate() {
		return mvRate;
	}


	public void setMvRate(double mvRate) {
		this.mvRate = mvRate;
	}


	public int getMvDuration() {
		return mvDuration;
	}


	public void setMvDuration(int mvDuration) {
		this.mvDuration = mvDuration;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[mvName=");
		builder.append(mvName);
		builder.append(", mvGenre=");
		builder.append(mvGenre);
		builder.append(", mvCountry=");
		builder.append(mvCountry);
		builder.append(", mvRate=");
		builder.append(mvRate);
		builder.append(", mvDuration=");
		builder.append(mvDuration);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	



}
