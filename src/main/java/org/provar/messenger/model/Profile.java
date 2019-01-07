package org.provar.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {

	private long id;
    private String role;
    private String firstName;
    private String lastName;
    private Date created;
    
    public Profile() {
    	
    }
    
	public Profile(long id, String firstName, String lastName,String role) {
		this.id = id;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String profileName) {
		this.role = profileName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
    
    
}
