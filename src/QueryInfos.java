

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryInfos
 */
@WebServlet("/queryInfos")
public class QueryInfos extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        //设置数据编码方式
	        request.setCharacterEncoding("utf-8");
	        response.setCharacterEncoding("utf-8");
	        //设置数据类型
	        response.setContentType("text/plain");
	        //设置禁用缓存
	        response.setHeader("Cache-control","no-cache");

	        //获取从页面传递的参数
	        String ip = request.getParameter("ip");
	        String addr = request.getParameter("addr");
	        String time = request.getParameter("time");
	        String times = request.getParameter("times");

	        /*
	        * 执行操作
	        * */

	        //拼接返回的json数据
	        StringBuilder jsonString = new StringBuilder();
	        jsonString.append("{");
	        jsonString.append("'size':2");

	        jsonString.append(",'datas':[");

	        jsonString.append("{");
	        jsonString.append("'ip':'10.10.1.1',");
	        jsonString.append("'addr':'辽宁葫芦岛',");
	        jsonString.append("'time':'2016-10-24 16:00:23',");
	        jsonString.append("'times':'10'");
	        jsonString.append("}");

	        jsonString.append(",{");
	        jsonString.append("'ip':'192.168.110.111',");
	        jsonString.append("'addr':'辽宁沈阳',");
	        jsonString.append("'time':'2016-11-11 11:00:23',");
	        jsonString.append("'times':'14'");
	        jsonString.append("}");

	        jsonString.append("]");

	        jsonString.append("}");

	        //获取输出流
	        PrintWriter out = response.getWriter();
	        //将数据返回页面
	        out.write(jsonString.toString());
	        out.flush();
	        out.close();
	    }
}
