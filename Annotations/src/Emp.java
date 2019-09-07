import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Emp 
{
	@Column(name="empnname")
String ename;
@Id
int eid;
@Column(name="email1")
String email;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
