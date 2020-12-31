/**
 * 
 */
package register;

/**
 * @author Anghel Leonard
 *
 */
public class PersonBean {
	private java.lang.String personName;
	private int personAge;
	private register.PhoneNumber personPhone;
	private java.util.Date personBirthDate;

	public PersonBean() {
	}

	public java.lang.String getPersonName() {
		return personName;
	}

	public void setPersonName(java.lang.String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public register.PhoneNumber getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(register.PhoneNumber personPhone) {
		this.personPhone = personPhone;
	}

	public java.util.Date getPersonBirthDate() {
		return personBirthDate;
	}

	public void setPersonBirthDate(java.util.Date personBirthDate) {
		this.personBirthDate = personBirthDate;
	}
}
