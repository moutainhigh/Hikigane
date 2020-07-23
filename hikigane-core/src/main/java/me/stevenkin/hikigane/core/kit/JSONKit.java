package me.stevenkin.hikigane.core.kit;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;

public class JSONKit {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     *
     * Object to jsonString
     * {@link } can be checked for the result.
     * @param
     * @return
     * @throws
     */
    public static String toString(Object obj) {

        if (null == obj) {
            return null;
        }
        try {
            return MAPPER.writeValueAsString(obj);
        } catch (Exception e) {
        }
        return obj.toString();
    }

    /**
     *
     * jsonString to Object
     * {@link } can be checked for the result.
     * @param
     * @return
     * @throws
     */
    public static <T> T toObject(String jsonString, Class<T> c) {

        if (null == c || StringUtils.isEmpty(jsonString)) {
            return null;
        }
        try {
            return MAPPER.readValue(jsonString, c);
        } catch (Exception e) {
        }
        return null;
    }

    /**
     *
     * jsonString to ObjectArray
     * {@link } can be checked for the result.
     * @param
     * @return
     * @throws
     */
    public static <T> List<T> toObjectArray(String jsonString, Class<T> c) {

        if (null == c || StringUtils.isEmpty(jsonString)) {
            return Collections.emptyList();
        }
        try {
            JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, c);
            return MAPPER.readValue(jsonString, javaType);
        } catch (Exception e) {
        }
        return null;
    }
}
