package com.webone.SpringBootWebOne;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // will be converted to servlet
public class HomeController {
    //For different request different controllers

    @ModelAttribute("name")
    public String returnName() {
        return "Jurassic";
    }

    @RequestMapping("/")
    public String home() { // responsible to call index.jsp // what returns here should be view technology
        System.out.println("home method called");
        //return "index.jsp";
        return "index";
        // removing .jsp and adding another folder in webapp. all the .jsp --- only jsp files not static style.css
        // move it to static file
        // can be done using application.properties
        // Request for home page this controller is called and when u call home page search for index.jsp
        // on re-running we get a download with html in index.jsp
        // by default Spring boot doesnt support jsp files. it needs to be converted for that we need to add dependency i.e: tomcat jasper
        // we return data not a page with just statement
        // send some data to server. give back data to client
    }
    // Spring allows you to have multiple requests mapped in one particular controller

    // Can have multiple controllers in other files
    //@RequestMapping("add")
    //public String add(int numOne, int numTwo, HttpSession session) {
    // the numOne and numTwo from query parameters and are4 passed same here
    // can also be done as below
    //public String add(@RequestParam("numOne") int numberOne, @RequestParam("numTwo") int numberTwo, HttpSession session)  {
//    public String add(@RequestParam("numOne") int numberOne, @RequestParam("numTwo") int numberTwo, Model model)  {


    // public ModelAndView add(@RequestParam("numOne") int numberOne, @RequestParam("numTwo") int numberTwo, ModelAndView mv)  {
    // instead of Model object using Model and View and adding object and setting the view name
    // whatever data we are getting from url assign it to numberOne. Optional if same variable and skip ("numOne")
    //int result= numberOne + numberTwo + 1;
    // session.setAttribute("result", result);
    //model.addAttribute("result", result);
    //mv.addObject("result", result);
    // mv.setViewName("result"); // and return mv object
    //return mv;
    // to transfer data between controller and jsp
    //return "result.jsp";
    //. jsp cab be removed if thymeleaf or any other is used
    //return "result";
    // controller accepts user request, view --> goes to client result.jsp. how to transfer data between controller and view
    // can be done using Model object. Instead of using session used model object
    //}
//    @RequestMapping("addDeveloper")
//    public ModelAndView addDeveloper(@RequestParam("devid") int developerId, @RequestParam("devname") String developerName, ModelAndView mv) {
//
//        Developer object = new Developer();
//        object.setdevId(developerId);
//        object.setName(developerName);
//        mv.addObject("developer", object);
//        // sending same object from above here
//        mv.setViewName("developer"); //creating new developer jsp page
//        return mv;
//    }


    // instead of using ModelAndView ands if Request params are more
    //Spring can create those objects and be sent to iew page and we can just return the page name as string from the controller

    @RequestMapping("addDeveloper")
//    public String addDeveloper(@ModelAttribute ("developer"1)Developer developer) {
    // if jsp has different name than developer object lets say developer 1 it doesnt work but if we wanna mention in brackets
    // if different name then use ModelAttribute annotation
    public String addDeveloper(Developer developer) {
        return "developer";
    }

    // @RequestMapping("add")
    // in servlet we use HttpServletRequest and HttpServletResponse//
    // Spring assigns an object for both
//    public String add(HttpServletRequest request, HttpSession session){
//        // HttpSession is an interface session object is given by Spring
//        int integer = Integer.parseInt(request.getParameter("numOne"));
//        int integerOne = Integer.parseInt(request.getParameter("numTwo"));
//        System.out.println("in add method called");
//        System.out.println(integer + integerOne);
//        // return string so parse int
//        // Send it to page. Can send thru url or use session
//        // in servlet we have a session object to maintain data in pages
//        session.setAttribute("result", integer + integerOne);
//        // name and data
//        // when result.jsp is called dispatcher servlet calls this page and above just maintaining data between pages
//        return "result.jsp";
//    }
    // every servlet needs mapping in xml file. Dispatcher servlet does it here!
    // Front controller is what receives the request from client.
    //In Spring, its called Dispatcher servlet. In maven non embedded and tomcat imported we need to get the connection between servlet of the servlet container of maven to request
    // tomcat goes to web.xml for configs
    // <servlet>org.springframework.web.servlet.DispatcherServlet</servlet> send all the request send them to this request - dispatcher servlet
    //<servlet-mapping><url-pattern><servlet-name>*DEMO*</servlet-name></url-pattern></servlet-mapping>
    // to connect both of these, add another tag as above
    // add the DEMO-servlet.xml in WEB-INF
    // configs in the file
    // find classes in this package
    // by:
    //<bean definition ........ etc thingie and <ctx:component-scan bean-package="com.demo/>
    //ctx:annotation-config/> </beans> // this makes the connection to controller to happen
    // in properties while adding vies and .jsp config. When return "index" happens resolver is called. Here we need to configure internal resource view resolver
    // by:
    //  <beans definition ........ etc thingie and <ctx:component-scan bean-package="com.demo/>
    //ctx:annotation-config/>
    // <bean class="org.springramework.web.servlet.view.InternalResourceViewResolver>
    // <property name="prefix" value="/views/"></property>
    // <property name="suffix" value=".jsp"></property>
    // </bean> </beans> // this makes the connection to controller to happen
    // sometimes jslt doesnt work add isELIgnores="false" in jsp in the <%@page language="java ...... %>

    // and using annotations
    // lombok helps tto reduce the number of lines in codee
    // for jsp pages to be converted we need jasper
    //jakarta after tomcat 01 wne to jakarta
    // server doesnt return pages like jsp pages when using react framework
    // by default for a form with action the method is "get". if post needs to be add explicitly add method="post"
    // multiple mappings @RequestMapping({"/", "home"}). use @GetMapping({"/", "home"})
    // lombok : makes us not specify getter and setter by using @Data : for no getter setters
    // lombok pass @NoArgsConstructor : to no specify constructor
    // for all the arguments toString() or hashcode() use : @AllArgsConstructor of lombok
    // also add @Component to be used across all classes
    // @RequestMapping default goes for get use @PostMapping for method="post"
    // controller talks with help of service to save the data
    // Eg: public class JobService { to do processing - Service Laer
//        public void addJob() {
//
//        }
//        public List<JobPost> get AllJobs() {
//
//    }
    //}
    // for fetching data from somewhere use repository
    // public class JobRepo {
//        List<JobPost> = newArrayList<> (Arrays.asList( new JobPost (1, "",  ""))
//            ......));
    // have all the data here mocking
        // public List<JobPost> getAlljobs() {
        //}
        // punblic void addJob(Jobpost job) {
    // jobs.add( job) // can be changed when adding DB config
        //}
    //}
}
