package xmlToJson_Adapter;
import org.json.JSONObject;
import org.json.XML;
public class JsonToXMLAdapter implements JsonToXML{
    @Override
    public String processJson(String json) {
        JSONObject jsonObject = new JSONObject(json);
        return XML.toString(jsonObject);
    }
}
