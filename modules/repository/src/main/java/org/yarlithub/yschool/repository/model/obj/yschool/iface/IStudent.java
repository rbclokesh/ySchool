package org.yarlithub.yschool.repository.model.obj.yschool.iface;
import java.util.Date;
import java.util.Set;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassStudent;
import org.yarlithub.yschool.repository.model.obj.yschool.Marks;
import org.yarlithub.yschool.repository.model.obj.yschool.Results;


/** 
 * Object interface mapping for hibernate-handled table: student.
 * @author autogenerated
 */

public interface IStudent {



    /**
     * Return the value associated with the column: addmisionNo.
	 * @return A String object (this.addmisionNo)
	 */
	String getAddmisionNo();
	

  
    /**  
     * Set the value related to the column: addmisionNo.
	 * @param addmisionNo the addmisionNo value you wish to set
	 */
	void setAddmisionNo(final String addmisionNo);

    /**
     * Return the value associated with the column: address.
	 * @return A String object (this.address)
	 */
	String getAddress();
	

  
    /**  
     * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	void setAddress(final String address);

    /**
     * Return the value associated with the column: classStudent.
	 * @return A Set&lt;ClassStudent&gt; object (this.classStudent)
	 */
	Set<ClassStudent> getClassStudents();
	
	/**
	 * Adds a bi-directional link of type ClassStudent to the classStudents set.
	 * @param classStudent item to add
	 */
	void addClassStudent(ClassStudent classStudent);

  
    /**  
     * Set the value related to the column: classStudent.
	 * @param classStudent the classStudent value you wish to set
	 */
	void setClassStudents(final Set<ClassStudent> classStudent);

    /**
     * Return the value associated with the column: dob.
	 * @return A Date object (this.dob)
	 */
	Date getDob();
	

  
    /**  
     * Set the value related to the column: dob.
	 * @param dob the dob value you wish to set
	 */
	void setDob(final Date dob);

    /**
     * Return the value associated with the column: fullName.
	 * @return A String object (this.fullName)
	 */
	String getFullName();
	

  
    /**  
     * Set the value related to the column: fullName.
	 * @param fullName the fullName value you wish to set
	 */
	void setFullName(final String fullName);

    /**
     * Return the value associated with the column: gender.
	 * @return A String object (this.gender)
	 */
	String getGender();
	

  
    /**  
     * Set the value related to the column: gender.
	 * @param gender the gender value you wish to set
	 */
	void setGender(final String gender);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: marks.
	 * @return A Set&lt;Marks&gt; object (this.marks)
	 */
	Set<Marks> getMarkss();
	
	/**
	 * Adds a bi-directional link of type Marks to the markss set.
	 * @param marks item to add
	 */
	void addMarks(Marks marks);

  
    /**  
     * Set the value related to the column: marks.
	 * @param marks the marks value you wish to set
	 */
	void setMarkss(final Set<Marks> marks);

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	String getName();
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	void setName(final String name);

    /**
     * Return the value associated with the column: nameWtInitial.
	 * @return A String object (this.nameWtInitial)
	 */
	String getNameWtInitial();
	

  
    /**  
     * Set the value related to the column: nameWtInitial.
	 * @param nameWtInitial the nameWtInitial value you wish to set
	 */
	void setNameWtInitial(final String nameWtInitial);

    /**
     * Return the value associated with the column: photo.
	 * @return A Byte[] object (this.photo)
	 */
	Byte[] getPhoto();
	

  
    /**  
     * Set the value related to the column: photo.
	 * @param photo the photo value you wish to set
	 */
	void setPhoto(final Byte[] photo);

    /**
     * Return the value associated with the column: results.
	 * @return A Set&lt;Results&gt; object (this.results)
	 */
	Set<Results> getResultss();
	
	/**
	 * Adds a bi-directional link of type Results to the resultss set.
	 * @param results item to add
	 */
	void addResults(Results results);

  
    /**  
     * Set the value related to the column: results.
	 * @param results the results value you wish to set
	 */
	void setResultss(final Set<Results> results);

	// end of interface
}