package org.koreait.commons.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 관리자 페이지 공통 기능
 */
public class AdminCommonInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        processMenuCodesAndTitle(request); // 메뉴 코드 처리

        return true;
    }

    /**
     * URL별 메뉴 코드 및 타이틀 처리
     * 
     * @param request
     */
    private void processMenuCodesAndTitle(HttpServletRequest request) {
        String menuCode = null, title = null;
        String URI = request.getRequestURI();
        if (URI.indexOf("/admin/board") != -1) {
            menuCode = "board";
            title = "게시판 관리";
        } else if (URI.indexOf("/admin/member") != -1) {
            menuCode = "member";
            title = "회원관리";
        }

        if (menuCode != null)
            request.setAttribute("menuCode", menuCode);

        if (title != null)
            request.setAttribute("pageTitle", title);

    }
}
