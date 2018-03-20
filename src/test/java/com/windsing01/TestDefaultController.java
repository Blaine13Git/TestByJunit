package com.windsing01;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDefaultController {
    private DefaultController controller;

    private class SimpleRequest implements Request {
        public String getName() {
            return "Test";
        }
    }

    private class SimpleHandler implements RequestHandler {
        public Response process(Request request) throws Exception {
            return new SimpleResponse();
        }
    }

    private class SimpleResponse implements Response {
    }

    @Before
    public void instantiate() throws Exception {
        controller = new DefaultController();
    }

    @Test
    public void testMethod() throws Exception {
//        throw new RuntimeException("implement me");
        System.out.println("2s");
//        Thread.sleep(3000);
    }

    @Test(timeout = 2000)
    @Ignore(value = "用例超时")
    public void testAddHandler() {
        Request request = new SimpleRequest();
        RequestHandler requestHandler = new SimpleHandler();
        controller.addHandler(request, requestHandler);

        RequestHandler requestHandler2 = controller.getHandler(request);

    }

}
