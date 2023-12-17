package utils;

public class GlobalFlag {

	private static String rol = null;
	private static GlobalFlag f;
	
	public static GlobalFlag getGlobalFlag() {
		if(GlobalFlag.f == null)
			GlobalFlag.f = new GlobalFlag();
		return GlobalFlag.f;		
	}
	
	private GlobalFlag() {
		
	}
	
	public void setRol(String x) {
		GlobalFlag.rol = x;
	}
	
	public String getRol() {
		return GlobalFlag.rol;
	}
	
}
