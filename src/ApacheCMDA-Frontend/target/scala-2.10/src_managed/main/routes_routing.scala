// @SOURCE:/home/SOC-Fall-2015/Dev/SOC-Fall-2015-Team1/ApacheCMDA-Frontend/conf/routes
// @HASH:d9f2e5d56d6ca7d8da8aee60732beab17196bfe5
// @DATE:Thu Dec 17 21:24:34 UTC 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_ClimateServiceController_newHome0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newHome"))))
        

// @LINE:8
private[this] lazy val controllers_ClimateServiceController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:9
private[this] lazy val controllers_ClimateServiceController_home2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_Application_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_logout4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:12
private[this] lazy val controllers_Application_authenticate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
        

// @LINE:13
private[this] lazy val controllers_Application_signup6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:14
private[this] lazy val controllers_Application_createNewUser7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createNewUser"))))
        

// @LINE:15
private[this] lazy val controllers_Application_createSuccess8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createSuccess"))))
        

// @LINE:16
private[this] lazy val controllers_Application_isEmailExisted9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("isEmailExisted"))))
        

// @LINE:21
private[this] lazy val controllers_BugReportController_reports10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:22
private[this] lazy val controllers_BugReportController_newReport11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:23
private[this] lazy val controllers_BugReportController_list12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:24
private[this] lazy val controllers_BugReportController_deleteReport13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:25
private[this] lazy val controllers_BugReportController_solveReport14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:28
private[this] lazy val controllers_AboutusController_aboutUs15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:29
private[this] lazy val controllers_AboutusController_aboutProject16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:32
private[this] lazy val controllers_ClimateServiceController_home17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:33
private[this] lazy val controllers_ClimateServiceController_newAllServices18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newAllServices"))))
        

// @LINE:34
private[this] lazy val controllers_ClimateServiceController_tutorial19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:35
private[this] lazy val controllers_ClimateServiceController_climateServices20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:36
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:37
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:38
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:39
private[this] lazy val controllers_ClimateServiceController_newClimateService24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:40
private[this] lazy val controllers_ClimateServiceController_deleteClimateService25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:41
private[this] lazy val controllers_ClimateServiceController_downloadClimateService26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:42
private[this] lazy val controllers_ClimateServiceController_editClimateService27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:43
private[this] lazy val controllers_ClimateServiceController_addClimateServices28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:44
private[this] lazy val controllers_ClimateServiceController_oneService29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:45
private[this] lazy val controllers_ClimateServiceController_checkLike30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/checkLike"))))
        

// @LINE:48
private[this] lazy val controllers_ClimateServiceController_mentionServices31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mentionServices"))))
        

// @LINE:49
private[this] lazy val controllers_ClimateServiceController_oneServiceNew32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneServiceNew"))))
        

// @LINE:50
private[this] lazy val controllers_UserController_addRatingNew33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneServiceNew"))))
        

// @LINE:52
private[this] lazy val controllers_UserController_mentionUsers34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mentionUsers"))))
        

// @LINE:53
private[this] lazy val controllers_UserController_mentionUsers235 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mentionUsers2"))))
        

// @LINE:58
private[this] lazy val controllers_DatasetController_datasetList36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:59
private[this] lazy val controllers_DatasetController_searchDataset37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:60
private[this] lazy val controllers_DatasetController_getSearchResult38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:61
private[this] lazy val controllers_DatasetController_getSearchResult39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:62
private[this] lazy val controllers_ClimateServiceController_searchService40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchService"))))
        

// @LINE:63
private[this] lazy val controllers_ClimateServiceController_searchClimateServiceByKey41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchServiceResult"))))
        

// @LINE:67
private[this] lazy val controllers_CommentController_comment42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment"))))
        

// @LINE:68
private[this] lazy val controllers_CommentController_addComment43 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/addComment"))))
        

// @LINE:69
private[this] lazy val controllers_CommentController_getComment44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/getComment"))))
        

// @LINE:70
private[this] lazy val controllers_CommentController_getCommentByID45 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("comment/getCommentByID"))))
        

