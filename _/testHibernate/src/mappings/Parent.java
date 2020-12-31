package mappings;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "parent", schema = "public")
public class Parent implements java.io.Serializable {

	private int id;
	private String parentName;
	private String parentSurname;
	private Set<Child> childs = new HashSet<Child>(0);

	public Parent() {
	}

	public Parent(int id, String parentName, String parentSurname) {
		this.id = id;
		this.parentName = parentName;
		this.parentSurname = parentSurname;
	}

	public Parent(int id, String parentName, String parentSurname,
			Set<Child> childs) {
		this.id = id;
		this.parentName = parentName;
		this.parentSurname = parentSurname;
		this.childs = childs;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "parent_name", nullable = false, length = 25)
	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Column(name = "parent_surname", nullable = false, length = 25)
	public String getParentSurname() {
		return this.parentSurname;
	}

	public void setParentSurname(String parentSurname) {
		this.parentSurname = parentSurname;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent")
	public Set<Child> getChilds() {
		return this.childs;
	}

	public void setChilds(Set<Child> childs) {
		this.childs = childs;
	}
}
