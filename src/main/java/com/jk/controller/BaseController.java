package com.jk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import net.sf.json.JSONArray;



public class BaseController{

	
	protected void jsonOutSuccess(HttpServletResponse response){
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("success",true);
		jsonOut(resMap, response);
	}
	
	protected void jsonOutArray(Object obj,HttpServletResponse response) {
		String str = JSON.toJSONStringWithDateFormat(obj, "yyyy/MM/dd");
		/*JSONArray json = JSONArray.fromObject(obj);*/
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer=null;
		try {
			writer = response.getWriter();
			writer.write(str.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.close();
			}
		}
		
	}
	
	protected void jsonOutError(String msg,HttpServletResponse response){
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("success",false);
		resMap.put("msg", msg);
		String jsonString = JSON.toJSONString(resMap);
		jsonOut(jsonString, response);
	}
	
	
	protected void jsonOut(Object obj,HttpServletResponse response) {
		String str = JSON.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer=null;
		try {
			writer = response.getWriter();
			writer.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.close();
			}
		}
	}
	
	/**
	 * <pre>outString(打印字符串) jsonp讲解时，使用response.setContentType("application/json");
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2016年3月14日 上午10:07:28    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2016年3月14日 上午10:07:28    
	 * 修改备注： 
	 * @param json</pre>
	 */
	protected void outString(String json, HttpServletResponse response) {
		PrintWriter writer = null;
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		try {
			writer = response.getWriter();
			writer.write(json);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != writer) {
				writer.close();
				writer = null;
			}
		}
	}
	
}
