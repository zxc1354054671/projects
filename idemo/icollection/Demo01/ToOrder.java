package Demo01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import bean.Order;
import service.OrderService;
import serviceImpl.OrderServiceImpl;

/**ajax paging
 * Servlet implementation class ToOrder
 */
public class ToOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String temp = request.getParameter("pageCount");
		if(temp==null)
			temp="1";
		int pageCount=Integer.parseInt(temp);
		OrderService osi = new OrderServiceImpl();
		HttpSession session = request.getSession(false);
		String type = session.getAttribute("type").toString();
		String userId = session.getAttribute("userId").toString();
//		set each page count
		int count=10;
		int totalCount=0;
		Gson gson = new Gson();
		String data="";
		int totalPageCount=0;
//		send userOrder
		if("userOrder".equals(action)){
			List<Order> orders=new ArrayList<Order>();
			if("1".equals(type)){
				orders = osi.findByUserId(Integer.parseInt(userId), (pageCount-1)*count, count);
			}else if("0".equals(type)){
				orders = osi.findAll((pageCount-1)*count, count);
			}
			data = gson.toJson(orders);
//			send pageCount+","+totalPageCount;
		}else if("orderPage".equals(action)){
			if("1".equals(type)){
				totalCount = osi.findCountByUserId(Integer.parseInt(userId));
			}else if("0".equals(type)){
				totalCount = osi.findCount();
			}
			totalPageCount=totalCount%count==0?(totalCount/count):(totalCount/count+1);
			data=pageCount+","+totalPageCount;
		}
		PrintWriter out = response.getWriter();
		out.print(data);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
