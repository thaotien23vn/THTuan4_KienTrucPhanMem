package xmlToJson_Adapter;

public class Main {
    public static void main(String[] args) {
        JsonToXML jsonToXml = new JsonToXMLAdapter();
        XMLToJson xmlToJson = new XMLToJsonAdapter();

        String jsonData1 = "{ \"user\": { \"name\": \"John Doe\", \"age\": 30 } }";
        String xmlData1 = jsonToXml.processJson(jsonData1);

        System.out.println("JSON -> XML: ");
        System.out.println(xmlData1);

        String xmlData2 = "<user><name>John Doe</name><age>30</age></user>";
        String jsonData2 = xmlToJson.processXml(xmlData2);

        System.out.println("XML -> Json: ");
        System.out.println(jsonData2);
    }
}
