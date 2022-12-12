/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author hoanglong2310
 */
public class Pager {
    public static final int CONTENT_PER_PAGE = 3;

    public static int getIndexPage(String str) {
        int i = 0;
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            i = 1;
        }
        return i;
    }

    public static int getEndPage(int total) {
        int endPage = total / CONTENT_PER_PAGE;
        if (total % CONTENT_PER_PAGE != 0) {
            endPage++;
        }
        return endPage;
    }
}
