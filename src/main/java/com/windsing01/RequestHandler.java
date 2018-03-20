package com.windsing01;

public interface RequestHandler {
    Response process(Request request) throws Exception;
}
