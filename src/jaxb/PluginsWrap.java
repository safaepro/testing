package jaxb;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Configuration")
public class PluginsWrap implements Serializable {
	
	private List<PluginConfiguration> plugins;

	public PluginsWrap() {
		super();
		// TODO Auto-generated constructor stub
	}
	@XmlElementWrapper(name="plugins")
	@XmlElement(name="plugin")
	public List<PluginConfiguration> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<PluginConfiguration> plugins) {
		this.plugins = plugins;
	}
	

}
