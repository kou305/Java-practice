package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import function.DisplayScreenFunction;
/**
 * Servlet implementation class DisplayInputScreenServlet
 */
@WebServlet("/DisplayReferenceScreenServlet")
public class DisplayReferenceScreenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータから文字列IDを取得
		String strID =request.getParameter("strID");
		// リクエストパラメータから数値IDを取得
		String numID =request.getParameter("numID");
		// 画面表示する数値IDを決定
		DisplayScreenFunction displayScreenFunction = new DisplayScreenFunction();
		// 文字列IDと数値IDをキーとしてDBからデータ取得
		// 取得データをもとにHTML文字列を書き換え
		// HTML文字列を出力
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
