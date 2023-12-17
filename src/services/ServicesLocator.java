package services;

import java.sql.SQLException;

import utils.Connection;

public class ServicesLocator {
	/*
	private static EnterpriseServices enterpriseServices = null;
	private static WorkerServices workerServices = null;

	public static EnterpriseServices getEnterpriseServices(){
		if(enterpriseServices == null){
			enterpriseServices = new EnterpriseServices();
		}
		return enterpriseServices;
	}

	public static WorkerServices getWorkerServices(){
		if(workerServices == null){
			workerServices = new WorkerServices();
		}
		return workerServices;
	}*/

	public static java.sql.Connection getConnection(){
		//Aqui ponen su password
		String password = "02081366966";

		//Nombre de la BD
		String bd = "Biblioteca";

		//En casos de cambiar algo pues verificar Connection y cambiar puerto y demas por o general lo demas es por defecto

		Connection connection = null;
		try {
			connection = new Connection("localhost", bd, "postgres", password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection.getConnection();
	}

}
