/**
 * 
 */
package net.bluebell.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ducbq
 *
 */
@Entity
@Table(name = "user_profile")
public class UserProfile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2483381714350838117L;

	@Column(name = "sso_id", nullable = false, unique = true, length=15)
	private String ssoId;

	@Column(name = "credential", nullable = false)
	private String credential;

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}
}
