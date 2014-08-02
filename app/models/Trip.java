package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;


@Entity
public class Trip extends Model {

	@Id
	public Long Id;

	public String title;
	public String locations;
	public String description;
	public Date startDate;
	public Date endDate;

	@ManyToMany
	public List<User>members = new ArrayList<User>();



	public String toString() {
		return title;
	}
}