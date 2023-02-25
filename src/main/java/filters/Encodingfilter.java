package filters;

import javax.servlet.*;
import java.io.IOException;
// класс фильтр по кодировке

public class Encodingfilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {

        req.setCharacterEncoding("UTF-8"); // устанавлиаем кодировку нашему запросу
        resp.setCharacterEncoding("UTF-8"); // устанавливаем кодировку ответу
        filterChain.doFilter(req, resp);  // метод чтобы ответ и запрос ушел дальше по цепочке



    }

    @Override
    public void destroy() {

    }
}
