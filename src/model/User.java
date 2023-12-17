package model;

public class User {
	private int cod_user;
	private String username;
    private int cod_rol;
    private String role;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getCod_user() {
		return cod_user;
	}
	public void setCod_user(int cod_user) {
		this.cod_user = cod_user;
	}
	
	public User() {
		super();
	}
	
	/*
	 * arreglar
	 */
	public User(int cod_user, String username, String password, String role) {
		this.cod_user = cod_user;
		this.username = username;
		this.role = role;
	}
	public int getCod_rol() {
		return cod_rol;
	}
	public void setCod_rol(int cod_rol) {
		this.cod_rol = cod_rol;
	}
	
	

	
	

}
