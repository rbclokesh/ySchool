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
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IClassroomHasStaffHasRolePK;


/** 
 * Object mapping for hibernate-handled table: classroom_has_staff_has_role.
 * @author autogenerated
 */

@Embeddable
public class ClassroomHasStaffHasRolePK implements Cloneable, Serializable,  IClassroomHasStaffHasRolePK {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977437L;

	

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "Classroom_idClass", nullable = false , insertable = false, updatable = false )
	private Classroom classroomIdclass;

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
		return ClassroomHasStaffHasRolePK.class;
	}
 

    /**
     * Return the value associated with the column: classroomIdclass.
	 * @return A Classroom object (this.classroomIdclass)
	 */
	public Classroom getClassroomIdclass() {
		return this.classroomIdclass;
		
	}
	

  
    /**  
     * Set the value related to the column: classroomIdclass.
	 * @param classroomIdclass the classroomIdclass value you wish to set
	 */
	public void setClassroomIdclass(final Classroom classroomIdclass) {
		this.classroomIdclass = classroomIdclass;
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
    public ClassroomHasStaffHasRolePK clone() throws CloneNotSupportedException {
		
        final ClassroomHasStaffHasRolePK copy = (ClassroomHasStaffHasRolePK)super.clone();

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
		
		final ClassroomHasStaffHasRolePK that; 
		try {
			that = (ClassroomHasStaffHasRolePK) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((getClassroomIdclass() == null) && (that.getClassroomIdclass() == null)) || (getClassroomIdclass() != null && getClassroomIdclass().getId().equals(that.getClassroomIdclass().getId())));	
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
		hash = hash + getClassroomIdclass().hashCode();
		hash = hash + getStaffHasRoleIdstaffHasRole().hashCode();
	return hash;
	}
	

	
}
