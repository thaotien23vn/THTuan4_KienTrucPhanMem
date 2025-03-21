package xmlToJson_Adapter;
import org.json.JSONObject;
import org.json.XML;

public class XMLToJsonAdapter implements XMLToJson {
    @Override
    public String processXml(String xml) {
        JSONObject jsonObject = XML.toJSONObject(xml);
        return jsonObject.toString();
    }
}
