package apples.au.pivotal;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="people")
@XmlAccessorType(XmlAccessType.NONE)
public class People implements Serializable{
	private static final long serialVersionUID = 1L;

	@XmlElement(name="person")
	private List<Person> people;

	protected People() {}   // Keep JAXB happy

	public People(List<Person> people){
		this.people = people;
	}

	public List<Person> getPeople(){
		return people;
	}

}
