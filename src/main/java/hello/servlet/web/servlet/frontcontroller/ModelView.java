package hello.servlet.web.servlet.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {
    private  String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName){
        this.viewName = viewName;
    }
}
