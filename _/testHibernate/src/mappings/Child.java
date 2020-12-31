package mappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "child", schema = "public")
public class Child implements java.io.Serializable {

	private int id;
	private Parent parent;
	private String childName;
	private String childSurname;
	private int childAge;

	public Child() {
	}

	public Child(int id, Parent parent, String childName, String childSurname,
			int childAge) {
		this.id = id;
		this.parent = parent;
		this.childName = childName;
		this.childSurname = childSurname;
		this.childAge = childAge;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fid", nullable = false)
	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Column(name = "child_name", nullable = false, length = 25)
	public String getChildName() {
		return this.childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	@Column(name = "child_surname", nullable = false, length = 25)
	public String getChildSurname() {
		return this.childSurname;
	}

	public void setChildSurname(String childSurname) {
		this.childSurname = childSurname;
	}

	@Column(name = "child_age", nullable = false)
	public int getChildAge() {
		return this.childAge;
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}
}

