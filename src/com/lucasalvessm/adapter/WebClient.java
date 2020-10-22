package com.lucasalvessm.adapter;

public class WebClient {
    private WebRequester webRequester;

    public WebClient(WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    public void doWork() {
        Object object = makeObject();

        int status = webRequester.request(object);

        if (status == 200) {

            System.out.println("OK");

        } else {

            System.out.println("Not OK");

        }

        return;
    }

    private Object makeObject() {
        return null;
    }
}
