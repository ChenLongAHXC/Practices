
package webserivce.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>customerType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="customerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIVATE"/>
 *     &lt;enumeration value="BUSINESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customerType")
@XmlEnum
public enum CustomerType {

    PRIVATE,
    BUSINESS;

    public String value() {
        return name();
    }

    public static CustomerType fromValue(String v) {
        return valueOf(v);
    }

}
