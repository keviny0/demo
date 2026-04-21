package com.example.web2_4; // 请根据您的实际包名进行修改

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ShowParameterServlet")
public class ShowParameterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");

        // 获取 PrintWriter 对象        PrintWriter out = response.getWriter();

        // 开始输出 HTML
        out.println("<html><head><title>表单数据</title></head><body>");
        out.println("<h2>提交的表单数据:</h2>");
        out.println("<ul>");

        // 获取表单中所有的参数名
        Enumeration<String> parameterNames = request.getParameterNames();

        // 遍历所有参数名
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement(); // 获取参数名
            String[] paramValues = request.getParameterValues(paramName); // 获取参数值

            out.print("<li><strong>" + paramName + ":</strong> ");
            if (paramValues.length == 0 || (paramValues.length == 1 && paramValues[0].isEmpty())) {
                out.print("<i>No Value</i>");
            } else if (paramValues.length > 1) {
                out.print("<ul>");
                for (String value : paramValues) {
                    out.print("<li>" + value + "</li>");
                }
                out.print("</ul>");
            } else {
                out.print(paramValues[0]);
            }
            out.println("</li>");
        }

        out.println("</ul>");
        out.println("</body></html>");
    }
}