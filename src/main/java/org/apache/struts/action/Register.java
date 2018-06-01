package org.apache.struts.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.struts.model.Person;
import org.apache.struts.model.State;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Person personBean;

	private String[] sports = { "Hutt-Ball", "Aqua-Poney"};

	private String[] genders = { "male", "female", "other", "not sure" };

	private List<State> states;

	private String[] carModelsAvailable = { "Ford", "Chrysler", "Toyota", "Nissan" };

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

	public String[] getSports() {
		return sports;
	}

	public void setSports(String[] sports) {
		this.sports = sports;
	}

	public String[] getGenders() {
		return genders;
	}

	public void setGenders(String[] genders) {
		this.genders = genders;
	}

	public List<State> getStates() {
		states = new ArrayList<State>();
		states.add( new State("FR", "France") );
		states.add( new State("US", "United States") );
		states.add( new State("D", "Germany") );
		states.add( new State("I", "Italy") );
		states.add( new State("GB", "Great Britain") );
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public String[] getCarModelsAvailable() {
		return carModelsAvailable;
	}

	public void setCarModelsAvailable(String[] carModelsAvailable) {
		this.carModelsAvailable = carModelsAvailable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String execute() throws Exception {
		// call Service class to store personBean's state in database

		return SUCCESS;
	}

	public void validate() {
		if (personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "First name is required.");
		}

		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "Email is required.");
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", "Age is required and must be 18 or older");
		}
	}

}
