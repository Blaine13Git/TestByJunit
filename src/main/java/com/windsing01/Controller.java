package com.windsing01;

public interface Controller {
    /**
     * 把请求分发给相应的requestHandler，并返回处理器的response
     *
     * @param request
     * @return
     */
    Response processRequest(Request request);

    /**
     * 对controller的扩展
     *
     * @param request
     * @param requestHandler
     */
    void addHandler(Request request, RequestHandler requestHandler);
}
