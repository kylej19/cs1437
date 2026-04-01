// author: kyle j

public class unit {

    private int serial = 0;
    private char type = '0';
    private String model = null;
    private boolean operational = false;

    // CONSTRUCTORS
    public unit(int serial, char type, String model, boolean operational) {

	this.serial = serial;
	this.type = type;
	this.model = model;
	this.operational = operational;

    }

    // ACCESSORS
    public int getSerial() {
	return serial;
    }
    public char getType() {
	return type;
    }
    public String getModel() {
	return model;
    }
    public boolean getOperational() {
	return operational;
    }

    // MUTATORS
    public void setSerial(int serial) {
	this.serial = serial;
    }
    public void setType(char type) {
	this.type = type;
    }
    public void setModel(String model) {
	this.model = model;
    }
    public void setOperational(boolean operational) {
	this.operational = operational;
    }

}
