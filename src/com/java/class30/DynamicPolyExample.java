package com.java.class30;

import java.util.Scanner;

class Browser {
    void openWebsite() {
        System.out.println("Opening website");
    }
    void doLogin() {
        System.out.println("Logging in");
    }
    void logout() {
        System.out.println("logging out");
    }
}
class Chrome extends Browser {
    void openWebsite() {
        System.out.println("Opening website in chrome");
    }
}
class FireFox extends Browser {
    void openWebsite() {
        System.out.println("Opening website in firefox");
    }
}
class Mozilla extends Browser{
    void openWebsite() {
        System.out.println("Opening website in Mozilla");
    }
}
public class DynamicPolyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter browser");
        String browser = input.next();

        Browser br;

        if (browser.equals("chrome")) {
            br = new Chrome();
        } else if (browser.equals("firefox")) {
            br = new FireFox();
        } else if (browser.equals("mozilla")) {
            br = new Mozilla();
        } else {
            throw new RuntimeException("Invalid browser specified");
        }
       br.openWebsite();
       br.doLogin();
       br.logout();
    }
}