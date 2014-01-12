package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IStudentClassroomModule;


/** 
 * Object mapping for hibernate-handled table: student_classroom_module.
 * @author autogenerated
 */

@Entity
@Table(name = "student_classroom_module", schema = "yschool")
public class StudentClassroomModule implements Cloneable, Serializable, IPojoGenEntity, IStudentClassroomModule {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977410L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private ClassroomModule classroomModuleIdclassroomModule;
	/** Field mapping. */
	private ClassroomStudent classroomStudentIdclassroomStudent;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Date modifiedTime;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public StudentClassroomModule() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public StudentClassroomModule(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param classroomModuleIdclassroomModule ClassroomModule object;
	 * @param classroomStudentIdclassroomStudent ClassroomStudent object;
	 * @param id Integer object;
	 * @param modifiedTime Date object;
	 */
	public StudentClassroomModule(ClassroomModule classroomModuleIdclassroomModule, ClassroomStudent classroomStudentIdclassroomStudent, Integer id, 					
			Date modifiedTime) {

		this.classroomModuleIdclassroomModule = classroomModuleIdclassroomModule;
		this.classroomStudentIdclassroomStudent = classroomStudentIdclassroomStudent;
		this.id = id;
		this.modifiedTime = modifiedTime;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return StudentClassroomModule.class;
	}
 

    /**
     * Return the value associated with the column: classroomModuleIdclassroomModule.
	 * @return A ClassroomModule object (this.classroomModuleIdclassroomModule)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "classroom_module_idclassroom_module", nullable = false )
	public ClassroomModule getClassroomModuleIdclassroomModule() {
		return this.classroomModuleIdclassroomModule;
		
	}
	

  
    /**  
     * Set the value related to the column: classroomModuleIdclassroomModule.
	 * @param classroomModuleIdclassroomModule the classroomModuleIdclassroomModule value you wish to set
	 */
	public void setClassroomModuleIdclassroomModule(final ClassroomModule classroomModuleIdclassroomModule) {
		this.classroomModuleIdclassroomModule = classroomModuleIdclassroomModule;
	}

    /**
     * Return the value associated with the column: classroomStudentIdclassroomStudent.
	 * @return A ClassroomStudent object (this.classroomStudentIdclassroomStudent)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "classroom_student_idclassroom_student", nullable = false )
	public ClassroomStudent getClassroomStudentIdclassroomStudent() {
		return this.classroomStudentIdclassroomStudent;
		
	}
	

  
    /**  
     * Set the value related to the column: classroomStudentIdclassroomStudent.
	 * @param classroomStudentIdclassroomStudent the classroomStudentIdclassroomStudent value you wish to set
	 */
	public void setClassroomStudentIdclassroomStudent(final ClassroomStudent classroomStudentIdclassroomStudent) {
		this.classroomStudentIdclassroomStudent = classroomStudentIdclassroomStudent;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idstudent_classroom_module", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: modifiedTime.
	 * @return A Date object (this.modifiedTime)
	 */
	@Basic( optional = false )
	@Column( name = "modified_time", nullable = false  )
	public Date getModifiedTime() {
		return this.modifiedTime;
		
	}
	

  
    /**  
     * Set the value related to the column: modifiedTime.
	 * @param modifiedTime the modifiedTime value you wish to set
	 */
	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public StudentClassroomModule clone() throws CloneNotSupportedException {
		
        final StudentClassroomModule copy = (StudentClassroomModule)super.clone();

		copy.setClassroomModuleIdclassroomModule(this.getClassroomModuleIdclassroomModule());
		copy.setClassroomStudentIdclassroomStudent(this.getClassroomStudentIdclassroomStudent());
		copy.setId(this.getId());
		copy.setModifiedTime(this.getModifiedTime());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId() + ", ");
		sb.append("modifiedTime: " + this.getModifiedTime());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final StudentClassroomModule that; 
		try {
			that = (StudentClassroomModule) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getClassroomModuleIdclassroomModule() == null) && (that.getClassroomModuleIdclassroomModule() == null)) || (getClassroomModuleIdclassroomModule() != null && getClassroomModuleIdclassroomModule().getId().equals(that.getClassroomModuleIdclassroomModule().getId())));	
		result = result && (((getClassroomStudentIdclassroomStudent() == null) && (that.getClassroomStudentIdclassroomStudent() == null)) || (getClassroomStudentIdclassroomStudent() != null && getClassroomStudentIdclassroomStudent().getId().equals(that.getClassroomStudentIdclassroomStudent().getId())));	
		result = result && (((getModifiedTime() == null) && (that.getModifiedTime() == null)) || (getModifiedTime() != null && getModifiedTime().equals(that.getModifiedTime())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}