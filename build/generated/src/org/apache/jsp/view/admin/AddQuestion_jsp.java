package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Add Question</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\"\n");
      out.write("              type=\"application/rss+xml\" title=\"RSS\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-xl px-4 mt-4\">\n");
      out.write("            <div class=\"card mb-4\">\n");
      out.write("                <h2> Add Question </h2>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <div id=\"cont\" class=\"container-fluid\">\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label class=\"small mb-1\" for=\"question\">Question</label>\n");
      out.write("                            <input class=\"form-control\" id=\"content\" name=\"content\" type=\"text\" placeholder=\"Enter Question\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"height: 40px;margin-bottom: 10px\">\n");
      out.write("                                    <label style=\"font-size: 24px\">Course: </label>\n");
      out.write("                                    <select name=\"quiz\" style=\"font-size: 17px;padding: 4px\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                        <div style=\"height: 40px;margin-bottom: 10px\">\n");
      out.write("                                    <label style=\"font-size: 24px\">Lesson: </label>\n");
      out.write("                                    <select name=\"quiz\" style=\"font-size: 17px;padding: 4px\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"btn_add\">\n");
      out.write("                                <input type=\"button\" id=\"btnTextBox\" class=\"btn btn-primary\" onclick=\"createTextBox()\"\n");
      out.write("                                       value=\"Add More\" /> <!-- input tag for add textbox button -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"1\" class=\"row row_textbox\">\n");
      out.write("                            <div class=\"container-textbox\">\n");
      out.write("                                <textarea id=\"txt1\" class=\"textArea\" type='text' name='txt1'></textarea>\n");
      out.write("                                <!-- input tag for text feild -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"container-right\">\n");
      out.write("                                <input type=\"checkbox\" name=\"isTrue\" value=\"isTrue\" class=\"checkmark\"><BR>\n");
      out.write("                                <input id=\"btn1\" type=\"button\" class=\"btn btn_delete btn-danger\" name=\"btn1\" value=\"Delete\"\n");
      out.write("                                       onclick=\"deleteTextBox(this)\" />\n");
      out.write("                                <!-- input tag for delete text box as well as delete button -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    </body>\n");
      out.write("                    <script>\n");
      out.write("                        function createTextBox() {\n");
      out.write("                            // this will return list of row inside count id\n");
      out.write("                            var count = document.getElementById(\"cont\").getElementsByClassName(\"row\");\n");
      out.write("                            // this will return last row div id\n");
      out.write("                            var length = count[count.length - 1].id;\n");
      out.write("                            length++;\n");
      out.write("                            //another div is created with row className\n");
      out.write("                            var row = document.createElement(\"div\");\n");
      out.write("                            row.className = \"row row_textbox\";\n");
      out.write("                            // another div is created with col-md-2 class name\n");
      out.write("                            var col = document.createElement(\"div\");\n");
      out.write("\n");
      out.write("                            col.className = \"container-textbox\";\n");
      out.write("                            // assign increamented id to the div\n");
      out.write("                            row.setAttribute(\"id\", length);\n");
      out.write("\n");
      out.write("                            // create textbox\n");
      out.write("                            var textBox = document.createElement(\"textarea\");\n");
      out.write("                            textBox.setAttribute(\"type\", \"text\");\n");
      out.write("                            textBox.setAttribute(\"name\", \"txt\" + length);\n");
      out.write("                            textBox.setAttribute(\"id\", \"txt\" + length);\n");
      out.write("                            textBox.setAttribute(\"class\", \"textArea\");\n");
      out.write("\n");
      out.write("\n");
      out.write("                            // append textbox into div\n");
      out.write("                            col.appendChild(textBox);\n");
      out.write("                            // textbox div append to the div className as row\n");
      out.write("                            row.appendChild(col);\n");
      out.write("\n");
      out.write("                            var col3 = document.createElement(\"div\");\n");
      out.write("                            col3.className = \"\";\n");
      out.write("                            var checkboxTrue = document.createElement(\"input\");\n");
      out.write("                            checkboxTrue.setAttribute(\"type\", \"checkbox\");\n");
      out.write("                            checkboxTrue.setAttribute(\"name\", \"ckb\" + length);\n");
      out.write("                            checkboxTrue.setAttribute(\"value\", \"isTrue\");\n");
      out.write("                            checkboxTrue.setAttribute(\"class\", \"checkmark\");\n");
      out.write("                            checkboxTrue.setAttribute(\"id\", \"istrue\" + length);\n");
      out.write("                            // delBtn.setAttribute(\"onclick\", \"deleteTextBox(this)\");\n");
      out.write("                            col3.appendChild(checkboxTrue);\n");
      out.write("                            row.appendChild(col3);\n");
      out.write("\n");
      out.write("                            // another div for delete button\n");
      out.write("                            var col2 = document.createElement(\"div\");\n");
      out.write("                            col2.className = \"container-right\";\n");
      out.write("\n");
      out.write("                            // delete button is created\n");
      out.write("                            var delBtn = document.createElement(\"input\");\n");
      out.write("                            delBtn.setAttribute(\"type\", \"button\");\n");
      out.write("                            delBtn.setAttribute(\"name\", \"btn\" + length);\n");
      out.write("                            delBtn.setAttribute(\"value\", \"Delete\");\n");
      out.write("                            delBtn.setAttribute(\"class\", \"btn  btn_delete btn-danger\");\n");
      out.write("                            delBtn.setAttribute(\"id\", \"btn\" + length);\n");
      out.write("                            delBtn.setAttribute(\"onclick\", \"deleteTextBox(this)\");\n");
      out.write("\n");
      out.write("                            // append delete button into div\n");
      out.write("\n");
      out.write("                            col2.appendChild(delBtn);\n");
      out.write("                            // delete div append to the div classname as row\n");
      out.write("                            row.appendChild(col2);\n");
      out.write("\n");
      out.write("                            // entire row is appended to the div id as cont \n");
      out.write("                            document.getElementById(\"cont\").appendChild(row);\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        function deleteTextBox(txtName) {\n");
      out.write("                            // will return the length of div tag which class name is row\n");
      out.write("                            var count = document.getElementById(\"cont\").getElementsByClassName(\"row\");\n");
      out.write("                            var length = count.length - 1;\n");
      out.write("                            // this will store the id of delete button\n");
      out.write("                            var strBtn = txtName.id;\n");
      out.write("\n");
      out.write("                            if (length == 0) {\n");
      out.write("                                document.getElementById(strBtn).remove();\n");
      out.write("                                document.getElementById(strBtn.replace(\"btn\", \"\")).remove();\n");
      out.write("                            } else {\n");
      out.write("                                document.getElementById(strBtn.replace(\"btn\", \"\")).remove();\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ll");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option name=\"quizId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.quizId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.quizName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" in ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" Subject</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("ll");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option name=\"quizId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.quizId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.quizName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" in ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.subjectName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" Subject</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
