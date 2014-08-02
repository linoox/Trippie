package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import play.db.ebean.Model;

import java.util.List;


@Entity
public class User extends Model {

	@Id
	public Long Id;

	public String firstName;
	public String lastName;
	public String email;
	public String cellNumber;

	@ManyToMany(mappedBy="members")
	public List<Trip> trips;

	public String toString() {
		return firstName+" "+lastName;
	}

}