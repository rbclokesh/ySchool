package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IClassSubjectHasStaffHasRolePK;


/** 
 * Object mapping for hibernate-handled table: class_subject_has_staff_has_role.
 * @author autogenerated
 */

@Embeddable
public class ClassSubjectHasStaffHasRolePK implements Cloneable, Serializable,  IClassSubjectHasStaffHasRolePK {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977432L;

	

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Class_Subject_idClass_Subject", nullable = false , insertable = false, updatable = false )
	private ClassSubject classSubjectIdclassSubject;

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Staff_has_Role_idStaff_has_role", nullable = false , insertable = false, updatable = false )
	private StaffHasRole staffHasRoleIdstaffHasRole;

 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return ClassSubjectHasStaffHasRolePK.class;
	}
 

    /**
     * Return the value associated with the column: classSubjectIdclassSubject.
	 * @return A ClassSubject object (this.classSubjectIdclassSubject)
	 */
	public ClassSubject getClassSubjectIdclassSubject() {
		return this.classSubjectIdclassSubject;
		
	}
	

  
    /**  
     * Set the value related to the column: classSubjectIdclassSubject.
	 * @param classSubjectIdclassSubject the classSubjectIdclassSubject value you wish to set
	 */
	public void setClassSubjectIdclassSubject(final ClassSubject classSubjectIdclassSubject) {
		this.classSubjectIdclassSubject = classSubjectIdclassSubject;
	}

    /**
     * Return the value associated with the column: staffHasRoleIdstaffHasRole.
	 * @return A StaffHasRole object (this.staffHasRoleIdstaffHasRole)
	 */
	public StaffHasRole getStaffHasRoleIdstaffHasRole() {
		return this.staffHasRoleIdstaffHasRole;
		
	}
	

  
    /**  
     * Set the value related to the column: staffHasRoleIdstaffHasRole.
	 * @param staffHasRoleIdstaffHasRole the staffHasRoleIdstaffHasRole value you wish to set
	 */
	public void setStaffHasRoleIdstaffHasRole(final StaffHasRole staffHasRoleIdstaffHasRole) {
		this.staffHasRoleIdstaffHasRole = staffHasRoleIdstaffHasRole;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public ClassSubjectHasStaffHasRolePK clone() throws CloneNotSupportedException {
		
        final ClassSubjectHasStaffHasRolePK copy = (ClassSubjectHasStaffHasRolePK)super.clone();

		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
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

		if (aThat == null)  {
			 return false;
		}
		
		final ClassSubjectHasStaffHasRolePK that; 
		try {
			that = (ClassSubjectHasStaffHasRolePK) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((getClassSubjectIdclassSubject() == null) && (that.getClassSubjectIdclassSubject() == null)) || (getClassSubjectIdclassSubject() != null && getClassSubjectIdclassSubject().getId().equals(that.getClassSubjectIdclassSubject().getId())));	
		result = result && (((getStaffHasRoleIdstaffHasRole() == null) && (that.getStaffHasRoleIdstaffHasRole() == null)) || (getStaffHasRoleIdstaffHasRole() != null && getStaffHasRoleIdstaffHasRole().getId().equals(that.getStaffHasRoleIdstaffHasRole().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
	int hash = 0;
		hash = hash + getClassSubjectIdclassSubject().hashCode();
		hash = hash + getStaffHasRoleIdstaffHasRole().hashCode();
	return hash;
	}
	

	
}
