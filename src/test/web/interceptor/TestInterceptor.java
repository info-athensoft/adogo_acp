package test.web.interceptor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class TestInterceptor extends HandlerInterceptorAdapter {
    private static final String[] DEST_URI = {"/event/act"};
    private HashMap<Long, Long> hitCounts = new HashMap<Long, Long>();
    
//    @Autowired
//	private BoothService boothService;
/*		
	@Autowired
	public void setBoothService(BoothService boothService) {
		this.boothService = boothService;
	}
*/ 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	System.out.println("===========TestInterceptor preHandle");
    	System.out.println(">>>>>>hitCounts.size(): " + hitCounts.size());
/*8    	if (hitCounts.size() == 0) {
    		System.out.println(">>>>>>>>>>>>> hitCounts initialization >>>>>>>>>>>>>>");
    		List<Booth> booths = boothService.findAll();
    		for(Booth booth : booths){
    			hitCounts.put(booth.getBizNo(), booth.getCounter());
    			if (booth.getCounter()>0)
    				System.out.println("hitCounts initialization: BizNo=" + booth.getBizNo() + " Counter=" + booth.getCounter());
    		}
    		
    	}
    	boolean flag = false;
        String url = request.getRequestURL().toString();
        System.out.println(">>>>>>: " + url);
        for (String s : DEST_URI) {
            if (url.contains(s)) {
                flag = true;
                System.out.println("******: " + url);
                break;
            }
        }
//        return flag; */
        return true;
    }
 
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        System.out.println("===========TestInterceptor postHandle");
        Map<String, String[]> paramMap = request.getParameterMap();
        /*
 		Iterator<Entry<String, String[]>> it = paramMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry entry = (Map.Entry)it.next();
	        String key = (String) entry.getKey();
	        String[] value = (String[]) entry.getValue();
		    System.out.println("getParameterMap: key="+key+" value="+Arrays.toString(value)+" value2="+value[0]);
	    } */
	    
/*	    String bizNo = "bizNo";
	    if (paramMap.containsKey(bizNo)) {
	    	String[] value = paramMap.get(bizNo);
	    	System.out.println("bizNo : " + bizNo +" value :"+ value[0]);
	    	
	    	Long key = Long.valueOf(value[0]);
	    	System.out.println("before updating ... bizNo= " + key + ", hitCount="+hitCounts.get(key));
			hitCounts.put(key, hitCounts.get(key) + 1);
			System.out.println("after updating ... bizNo= " + key + ", hitCount="+hitCounts.get(key));
	    } */
    }
    
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {  
        System.out.println("===========TestInterceptor afterCompletion");
/*       
        Iterator it = hitCounts.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry entry = (Map.Entry)it.next();
//	        System.out.println(entry.getKey() + " = " + entry.getValue());
	        Long bizNo = (Long) entry.getKey();
		    Long counter = (Long) entry.getValue();
//		    System.out.println("destroy ... saving hit counter. bizNo="+bizNo+" counter="+counter);
		    if (counter>0) {
		    	boothService.updateCounter(bizNo, counter);
		    	System.out.println("saving hit counter>>>>>>>>>>>. bizNo="+bizNo+" counter="+counter);
		    }
//	        it.remove(); // avoids a ConcurrentModificationException
	    }
*/	    
    }
    
}