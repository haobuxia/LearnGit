package edu.thss.platform.domain.modeler.valuetype;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum AttributeValueType {

    String("字符串"),
    TimeStamp("时间戳"),
    Boolean("布尔值"),
	Integer("整数"),
    Double("双精度浮点数"),
    Long("长整数"),
    UUID("全局唯一标识"),
    Date("日期"),
    Clob("长字符串");


	private String displayName;

	AttributeValueType(String displayName) {
	    this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Map<String, String> getAll() {
        Map<String, String> res = new HashMap<>();
        for (AttributeValueType item : AttributeValueType.values()) {
            res.put(item.name(), item.displayName);
        }
        return res;
    }

	public static AttributeValueType fromColumnType(String type){
	    Map<String, AttributeValueType> map = new HashMap<>();
	    map.put("varchar", AttributeValueType.String);
	    map.put("text", AttributeValueType.String);

	    map.put("int2", AttributeValueType.Integer);
	    map.put("int4", AttributeValueType.Integer);
	    map.put("int8", AttributeValueType.Long);
        map.put("float2", AttributeValueType.Double);
	    map.put("float4", AttributeValueType.Double);
        map.put("float8", AttributeValueType.Double);

	    map.put("date", AttributeValueType.Date);
	    map.put("timestamp", AttributeValueType.TimeStamp);

	    map.put("bool", AttributeValueType.Boolean);
	    return map.getOrDefault(type, AttributeValueType.String);
    }
}
