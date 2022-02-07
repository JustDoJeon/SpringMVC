package mvc.spring.web.frontcontroller.v4;

import mvc.spring.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV4 {

    String process(Map<String,String> paramMap, Map<String,Object> model);
}
