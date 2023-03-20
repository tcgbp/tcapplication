package tca.entity.audit;


import java.io.Serializable;
import java.util.Date;

public abstract class DateAudit implements Serializable{

    private static final long serialVersionUID = 1L;

	private Date createdAt;

    public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	private Date updatedAt;
}
