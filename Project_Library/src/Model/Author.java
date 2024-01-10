package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Author {

private StringProperty firstName;
private StringProperty lastName;
public Author(String firstName, String lastName) {
	
	this.firstName = new SimpleStringProperty(firstName);
	this.lastName =new SimpleStringProperty(lastName);
}
public String getFirstName() {
	return (String)firstName.get();
}
public void setFirstName(String firstName) {
	this.firstName.set(firstName);;
}
public String getLastName() {
	return lastName.get();
}
public void setLastName(String lastName) {
	this.lastName.set(lastName);;
}
@Override
public String toString() {
	return "Autor FirstName=" + firstName + " " + " Autor LastName=" + lastName;
}

}
