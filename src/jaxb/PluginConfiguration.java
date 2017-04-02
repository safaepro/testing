package jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="plugin")
public class PluginConfiguration {
	private String id;
	private String name;
	private String url;
	private String version;
	public PluginConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PluginConfiguration(String id, String name, String url, String version) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.version = version;
	}
	@XmlElement
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@XmlElement
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
