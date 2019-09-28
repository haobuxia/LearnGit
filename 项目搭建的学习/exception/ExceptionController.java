package edu.thss.platform.exception;

import edu.thss.platform.controller.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

@ApiIgnore
@Controller
@RequestMapping(value = "error")
@EnableConfigurationProperties({ServerProperties.class})
public class ExceptionController implements ErrorController {

    private ErrorAttributes errorAttributes;

    /**
     * 初始化ExceptionController
     * @param errorAttributes
     */
    @Autowired
    public ExceptionController(ErrorAttributes errorAttributes) {
        Assert.notNull(errorAttributes, "ErrorAttributes must not be null");
        this.errorAttributes = errorAttributes;
    }

    /**
     * 定义404的JSON数据
     * @param request
     * @return
     */
    @RequestMapping(value = "404")
    @ResponseBody
    public ResponseEntity<ResponseMsg> error404(HttpServletRequest request) {
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(new ResponseMsg(404), status);
    }


    /**
     * 定义401的JSON数据
     * @param request
     * @return
     */
    @RequestMapping(value = "401")
    @ResponseBody
    public ResponseEntity<ResponseMsg> error401(HttpServletRequest request) {
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(new ResponseMsg(401), status);
    }


    /**
     * 定义403的JSON数据
     * @param request
     * @return
     */
    @RequestMapping(value = "403")
    @ResponseBody
    public ResponseEntity<ResponseMsg> error403(HttpServletRequest request) {
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(new ResponseMsg(403), status);
    }


    /**
     * 获取错误编码
     * @param request
     * @return
     */
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request
                .getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        try {
            return HttpStatus.valueOf(statusCode);
        }
        catch (Exception ex) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    /**
     * 实现错误路径,暂时无用
     * @return
     */
    @Override
    public String getErrorPath() {
        return "";
    }

}