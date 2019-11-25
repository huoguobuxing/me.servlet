1. File->New->Java->JAVA EE->WebApplication 创建好java项目
2. 新建FirstServlet，此时由于没有servlet-api依赖，所以无法编译通过
3. 进到本地tomcat lib文件夹找到servlet-api.jar，邮件项目名称->OpenModuleSetting->library将其添加
4. 重写servlet中的doGet方法
5. 到web.xml中配置url与servlet之间的关系
6. 请求http://localhost:8080/MyServletApp/fs验证已经创建成功

Servlet核心对象 
Servlet : 使用ServletConfig进行初始化。init
ServletRequest/ServletResponse : 被service方法使用，代表请求及响应。
ServletConfig : 代表该servlet的配置信息
ServletContext : 代表整个应用的上下文信息