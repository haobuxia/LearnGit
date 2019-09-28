package edu.thss.platform.controller;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ByteResponseUtil {

    static Logger logger = LoggerFactory.getLogger(ByteResponseUtil.class);

    /**
     * @param bytes
     * @param response
     * @param contentType
     * @param filename 若filename不为null，则作为attachment的形式
     */
    public static void writeBytes(Byte[] bytes, HttpServletResponse response, String contentType, String filename){
        ServletOutputStream out = null;
        try {
            byte[] primitiveBytes = ArrayUtils.toPrimitive(bytes);
            response.setHeader("Content-Length", primitiveBytes.length + "");
            response.setHeader("Accept-Ranges:", "bytes");
            if(filename != null) {
                response.setHeader("Content-disposition", "attachment;filename=" + java.net.URLEncoder.encode(filename, "UTF-8"));
            }
            response.setContentType(contentType);
            out = response.getOutputStream();
            out.write(primitiveBytes);
        } catch (IOException e) {
            logger.error("", e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    logger.error("", e);
                }
            }
        }
    }

    public static void writePng(byte[] png, HttpServletResponse response){
        writeBytes(ArrayUtils.toObject(png), response, "image/png", null);
    }


    public static void writePng(Byte[] png, HttpServletResponse response){
        writeBytes(png, response, "image/png", null);
    }

    public static void writeFile(Byte[] file, HttpServletResponse response, String fileName){
        writeBytes(file, response, "application/octet-stream", fileName);
    }
}
