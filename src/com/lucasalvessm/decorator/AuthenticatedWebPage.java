package com.lucasalvessm.decorator;

public class AuthenticatedWebPage extends WebPageDecorator {

    public AuthenticatedWebPage(WebPage webpage) {
        super(webpage);
    }

    public void authenticateUser() {
        System.out.println("Authenticating user");
    }

    public void display() {
        super.display();
        this.authenticateUser();
    }
}
