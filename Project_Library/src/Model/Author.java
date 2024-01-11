package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Author {

private String firstName;
private String lastName;
public Author(String firstName, String lastName) {
	
	this.firstName = firstName;
	this.lastName =lastName;
}
public String getFirstName() {
	return this.firstName;
}
public void setFirstName(String firstName) {
	this.firstName=firstName;
}
public String getLastName() {
	return this.lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName ;
}
@Override
public String toString() {
	return "Autor FirstName: " + firstName + " " + " Autor LastName: " + lastName;
}

}
