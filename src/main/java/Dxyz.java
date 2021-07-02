import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.util.HttpClientTool;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/7/1 9:05
 * @Version 1.0
 */
public class Dxyz {
    public static void main(String[] args) {
        dxyz();
    }
    public static void dxyz(){
        int flag = (int) (Math.random()*1000000);
        String url = "https://way.jd.com/HTQ/yzm";
        Map paramMap = new HashMap();
        paramMap.put("appkey","6537036883f98ce2d10f34c8716daabf");
        paramMap.put("mobile","17343138590");
        paramMap.put("msg","【创信】死神来了！");
        try {
            String result = HttpClientTool.doPost(url,paramMap);
            JSONObject resultJson = JSON.parseObject(result);
            String msg = JSON.toJSONString(resultJson.get("msg"));
            System.out.println(result);
            System.out.println(msg);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public static void weather(){
        String url = "https://way.jd.com/jisuapi/weather";
        Map paramMap = new HashMap();
        paramMap.put("appkey","6537036883f98ce2d10f34c8716daabf");
        paramMap.put("city","商丘");
        try {
            String result = HttpClientTool.doPost(url,paramMap);
            JSONObject resultJson = JSON.parseObject(result);
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
