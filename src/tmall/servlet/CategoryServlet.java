package tmall.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tmall.bean.Category;
import tmall.util.Page;

public class CategoryServlet extends BaseBackServlet {
	
	@Override
	public String list(HttpServletRequest request, HttpServletResponse response, Page page) {
	    List<Category> categoryList = categoryDAO.list(page.getStart(), page.getCount());
	    int total = categoryDAO.getTotal();
	    page.setTotal(total);
	     
	    request.setAttribute("thecs", categoryList);
	    request.setAttribute("page", page);
	     
	    return "admin/listCategory.jsp";
	}

	@Override
	public String add(HttpServletRequest request, HttpServletResponse response, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(HttpServletRequest request, HttpServletResponse response, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(HttpServletRequest request, HttpServletResponse response, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(HttpServletRequest request, HttpServletResponse response, Page page) {
		// TODO Auto-generated method stub
		return null;
	}
}
