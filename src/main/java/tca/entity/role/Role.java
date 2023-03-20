package tca.entity.role;

import java.io.Serializable;

public class Role implements Serializable{

    private static final long serialVersionUID = 1L;

    public static final String ROLE_ENQUIRY = "ROLE_ENQUIRY";
    public static final String ROLE_REPORT = "ROLE_REPORT";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";

    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

    public Role(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