// @LINE:75
private[this] lazy val controllers_Assets_at46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newHome""","""controllers.ClimateServiceController.newHome(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix,"""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createNewUser""","""controllers.Application.createNewUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createSuccess""","""controllers.Application.createSuccess()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """isEmailExisted""","""controllers.Application.isEmailExisted()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newAllServices""","""controllers.ClimateServiceController.newAllServices(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/checkLike""","""controllers.ClimateServiceController.checkLike(email:String ?= null, serviceID:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mentionServices""","""controllers.ClimateServiceController.mentionServices(url:String ?= null, serviceNew:String ?= null, serviceId:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneServiceNew""","""controllers.ClimateServiceController.oneServiceNew(url:String ?= null, serviceNew:String ?= null, serviceId:String ?= null, email:String ?= null)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneServiceNew""","""controllers.UserController.addRatingNew(url:String ?= null, serviceNew:String ?= null, serviceId:String ?= null, userName:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mentionUsers""","""controllers.UserController.mentionUsers(url:String ?= null, serviceNew:String ?= null, serviceId:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mentionUsers2""","""controllers.UserController.mentionUsers2(url:String ?= null, serviceNew:String ?= null, serviceId:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchService""","""controllers.ClimateServiceController.searchService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchServiceResult""","""controllers.ClimateServiceController.searchClimateServiceByKey(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment""","""controllers.CommentController.comment()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/addComment""","""controllers.CommentController.addComment(commenter:String ?= null, serviceID:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/getComment""","""controllers.CommentController.getComment()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """comment/getCommentByID""","""controllers.CommentController.getCommentByID()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_ClimateServiceController_newHome0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.newHome(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "newHome", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """newHome"""))
   }
}
        

// @LINE:8
case controllers_ClimateServiceController_home1(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:9
case controllers_ClimateServiceController_home2(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_Application_login3(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_logout4(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:12
case controllers_Application_authenticate5(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """authenticate"""))
   }
}
        

// @LINE:13
case controllers_Application_signup6(params) => {
   call { 
        invokeHandler(controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:14
case controllers_Application_createNewUser7(params) => {
   call { 
        invokeHandler(controllers.Application.createNewUser(), HandlerDef(this, "controllers.Application", "createNewUser", Nil,"GET", """""", Routes.prefix + """createNewUser"""))
   }
}
        

// @LINE:15
case controllers_Application_createSuccess8(params) => {
   call { 
        invokeHandler(controllers.Application.createSuccess(), HandlerDef(this, "controllers.Application", "createSuccess", Nil,"GET", """""", Routes.prefix + """createSuccess"""))
   }
}
        

// @LINE:16
case controllers_Application_isEmailExisted9(params) => {
   call { 
        invokeHandler(controllers.Application.isEmailExisted(), HandlerDef(this, "controllers.Application", "isEmailExisted", Nil,"POST", """""", Routes.prefix + """isEmailExisted"""))
   }
}
        

// @LINE:21
case controllers_BugReportController_reports10(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:22
case controllers_BugReportController_newReport11(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:23
case controllers_BugReportController_list12(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:24
case controllers_BugReportController_deleteReport13(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:25
case controllers_BugReportController_solveReport14(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:28
case controllers_AboutusController_aboutUs15(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:29
case controllers_AboutusController_aboutProject16(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:32
case controllers_ClimateServiceController_home17(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:33
case controllers_ClimateServiceController_newAllServices18(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.newAllServices(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "newAllServices", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """newAllServices"""))
   }
}
        

// @LINE:34
case controllers_ClimateServiceController_tutorial19(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:35
case controllers_ClimateServiceController_climateServices20(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Nil,"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:36
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices21(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:37
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices22(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:38
case controllers_ClimateServiceController_mostPopularClimateServices23(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:39
case controllers_ClimateServiceController_newClimateService24(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:40
case controllers_ClimateServiceController_deleteClimateService25(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:41
case controllers_ClimateServiceController_downloadClimateService26(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:42
case controllers_ClimateServiceController_editClimateService27(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:43
case controllers_ClimateServiceController_addClimateServices28(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:44
case controllers_ClimateServiceController_oneService29(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:45
case controllers_ClimateServiceController_checkLike30(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("serviceID", Some(null))) { (email, serviceID) =>
        invokeHandler(controllers.ClimateServiceController.checkLike(email, serviceID), HandlerDef(this, "controllers.ClimateServiceController", "checkLike", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """climate/checkLike"""))
   }
}
        

// @LINE:48
case controllers_ClimateServiceController_mentionServices31(params) => {
   call(params.fromQuery[String]("url", Some(null)), params.fromQuery[String]("serviceNew", Some(null)), params.fromQuery[String]("serviceId", Some(null))) { (url, serviceNew, serviceId) =>
        invokeHandler(controllers.ClimateServiceController.mentionServices(url, serviceNew, serviceId), HandlerDef(this, "controllers.ClimateServiceController", "mentionServices", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """climate/mentionServices"""))
   }
}
        

// @LINE:49
case controllers_ClimateServiceController_oneServiceNew32(params) => {
   call(params.fromQuery[String]("url", Some(null)), params.fromQuery[String]("serviceNew", Some(null)), params.fromQuery[String]("serviceId", Some(null)), params.fromQuery[String]("email", Some(null))) { (url, serviceNew, serviceId, email) =>
        invokeHandler(controllers.ClimateServiceController.oneServiceNew(url, serviceNew, serviceId, email), HandlerDef(this, "controllers.ClimateServiceController", "oneServiceNew", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """climate/oneServiceNew"""))
   }
}
        

// @LINE:50
case controllers_UserController_addRatingNew33(params) => {
   call(params.fromQuery[String]("url", Some(null)), params.fromQuery[String]("serviceNew", Some(null)), params.fromQuery[String]("serviceId", Some(null)), params.fromQuery[String]("userName", Some(null))) { (url, serviceNew, serviceId, userName) =>
        invokeHandler(controllers.UserController.addRatingNew(url, serviceNew, serviceId, userName), HandlerDef(this, "controllers.UserController", "addRatingNew", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """climate/oneServiceNew"""))
   }
}
        

// @LINE:52
case controllers_UserController_mentionUsers34(params) => {
   call(params.fromQuery[String]("url", Some(null)), params.fromQuery[String]("serviceNew", Some(null)), params.fromQuery[String]("serviceId", Some(null))) { (url, serviceNew, serviceId) =>
        invokeHandler(controllers.UserController.mentionUsers(url, serviceNew, serviceId), HandlerDef(this, "controllers.UserController", "mentionUsers", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """climate/mentionUsers"""))
   }
}
        

// @LINE:53
case controllers_UserController_mentionUsers235(params) => {
   call(params.fromQuery[String]("url", Some(null)), params.fromQuery[String]("serviceNew", Some(null)), params.fromQuery[String]("serviceId", Some(null))) { (url, serviceNew, serviceId) =>
        invokeHandler(controllers.UserController.mentionUsers2(url, serviceNew, serviceId), HandlerDef(this, "controllers.UserController", "mentionUsers2", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """climate/mentionUsers2"""))
   }
}
        

// @LINE:58
case controllers_DatasetController_datasetList36(params) => {
   call { 
        invokeHandler(controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Nil,"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:59
case controllers_DatasetController_searchDataset37(params) => {
   call { 
        invokeHandler(controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:60
case controllers_DatasetController_getSearchResult38(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:61
case controllers_DatasetController_getSearchResult39(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:62
case controllers_ClimateServiceController_searchService40(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.searchService(), HandlerDef(this, "controllers.ClimateServiceController", "searchService", Nil,"GET", """""", Routes.prefix + """climate/searchService"""))
   }
}
        

// @LINE:63
case controllers_ClimateServiceController_searchClimateServiceByKey41(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.searchClimateServiceByKey(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "searchClimateServiceByKey", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """climate/searchServiceResult"""))
   }
}
        

// @LINE:67
case controllers_CommentController_comment42(params) => {
   call { 
        invokeHandler(controllers.CommentController.comment(), HandlerDef(this, "controllers.CommentController", "comment", Nil,"GET", """Comment""", Routes.prefix + """comment"""))
   }
}
        

// @LINE:68
case controllers_CommentController_addComment43(params) => {
   call(params.fromQuery[String]("commenter", Some(null)), params.fromQuery[String]("serviceID", Some(null))) { (commenter, serviceID) =>
        invokeHandler(controllers.CommentController.addComment(commenter, serviceID), HandlerDef(this, "controllers.CommentController", "addComment", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """comment/addComment"""))
   }
}
        

// @LINE:69
case controllers_CommentController_getComment44(params) => {
   call { 
        invokeHandler(controllers.CommentController.getComment(), HandlerDef(this, "controllers.CommentController", "getComment", Nil,"GET", """""", Routes.prefix + """comment/getComment"""))
   }
}
        

// @LINE:70
case controllers_CommentController_getCommentByID45(params) => {
   call { 
        invokeHandler(controllers.CommentController.getCommentByID(), HandlerDef(this, "controllers.CommentController", "getCommentByID", Nil,"GET", """""", Routes.prefix + """comment/getCommentByID"""))
   }
}
        

// @LINE:75
case controllers_Assets_at46(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     