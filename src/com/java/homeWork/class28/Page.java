package com.java.homeWork.class28;
/*Task 1:
        Create a class called Page & have 2 methods loadPage() & isPageLoaded()
        Create a no argument Constructor in the Page class & print message in the Constructor
        Create a child class called LoginPage that extends Page class
Create methods - doLogin(), logout() in the LoginPage
        Create a child class HomePage that extends Page class
Create methods - openHomePage(), verifyLogo() in the HomePage
        Create MainClass
        Create an object of LoginPage and call method doLogin() and logout()
        Create an object of HomePage and call method openHomePage(), verifyLogo()*/
public class Page {
    void loadPage(){
        System.out.println("Parent class load page");
    }
    void isPageLoaded(){
        System.out.println("Parent class Page Loaded");
    }
    Page(){
        System.out.println("It is Page Constructor");
    }

    public static void main(String[] args) {

        LoginPage login = new LoginPage();
        login.isPageLoaded();
        login.loadPage();
        login.doLogin();
        login.logout();


        HomePage page = new HomePage();
        page.loadPage();
        page.isPageLoaded();
        page.openHomePage();
        page.verifyLogo();
    }
}
class LoginPage extends Page {
    void doLogin(){
        System.out.println("Child class Log in");
    }
    void logout(){
        System.out.println("Child class Log out");
    }
}
class HomePage extends Page{
    void openHomePage(){
        System.out.println("Child class Open Home page");
    }
    void verifyLogo(){
        System.out.println("Child class Verify logo");
    }
}
