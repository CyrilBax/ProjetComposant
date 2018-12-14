package org.application;
import java.util.Properties;

import javax.naming.*;

import org.composant.client.ClientComposant;
import org.composant.client.ClientComposantRemote;
import org.composant.vehicule.VehiculeComposant;
import org.composant.vehicule.VehiculeComposantRemote;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehiculeComposantRemote remote = InitContext();
		
		remote.ajouterVehicule("Bandit","Suzuki","Gris Anthracite",41000,"Essence 98","Moto",6500.0,10);
		System.out.println("Véhicule ajouté");
		
		
		ClientComposantRemote remoteClient = InitContextClient();
		remoteClient.ajouterClient("Risitas", "La chancla");
		System.out.println("Risitas ajouté");
		
	}
	public static ClientComposantRemote InitContextClient()
	{
		Properties ppt = null;
		Context ctx = null;
		
		try
		{
			ppt = new Properties();
			//ppt.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			ppt.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
			//ppt.put("jboss.naming.client.ejb.context", true);
			//ppt.put(Context.PROVIDER_URL,"remote://localhost:8080");
			//ppt.put(javax.naming.Context.PROVIDER_URL, String.format("%s://%s:%s", "remote", "localhost", "8080"));
			ctx = new InitialContext(ppt);	
			String appName = "SiteEcommerce";
			String moduleName = "MiniECommerce";
			String distinctName = "";
			String beanName = ClientComposant.class.getSimpleName();
			String interfaceName = ClientComposantRemote.class.getName();
			return (ClientComposantRemote) ctx.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public static VehiculeComposantRemote InitContext()
	{
		Properties ppt = null;
		Context ctx = null;
		
		try
		{
			ppt = new Properties();
			//ppt.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			ppt.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
			//ppt.put("jboss.naming.client.ejb.context", true);
			//ppt.put(Context.PROVIDER_URL,"remote://localhost:8080");
			//ppt.put(javax.naming.Context.PROVIDER_URL, String.format("%s://%s:%s", "remote", "localhost", "8080"));
			ctx = new InitialContext(ppt);	
			String appName = "SiteEcommerce";
			String moduleName = "MiniECommerce";
			String distinctName = "";
			String beanName = VehiculeComposant.class.getSimpleName();
			String interfaceName = VehiculeComposantRemote.class.getName();
			return (VehiculeComposantRemote) ctx.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
