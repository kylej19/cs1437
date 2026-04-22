
public class CurvedActivity extends GradedActivity {
	private double rawScore;
	private double percentage;

	public CurvedActivity(double percentage) {
		this.percentage = percentage;
		rawScore = 0.0;
	}

	@Override
	public void setScore(double score) {
		rawScore = score;
		super.setScore(rawScore * percentage);
	}

	public double getRawScore() {
		return rawScore;
	}

	public double getPercentage() {
		return percentage;
	}
}
