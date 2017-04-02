package jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class PluginJAXB {
	
	public void marshall(PluginsWrap wrap){
		try {
			JAXBContext jxb = JAXBContext.newInstance(PluginsWrap.class);
			Marshaller m = jxb.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(wrap, new File("src\\data\\pluginConfig.xml"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public PluginsWrap unmarshall(){
		PluginsWrap wrap = new PluginsWrap();
		try {
			JAXBContext jxb = JAXBContext.newInstance(PluginsWrap.class);
			Unmarshaller m = jxb.createUnmarshaller();
			wrap = (PluginsWrap) m.unmarshal(new File("src\\data\\pluginConfig.xml"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return wrap;
	}
	

}
