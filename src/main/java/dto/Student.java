package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int std_id;
	private String std_name;
	private String std_branch;

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public String getStd_branch() {
		return std_branch;
	}

	public void setStd_branch(String std_branch) {
		this.std_branch = std_branch;
	}
}
