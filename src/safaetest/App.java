package safaetest;

import java.util.ArrayList;
import java.util.List;

import jaxb.PluginConfiguration;
import jaxb.PluginJAXB;
import jaxb.PluginsWrap;

public class App {
	public static void main(String args[]){
		PluginJAXB jxb = new PluginJAXB();
		PluginConfiguration plugin = new PluginConfiguration("plugin-id6","plugin6","/url/plugin6","0-0-6");
		
		/*
		
		PluginConfiguration plugin2 = new PluginConfiguration("plugin-id2","plugin2","/url/plugin2","0-0-2");
		PluginConfiguration plugin3 = new PluginConfiguration("plugin-id3","plugin3","/url/plugin3","0-0-3");
		PluginConfiguration plugin4 = new PluginConfiguration("plugin-id5","plugin4","/url/plugin4","0-0-4");
		List<PluginConfiguration> configs = new ArrayList<PluginConfiguration>();
		configs.add(plugin);
		configs.add(plugin2);
		configs.add(plugin3);
		configs.add(plugin4);
		PluginsWrap wrap = new PluginsWrap();
		wrap.setPlugins(configs);
		
		
		jxb.marshall(wrap);
		*/
		PluginsWrap wrap = new PluginsWrap();
		wrap = jxb.unmarshall();
		wrap.getPlugins().add(plugin);
		jxb.marshall(wrap);
		System.out.println("*********Plugins******************");
		for(int i=0;i<wrap.getPlugins().size();i++){
			System.out.println(i+" ) Plugin :");
			System.out.println("ID PLUGIN : " +wrap.getPlugins().get(i).getId());
			System.out.println("NAME PLUGIN : " +wrap.getPlugins().get(i).getName()+" \n");
			System.out.println("URL PLUGIN : " +wrap.getPlugins().get(i).getUrl() + " \n");
			System.out.println("URL PLUGIN : " +wrap.getPlugins().get(i).getUrl()+" \n");
			System.out.println("**********************************************************");
		}	
	}

}
