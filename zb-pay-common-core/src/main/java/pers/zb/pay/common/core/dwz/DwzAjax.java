/*
 * ====================================================================
 * 【个人网站】：http://www.2b2b92b.com
 * 【网站源码】：http://git.oschina.net/zhoubang85/zb
 * 【技术论坛】：http://www.2b2b92b.cn
 * 【开源中国】：https://gitee.com/zhoubang85
 *
 * 【支付-微信_支付宝_银联】技术QQ群：470414533
 * 【联系QQ】：842324724
 * 【联系Email】：842324724@qq.com
 * ====================================================================
 */
package pers.zb.pay.common.core.dwz;


/**
 * 封装DWZ框架ajax请求及响应的参数. .
 *
 * @author zhoubang
 * @date 2017年10月18日 13:42:42
 *
 */
public class DwzAjax {
    /**
     * Ajax请求的执行状态码.<br/>
     * statusCode:{ok:200, error:300, timeout:301}.<br/>
     * 200：成功，300：错误，301:请求超时.
     */
    private String statusCode;
    /**
     * Ajax提示消息.<br/>
     * message.
     */
    private String message;
    /**
     * navTabId. 服务器传回navTabId可以把那个navTab标记为reloadFlag=1.<br/>
     * 下次切换到那个navTab时会重新载入内容.
     */
    private String navTabId;
    /**
     * callbackType ajax请求回调类型. <br/>
     * callbackType如果是closeCurrent就会关闭当前tab选项,
     * 只有callbackType="forward"时需要forwardUrl值,以重定向到另一个URL.
     */
    private String callbackType;
    /**
     * 重定向URL. <br/>
     * forwardUrl.
     */
    private String forwardUrl;

    /**
     * @return the statusCode
     */
    public final String getStatusCode() {
        return statusCode;
    }

    /**
     * @param argStatusCode
     *            the statusCode to set
     */
    public final void setStatusCode(final String argStatusCode) {
        this.statusCode = argStatusCode;
    }

    /**
     * @return the message
     */
    public final String getMessage() {
        return message;
    }

    /**
     * @param argMessage
     *            the message to set
     */
    public final void setMessage(final String argMessage) {
        this.message = argMessage;
    }

    /**
     * @return the navTabId
     */
    public final String getNavTabId() {
        return navTabId;
    }

    /**
     * @param argNavTabId
     *            the navTabId to set
     */
    public final void setNavTabId(final String argNavTabId) {
        this.navTabId = argNavTabId;
    }

    /**
     * @return the callbackType
     */
    public final String getCallbackType() {
        return callbackType;
    }

    /**
     * @param argCallbackType
     *            the callbackType to set
     */
    public final void setCallbackType(final String argCallbackType) {
        this.callbackType = argCallbackType;
    }

    /**
     * @return the forwardUrl
     */
    public final String getForwardUrl() {
        return forwardUrl;
    }

    /**
     * @param argForwardUrl
     *            the forwardUrl to set
     */
    public final void setForwardUrl(final String argForwardUrl) {
        this.forwardUrl = argForwardUrl;
    }

}
