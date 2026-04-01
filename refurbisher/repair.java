// author: kyle johnson

public class repair {

    private char operation = '0';
    private unit machine = null;
    private ArrayList<unit> used_parts = new ArrayList<unit>();
    private ArrayList<unit> new_parts = new ArrayList<unit>();


	public repair(char operation, unit machine) {
		this.operation = operation;
		this.machine = machine;
	}

	public unit get_used_parts() {
		return used_parts;
	}
	public unit get_new_parts() {
		return new_parts;
	}

	public void add_damaged_part(unit damaged) {
		used_parts.add(damaged);
	}
}
