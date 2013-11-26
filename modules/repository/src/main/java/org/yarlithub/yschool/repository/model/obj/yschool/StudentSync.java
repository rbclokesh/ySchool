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
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IStudentSync;


/** 
 * Object mapping for hibernate-handled table: student_sync.
 * @author autogenerated
 */

@Entity
@Table(name = "student_sync", schema = "yschool")
public class StudentSync implements Cloneable, Serializable, IPojoGenEntity, IStudentSync {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977411L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Integer classIdstudent;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Date modifiedTime;
	/** Field mapping. */
	private Student studentIdstudent;
	/** Field mapping. */
	private Integer syncStatus;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public StudentSync() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public StudentSync(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param classIdstudent Integer object;
	 * @param id Integer object;
	 * @param modifiedTime Date object;
	 * @param studentIdstudent Student object;
	 * @param syncStatus Integer object;
	 */
	public StudentSync(Integer classIdstudent, Integer id, Date modifiedTime, 					
			Student studentIdstudent, Integer syncStatus) {

		this.classIdstudent = classIdstudent;
		this.id = id;
		this.modifiedTime = modifiedTime;
		this.studentIdstudent = studentIdstudent;
		this.syncStatus = syncStatus;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return StudentSync.class;
	}
 

    /**
     * Return the value associated with the column: classIdstudent.
	 * @return A Integer object (this.classIdstudent)
	 */
	@Basic( optional = false )
	@Column( name = "class_idstudent", nullable = false  )
	public Integer getClassIdstudent() {
		return this.classIdstudent;
		
	}
	

  
    /**  
     * Set the value related to the column: classIdstudent.
	 * @param classIdstudent the classIdstudent value you wish to set
	 */
	public void setClassIdstudent(final Integer classIdstudent) {
		this.classIdstudent = classIdstudent;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idstudent_sync", nullable = false  )
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
     * Return the value associated with the column: studentIdstudent.
	 * @return A Student object (this.studentIdstudent)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "student_idstudent", nullable = false )
	public Student getStudentIdstudent() {
		return this.studentIdstudent;
		
	}
	

  
    /**  
     * Set the value related to the column: studentIdstudent.
	 * @param studentIdstudent the studentIdstudent value you wish to set
	 */
	public void setStudentIdstudent(final Student studentIdstudent) {
		this.studentIdstudent = studentIdstudent;
	}

    /**
     * Return the value associated with the column: syncStatus.
	 * @return A Integer object (this.syncStatus)
	 */
	@Basic( optional = false )
	@Column( name = "sync_status", nullable = false  )
	public Integer getSyncStatus() {
		return this.syncStatus;
		
	}
	

  
    /**  
     * Set the value related to the column: syncStatus.
	 * @param syncStatus the syncStatus value you wish to set
	 */
	public void setSyncStatus(final Integer syncStatus) {
		this.syncStatus = syncStatus;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public StudentSync clone() throws CloneNotSupportedException {
		
        final StudentSync copy = (StudentSync)super.clone();

		copy.setClassIdstudent(this.getClassIdstudent());
		copy.setId(this.getId());
		copy.setModifiedTime(this.getModifiedTime());
		copy.setStudentIdstudent(this.getStudentIdstudent());
		copy.setSyncStatus(this.getSyncStatus());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("classIdstudent: " + this.getClassIdstudent() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("modifiedTime: " + this.getModifiedTime() + ", ");
		sb.append("syncStatus: " + this.getSyncStatus());
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
		
		final StudentSync that; 
		try {
			that = (StudentSync) proxyThat;
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
		result = result && (((getClassIdstudent() == null) && (that.getClassIdstudent() == null)) || (getClassIdstudent() != null && getClassIdstudent().equals(that.getClassIdstudent())));
		result = result && (((getModifiedTime() == null) && (that.getModifiedTime() == null)) || (getModifiedTime() != null && getModifiedTime().equals(that.getModifiedTime())));
		result = result && (((getStudentIdstudent() == null) && (that.getStudentIdstudent() == null)) || (getStudentIdstudent() != null && getStudentIdstudent().getId().equals(that.getStudentIdstudent().getId())));	
		result = result && (((getSyncStatus() == null) && (that.getSyncStatus() == null)) || (getSyncStatus() != null && getSyncStatus().equals(that.getSyncStatus())));
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
